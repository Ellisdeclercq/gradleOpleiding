package com.ellisdeclercq.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Versie2 {
    public static void main(String[] args) {
        int a = Versie2.getalVoorzien();
        int b = Versie2.getalVoorzien();

        System.out.println(a + "+" + b);
    }








    public static int getalVoorzien()
    {

        boolean isNotNummer = true;

        Scanner s = new Scanner(System.in);

        int a = 0;

        while (isNotNummer) {
            try {
                System.out.println("geef je getal in\n");
                a = s.nextInt();
                isNotNummer = false;
            } catch (InputMismatchException e) {
                s.nextLine();
                e.getMessage();
                System.out.println("foute invoer");
            }
        }       return a;
    }

}
