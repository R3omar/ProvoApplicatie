package com.re0mar.ooad;

import com.re0mar.ooad.antwoorden.meerkeuzeAntwoord;
import com.re0mar.ooad.vragen.Vraag;
import com.re0mar.ooad.vragen.meerkeuzeVraag;

import java.util.ArrayList;
import java.util.Scanner;

public class KennisToets {

    private ArrayList<Vraag> vragenSet = new ArrayList<>();

    public KennisToets() {
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(1), "Wat is A", 6, new String[]{"A: b", "B: c", "C: 0", "D: A"}));
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(1), "vraag2", 888, new String[]{"A: b", "B: c", "C: 0", "D: A"}));
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(1), "vraag3", 777, new String[]{"A: b", "B: c", "C: 0", "D: A"}));
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(1), "vraag4", 666, new String[]{"A: b", "B: c", "C: 0", "D: A"}));
        vragenSet.add(new meerkeuzeVraag(new meerkeuzeAntwoord(1), "vraag5", 555, new String[]{"A: b", "B: c", "C: 0", "D: A"}));

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
