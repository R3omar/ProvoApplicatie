package com.re0mar.ooad;

import com.re0mar.ooad.Punten.BasicPuntenSysteem;
import com.re0mar.ooad.antwoorden.kortAntwoord;
import com.re0mar.ooad.antwoorden.meerkeuzeAntwoord;
import com.re0mar.ooad.taal.Nederlands;
import com.re0mar.ooad.vragen.Vraag;
import com.re0mar.ooad.vragen.kortVraag;
import com.re0mar.ooad.vragen.meerkeuzeVraag;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class provoApplication {

    private static final ArrayList<KennisToets> toetsen = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Vraag> vragenSet = new ArrayList<>();
        vragenSet.add(new meerkeuzeVraag(new Nederlands(), new meerkeuzeAntwoord(1), "Wat is A", new BasicPuntenSysteem(6), new String[]{"b", "c", "0", "A", "c"}));
        vragenSet.add(new kortVraag(new Nederlands(), new kortAntwoord(new String[]{"antwoord", "answer"}), "Type answer", new BasicPuntenSysteem(9)));
        vragenSet.add(new kortVraag(new Nederlands(), new kortAntwoord(new String[]{"antwoord", "answer"}), "Type answer", new BasicPuntenSysteem(9)));

        toetsen.add(new KennisToets(new Nederlands(), "STE23", "ToetsA", vragenSet));
        toetsen.add(new KennisToets(new Nederlands(), "TER45", "ToetsB", vragenSet));
        toetsen.add(new KennisToets(new Nederlands(), "UIS12", "ToetsC", vragenSet));

        System.out.println("Welkom bij Provo, om een toets te maken voer een toetscode in");
        System.out.println("Om alle aanwezige toetsen te zien voer ? in");

        if(Objects.equals(sc.next(), "?")) {
            for (KennisToets toets: toetsen) {
                System.out.println(toets.getInfo());
            }
        }

        //noinspection InfiniteLoopStatement
        while (true) {
            for (KennisToets toets : toetsen) {
                if (Objects.equals(sc.next(), toets.getCode())) {
                    System.out.println("Toets " + toets.getNaam() + " gevonden, toets selecteren? y/n ");
                    if (Objects.equals(sc.next(), "y")) toets.doeKennisToets();
                    else System.out.println("Voer een AUB een andere toetscode in:");
                }
            }
        }
    }
}
