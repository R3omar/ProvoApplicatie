package com.re0mar.ooad;

import java.util.ArrayList;
import java.util.Objects;

public class Docent {
    private final ArrayList<KennisToets> toetsen = new ArrayList<>();

    public KennisToets getToets(String naam) {
        for (KennisToets toets: toetsen) {
            if(Objects.equals(toets.getNaam(), naam)) {
                return toets;
            }
        }
        return null;
    }

    public ArrayList<KennisToets> getToetsen() {
        return toetsen;
    }
}
