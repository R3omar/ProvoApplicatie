package com.re0mar.ooad.vragen;

import com.re0mar.ooad.antwoorden.IAntwoord;

public abstract class Vraag {

    protected IAntwoord antwoord;
    protected String vraag;
    protected int punten;

    public Vraag(IAntwoord antwoord, String vraag, int punten) {
        this.antwoord = antwoord;
        this.vraag = vraag;
        this.punten = punten;
    }

    public boolean checkAntwoord(String antwoord) {
        return true;
    }

    public IAntwoord getAntwoord() {
        return antwoord;
    }

    public String getVraag() {
        return vraag;
    }

    public int getPunten() {
        return punten;
    }
}
