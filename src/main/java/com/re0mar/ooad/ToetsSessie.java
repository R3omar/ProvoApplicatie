package com.re0mar.ooad;

import com.re0mar.ooad.vragen.Vraag;

public class ToetsSessie {
    private KennisToets toets;

    private int startTijd;
    private int duur;

    public ToetsSessie(KennisToets toets, int startTijd, int duur) {
        this.toets = toets;
        this.startTijd = startTijd;
        this.duur = duur;
    }

    public Vraag getVraag(int nr) {
        return toets.getVraag(nr);
    }

    public KennisToets getToets() {
        return toets;
    }
}
