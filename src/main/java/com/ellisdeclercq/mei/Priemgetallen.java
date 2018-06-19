package com.ellisdeclercq.mei;

import java.util.Scanner;

public class Priemgetallen {
    public static void main(String[] args) {
        // Input


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter min: ");
        int min = scanner.nextInt();
        System.out.print("Enter max: ");
        int max = scanner.nextInt();

        if(min < 0 || max < 0) {
            throw new IllegalArgumentException("Only positive numbers please");
        }

        for (int i = 0; i < 100; i++) {
            // AnonymousInnerClass
            int r = calculateRandomNumber(min, max);
            boolean randomIsPrime = isPrime(r);

            // Print
            if (randomIsPrime) {
                System.out.println(r + " is a prime number.");
            } else {
                System.out.println(r + " is not a prime number.");
            }
        }
    }

    public static int calculateRandomNumber(int min, int max) {
        return (int) (min + (max - min + 1) * Math.random());
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number/2; i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;







    }
}
