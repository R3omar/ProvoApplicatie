package com.re0mar.ooad;

import com.re0mar.ooad.Punten.*;
import com.re0mar.ooad.antwoorden.*;
import com.re0mar.ooad.taal.Nederlands;
import com.re0mar.ooad.vragen.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class provoApplication {
    private static ArrayList<Vraag> vragenSet = new ArrayList<>();

    private static StudentController studentController;

    public static void main(String[] args) {
        vragenSet.add(new meerkeuzeVraag(new Nederlands(), new meerkeuzeAntwoord(1), "Wat is A", new BasicPuntenSysteem(6), new String[]{"b", "c", "0", "A", "c"}));
        vragenSet.add(new kortVraag(new Nederlands(), new kortAntwoord(new String[]{"antwoord", "answer"}), "Type answer", new BasicPuntenSysteem(9)));
        vragenSet.add(new kortVraag(new Nederlands(), new kortAntwoord(new String[]{"antwoord", "answer"}), "Type answer", new BasicPuntenSysteem(9)));
        vragenSet.add(new meerkeuzeVraag(new Nederlands(), new meerkeuzeAntwoord(1), "Wat is A", new BasicPuntenSysteem(6), new String[]{"b", "c", "0", "A", "c"}));

        studentController = new StudentController();

        Scanner sc = new Scanner(System.in);

        boolean toetsActief;
        int toetsLengte;
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("Welkom bij provo, geef aub een naam in");
            if (sc.hasNext()) {
                String naam = sc.next();
                System.out.println(studentController.neemDeelAanToets(naam, new Lokaal(new ToetsSessie(new KennisToets(new Nederlands(), "STE23", "ToetsA", vragenSet), 0, 0))));
                toetsLengte = studentController.getToetsLength();
                toetsActief = true;

                for (int i = 0; i < toetsLengte; i++) {
                    System.out.println("\n");
                    System.out.println(studentController.getVraag(i));
                    if (sc.hasNext()) {
                        studentController.beantwoordVraag(i, sc.next());
                    }
                }

                while (toetsActief) {
                    System.out.println("\n");
                    System.out.println(studentController.getEindeToets());
                    if (sc.hasNext()) {
                        String res = sc.next();
                        if (Objects.equals(res, naam)) {
                            System.out.println(studentController.beeindigToets());
                            toetsActief = false;
                        } else if (Integer.parseInt(res) <= toetsLengte) {
                            System.out.println("\n");
                            System.out.println(studentController.getVraag(Integer.parseInt(res) - 1));
                            if (sc.hasNext()) {
                                studentController.beantwoordVraag(Integer.parseInt(res) - 1, sc.next());
                            }
                        }
                    }
                }
            }
        }
    }
}
