package com.ellisdeclercq.spel;

public class RandomNumber {

    public static int maakRandom (int min, int max) {
        /* helper functie zelf gemaakt */
        int rand = (int) (min + (max - min + 1) * Math.random());
        return rand;
    }
}
