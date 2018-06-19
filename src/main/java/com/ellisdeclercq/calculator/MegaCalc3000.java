package com.ellisdeclercq.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MegaCalc3000 {

    public static void main(String[] args) {
        boolean rekenen = true;
        while (rekenen) {

            int a = MegaCalc3000.getalVoorzien();
            int b = MegaCalc3000.getalVoorzien();

            System.out.println("Kies tussen: maal, plus, min, over");
            Scanner s = new Scanner(System.in);
            boolean isNotOK = true;
            Reken keuze = null;
            while (isNotOK) {
                try {
                    String val = s.nextLine().toUpperCase();
                    keuze = Reken.valueOf(val);
                    isNotOK = false;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println("foute invoer");
                }
            }

            int resultaat = 0;
            System.out.println(keuze);

            try {
                switch (keuze) {
                    case PLUS:
                        resultaat = a + b;
                        break;
                    case MIN:
                        resultaat = a - b;
                        break;
                    case MAAL:
                        resultaat = a * b;
                        break;
                    case OVER:
                        resultaat = a / b;
                        break;
                }
                System.out.println("dit is je uitkomst: " + resultaat);
                rekenen = false;

            } catch (ArithmeticException e) {
                System.out.println("een getal delen door 0 is niet mogelijk");
                System.out.println("probeer opnieuw");
                e.getMessage();
                rekenen = true;
            }

        }

    }

    private static int getalVoorzien() {
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
        }
        return a;
    }
}