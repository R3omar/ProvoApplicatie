package com.re0mar.ooad.vragen;

import com.re0mar.ooad.antwoorden.IAntwoord;

import java.lang.constant.Constable;

public class meerkeuzeVraag extends Vraag{

    private String[] opties;

    public meerkeuzeVraag(IAntwoord antwoord, String vraag, int punten, String[] opties) {
        super(antwoord, vraag, punten);
        this.opties = opties;
    }

    @Override
    public String getVraag() {
        StringBuilder response = new StringBuilder(super.vraag);

        for (String s: opties) {
            response.append("\n");
            response.append(s);
        }

        response.append("\n\n");
        response.append("Antwoord:");

        return response.toString();
    }

    @Override
    public boolean checkAntwoord(String input) {
        return antwoord.checkAntwoord(input);
    }

}
