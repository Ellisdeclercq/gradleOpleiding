package com.ellisdeclercq.thuisoefenen;

import java.util.Scanner;

public class Schrikkeljaar {
    public static void main(String[] args) {

        System.out.println("geef een jaartal in om te weten of het al dan niet een schrikkeljaar is");
        Scanner in = new Scanner(System.in);
        int jaartal = in.nextInt();

        boolean x = (jaartal % 4) == 0;
        boolean y = (jaartal % 100) != 0;
        boolean z = ((jaartal % 400) == 0) && ((jaartal % 100) == 0);

        if (x && ((y || z))) {
            System.out.println(jaartal + " is een schrikkeljaar");

        } else {
            System.out.println(jaartal + " is een normaal jaar");
        }
    }

}
