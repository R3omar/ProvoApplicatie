package com.re0mar.ooad.vragen;

import com.re0mar.ooad.Punten.IPuntenSysteem;
import com.re0mar.ooad.antwoorden.IAntwoord;
import com.re0mar.ooad.taal.ITaal;

public class kortVraag extends Vraag{

    public kortVraag(ITaal taal, IAntwoord antwoord, String vraag, IPuntenSysteem punten) {
        super(taal, antwoord, vraag, punten);
    }

    @Override
    public String getVraag() {
        return vraag + taal.getKortAntwoordText();
    }

    @Override
    public boolean checkAntwoord(String input) {
        return antwoord.checkAntwoord(input);
    }
}
