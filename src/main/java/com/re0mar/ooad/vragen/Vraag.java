package com.re0mar.ooad.vragen;

import com.re0mar.ooad.Punten.IPuntenSysteem;
import com.re0mar.ooad.antwoorden.IAntwoord;

public abstract class Vraag {

    protected IAntwoord antwoord;
    protected String vraag;
    protected IPuntenSysteem punten;

    public Vraag(IAntwoord antwoord, String vraag, IPuntenSysteem punten) {
        this.antwoord = antwoord;
        this.vraag = vraag;
        this.punten = punten;
    }

    public abstract boolean checkAntwoord(String input);

    public IAntwoord getAntwoord() {
        return antwoord;
    }

    public String getVraag() {
        return vraag;
    }

    public int getPunten() {
        return punten.berekenPunten();
    }
}
