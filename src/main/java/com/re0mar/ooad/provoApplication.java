package com.re0mar.ooad;

import com.re0mar.ooad.taal.Nederlands;

import java.util.Scanner;

public class provoApplication {

    private static KennisToets toets = new KennisToets(new Nederlands());

    public static void main(String[] args) {
        //noinspection InfiniteLoopStatement
        while(true) {
            toets.doeKennisToets();
        }
    }

}
