package com.re0mar.ooad;

import com.re0mar.ooad.taal.Nederlands;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class provoApplication {

    private static ArrayList<KennisToets> toetsen = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        toetsen.add(new KennisToets(new Nederlands(), "STE23", "ToetsA"));
        toetsen.add(new KennisToets(new Nederlands(), "TER45", "ToetsB"));
        toetsen.add(new KennisToets(new Nederlands(), "UIS12", "ToetsC"));

        System.out.println("Welkom bij Provo, om een toets te maken voer een toetscode in");
        System.out.println("Om alle aanwezige toetsen te zien voer ? in");

        if(Objects.equals(sc.next(), "?")) {
            for (KennisToets toets: toetsen) {
                System.out.println(toets.getInfo());
            }
        }



        //noinspection InfiniteLoopStatement
        while (true) {
            for (KennisToets toets : toetsen) {
                if (Objects.equals(sc.next(), toets.getCode())) {
                    System.out.println("Toets gevonden, toets selecteren? y/n ");
                    if (Objects.equals(sc.next(), "y")) toets.doeKennisToets();
                    else System.out.println("Voer een AUB een andere toetscode in:");
                }
            }
        }
    }
}
