package com.ellisdeclercq.mei;

public class ArrayLes1 {
    public static void main(String[] args) {
        int z = 5; // scalar of variable


        int[] j = {1, 2, 5, 7, 9, -6, 12, 5, 6, 9};
        System.out.println(j.length);

        int getal = j[2];
        System.out.println(getal);

        for (int a = 0; a < j.length; a++) {
            int b = j[a];
            System.out.println(b);
        }

        String [] namen = {"Ellis", "Charlotte", "Nathalie", "Johanna", "Anke"};
        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }

        for (String naam : namen) {
            System.out.println(naam);
        }

    }

}