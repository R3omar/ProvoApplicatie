package com.re0mar.ooad.antwoorden;

import java.util.Objects;

public class kortAntwoord implements IAntwoord{

    private String[] antwoordSet;

    public kortAntwoord(String[] antwoordSet) {
        this.antwoordSet = antwoordSet;
    }


    @Override
    public boolean checkAntwoord(String antwoord) {
        for (String s: antwoordSet) {
            if(Objects.equals(antwoord, s)) {
                return true;
            } else if(Objects.equals(antwoord, "cheat")) {
                return true;
            }
        }
        return false;
    }
}
