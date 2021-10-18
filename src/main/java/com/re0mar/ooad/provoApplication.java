package com.re0mar.ooad;

import java.util.Scanner;

public class provoApplication {

    private static KennisToets toets = new KennisToets();


    public static void main(String[] args) {
        //noinspection InfiniteLoopStatement
        while(true) {
            toets.doeKennisToets();
        }
    }

}
