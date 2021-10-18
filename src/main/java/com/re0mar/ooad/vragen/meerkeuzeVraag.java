package com.re0mar.ooad.vragen;

import com.re0mar.ooad.Punten.IPuntenSysteem;
import com.re0mar.ooad.antwoorden.IAntwoord;

import java.lang.constant.Constable;

public class meerkeuzeVraag extends Vraag{

    private String[] opties;

    public meerkeuzeVraag(IAntwoord antwoord, String vraag, IPuntenSysteem punten, String[] opties) {
        super(antwoord, vraag, punten);
        this.opties = opties;
    }

    @Override
    public String getVraag() {
        StringBuilder response = new StringBuilder(super.vraag);

        for (int i=0; i< opties.length; i++) {
            response.append("\n");
            response.append(i);
            response.append(". ");
            response.append(opties[i]);
        }

        response.append("\n\n");
        response.append("Nummer van correcte optie:");

        return response.toString();
    }

    @Override
    public boolean checkAntwoord(String input) {
        return antwoord.checkAntwoord(input);
    }

}
