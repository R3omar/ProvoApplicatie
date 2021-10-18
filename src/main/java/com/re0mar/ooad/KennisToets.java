package com.re0mar.ooad;

import com.re0mar.ooad.antwoorden.meerkeuzeAntwoord;
import com.re0mar.ooad.vragen.Vraag;
import com.re0mar.ooad.vragen.meerkeuzeVraag;

import java.util.ArrayList;
import java.util.Scanner;

public class KennisToets {

    private ArrayList<Vraag> vragenSet = new ArrayList<>();

    public KennisToets() {
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(), "vraag1", 999));
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(), "vraag2", 888));
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(), "vraag3", 777));
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(), "vraag4", 666));
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(), "vraag5", 555));

    }

    public void doeKennisToets() {
        int punten = 0;
        System.out.println("Welkom bij kennistoets A34c");
        for (Vraag v: vragenSet) {
            Scanner sc = new Scanner(System.in);
            System.out.println(v.getVraag());
            String answer = sc.nextLine();
            if(v.checkAntwoord(answer)) {
                punten += v.getPunten();
                System.out.println("Goed geantwoord, huidig aantal punten: " + punten + "\n");
            } else {
                System.out.println("Fout geantwoord, huidig aantal punten: " + punten + "\n");
            }

        }
    }


}
