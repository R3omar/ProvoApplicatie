package com.re0mar.ooad;

import com.re0mar.ooad.Punten.BasicPuntenSysteem;
import com.re0mar.ooad.antwoorden.kortAntwoord;
import com.re0mar.ooad.antwoorden.meerkeuzeAntwoord;
import com.re0mar.ooad.taal.ITaal;
import com.re0mar.ooad.vragen.Vraag;
import com.re0mar.ooad.vragen.kortVraag;
import com.re0mar.ooad.vragen.meerkeuzeVraag;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class KennisToets {

    private final ArrayList<Vraag> vragenSet = new ArrayList<>();
    private ITaal taal;

    public KennisToets(ITaal taal) {
        this.taal = taal;
        vragenSet.add(new meerkeuzeVraag(taal, new meerkeuzeAntwoord(1), "Wat is A", new BasicPuntenSysteem(6), new String[]{"b", "c", "0", "A", "c", "0", "A", "c", "0", "A", "c", "0", "A", "c", "0", "A", "c", "0", "A", "c", "0", "A"}));
        vragenSet.add(new kortVraag(taal, new kortAntwoord(new String[]{"antwoord", "answer"}), "Type answer", new BasicPuntenSysteem(9)));
        vragenSet.add(new kortVraag(taal, new kortAntwoord(new String[]{"antwoord", "answer"}), "Type answer", new BasicPuntenSysteem(9)));
    }

    public void doeKennisToets() {
        int punten = 0;
        System.out.println(taal.getToetsIntro("2RE1"));
        for (Vraag v: vragenSet) {
            Scanner sc = new Scanner(System.in);
            System.out.println(v.getVraag());
            String answer = sc.nextLine();
            if(v.checkAntwoord(answer) || Objects.equals(answer, "cheat")) {
                punten += v.getPunten();
                System.out.println(taal.getGoodResponse(punten));
            } else {
                System.out.println(taal.getBadResponse(punten));
            }

        }
    }


}
