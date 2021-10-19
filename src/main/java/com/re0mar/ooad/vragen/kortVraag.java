package com.re0mar.ooad.vragen;

import com.re0mar.ooad.Punten.IPuntenSysteem;
import com.re0mar.ooad.antwoorden.IAntwoord;

public class kortVraag extends Vraag{


    public kortVraag(IAntwoord antwoord, String vraag, IPuntenSysteem punten) {
        super(antwoord, vraag, punten);
    }

    @Override
    public String getVraag() {

        return vraag + "\n" +
                "Antwoord, max 255 tekens:";
    }

    @Override
    public boolean checkAntwoord(String input) {
        return antwoord.checkAntwoord(input);
    }
}
