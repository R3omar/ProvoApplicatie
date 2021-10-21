package com.re0mar.ooad;

public class Lokaal {
    private ToetsSessie toets;

    public Lokaal(ToetsSessie toets) {
        this.toets = toets;
    }

    public ToetsSessie getToets() {
        return toets;
    }
}
