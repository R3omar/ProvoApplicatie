package com.re0mar.ooad;

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
            //ToDo Add some sort of timer system for more complex point systems
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

    public String getWelkom(String naam) {return taal.getWelkom(naam); }

    public int getToetsLenght() {return vragenSet.size();}

    public String getEinde() {return taal.getEnd();}

    public String getSafeMessage() {return taal.getSafe();}

    public String getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }

    public Vraag getVraag(int nr) {
        return vragenSet.get(nr);
    }
}
