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

        //noinspection InfiniteLoopStatement
        while (true) {
            if (sc.hasNext()) {
                studentController.neemDeelAanToets(sc.next(), new Lokaal(new ToetsSessie(new KennisToets(new Nederlands(), "STE23", "ToetsA", vragenSet), 0, 0)));
            }

        }
    }
}
