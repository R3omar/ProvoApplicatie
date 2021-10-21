package com.re0mar.ooad;

import com.re0mar.ooad.vragen.Vraag;

public class GesteldeVraag {
    private Vraag vraag;
    private StudentAntwoord antwoord;

    public GesteldeVraag(Vraag vraag) {
        this.vraag = vraag;
    }

    public Vraag getVraag() {
        return vraag;
    }

    public void setAntwoord(StudentAntwoord antwoord) {
        this.antwoord = antwoord;
    }
}
