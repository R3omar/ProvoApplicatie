package com.re0mar.ooad.vragen;

import com.re0mar.ooad.Punten.IPuntenSysteem;
import com.re0mar.ooad.antwoorden.IAntwoord;
import com.re0mar.ooad.taal.ITaal;

import java.util.Random;

public class meerkeuzeVraag extends Vraag{

    private final String[] opties;

    public meerkeuzeVraag(ITaal taal, IAntwoord antwoord, String vraag, IPuntenSysteem punten, String[] opties) {
        super(taal, antwoord, vraag, punten);
        this.opties = opties;
    }

    @Override
    public String getVraag() {
        Random r = new Random();
        StringBuilder response = new StringBuilder(super.vraag);

        for (int i=0; i< opties.length; i++) {
            response.append("\n");
            response.append("\033[");
            response.append((r.nextInt(37 - 30) + 1) + 30);
            response.append("m");
            response.append(i);
            response.append(". ");
            response.append(opties[i]);
        }

        response.append("\033[0m");
        response.append(taal.getMeerkeuzeAntwoordText());
        return response.toString();
    }

    @Override
    public boolean checkAntwoord(String input) {
        return antwoord.checkAntwoord(input);
    }

}
