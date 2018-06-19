package com.ellisdeclercq.mei;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int winnendGetal = RandomNumber.berekenRandomGetal(min, max);


        Scanner s = new Scanner(System.in);

        System.out.println("Geef een getal in tussen " + min + " en " + max);
        int gok1 = s.nextInt();

        if (gok1 == winnendGetal) {
            System.out.println("Hoera je hebt gewonnen vanaf de eerste poging");
        } else {
            System.out.println("Dit was fout, je krijgt een tweede poging");
            int gok2 = s.nextInt();
            if (gok2 == winnendGetal) {
                System.out.println("Hoera je hebt gewonnen bij je tweede poging");
            } else {
                System.out.println("Dit was weer fout, je krijgt een laatste kans");
                int gok3 = s.nextInt();
                if (gok3 == winnendGetal) {
                    System.out.println("Je laatste poging was juist, proficiat!");
                } else {
                    System.out.println("Al je pogingen waren fout, je hebt verloren");
                }
            }


        }
    }

}
