package com.ellisdeclercq.spel;

import java.util.Scanner;

public class HogerLager {

    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        System.out.println("Welkom bij Hoger Lager!\nOp de tafel ligt een kaart (waarde " + min + " t.e.m. " + max +")." +
                "\nJij moet raden of de volgende willekeurig getrokken kaart hoger (1) of lager (0) zal zijn");
        System.out.println("Als je juist raadt, mag je verder spelen met de nieuwe" +
                " kaart.\nVeel succes!");

        Scanner s = new Scanner(System.in);
        boolean goebezig = true;


        int eerste = RandomNumber.maakRandom(min, max);
        int tweede;

        while (goebezig) {
            System.out.println("Het getal is " + eerste + ". \nIs het volgende lager (0) of hoger (1) ?");
            int gok = s.nextInt();

            tweede = RandomNumber.maakRandom(min, max);

            while (eerste == tweede) {
                tweede = RandomNumber.maakRandom(min, max);
            }

            if (eerste > tweede && gok == 0 || eerste < tweede && gok == 1) {
                eerste = tweede;
                tweede = RandomNumber.maakRandom(min, max);

            } else goebezig = false;
            if (!goebezig) {
                System.out.println("Dat is jammer genoeg niet correct.\nHet volgende cijfer was "+ tweede + ".");
        }

        }

    }
}