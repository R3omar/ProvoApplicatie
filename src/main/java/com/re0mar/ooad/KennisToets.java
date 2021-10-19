package com.re0mar.ooad;

import com.re0mar.ooad.Punten.BasicPuntenSysteem;
import com.re0mar.ooad.antwoorden.*;
import com.re0mar.ooad.taal.ITaal;
import com.re0mar.ooad.vragen.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class KennisToets {

    private final ArrayList<Vraag> vragenSet;
    private final ITaal taal;
    private final String code;
    private final String naam;

    public KennisToets(ITaal taal, String code, String naam, ArrayList<Vraag> vragen) {
        this.taal = taal;
        this.code = code;
        this.naam = naam;
        this.vragenSet = vragen;
        }

    public void doeKennisToets() {
        int punten = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(taal.getToetsIntro(code));
        if (Objects.equals(sc.next(), "start")) {
            for (Vraag v : vragenSet) {
                System.out.println(v.getVraag());
                String answer = sc.nextLine();
                if (v.checkAntwoord(answer) || Objects.equals(answer, "cheat")) {
                    punten += v.getPunten();
                    System.out.println(taal.getGoodResponse(punten));
                } else {
                    System.out.println(taal.getBadResponse(punten));
                }
            }
        }
    }

    public String getInfo() {
        return taal.getTestInfo(naam, code);
    }

    public String getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }
}
