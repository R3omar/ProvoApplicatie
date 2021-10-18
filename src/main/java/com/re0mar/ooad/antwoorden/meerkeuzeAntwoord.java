package com.re0mar.ooad.antwoorden;

public class meerkeuzeAntwoord implements IAntwoord{

    private int correctOptie;

    public meerkeuzeAntwoord(int correctOptie) {
        this.correctOptie = correctOptie;
    }

    public boolean checkAntwoord(String antwoord) {
        return Integer.parseInt(antwoord) == correctOptie;
    }
}
