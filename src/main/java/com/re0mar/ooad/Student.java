package com.re0mar.ooad;

import com.re0mar.ooad.vragen.Vraag;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String naam;
    private final ArrayList<GesteldeVraag> vragen = new ArrayList<>();

    public Student(String naam) {
        this.naam = naam;
    }

    public void voegAntwoordToe(Vraag vraag, StudentAntwoord antwoord) {
        for (GesteldeVraag v: vragen) {
            if(Objects.equals(v.getVraag().getVraag(), vraag.getVraag())) {
                v.setAntwoord(antwoord);
            }
        }
    }


}
