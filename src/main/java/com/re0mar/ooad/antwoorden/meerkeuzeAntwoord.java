package com.re0mar.ooad.antwoorden;

import static java.lang.Integer.parseInt;

public class meerkeuzeAntwoord implements IAntwoord{

    private int correctOptie;

    public meerkeuzeAntwoord(int correctOptie) {
        this.correctOptie = correctOptie;
    }

    public boolean checkAntwoord(String antwoord) {
        try {
            return parseInt(antwoord) == correctOptie;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}
