package com.re0mar.ooad.Punten;

public class BasicPuntenSysteem implements IPuntenSysteem {

    private int punten;

    public BasicPuntenSysteem(int punten) {
    this.punten = punten;
    }

    public int berekenPunten() {
        return punten;
    }
}
