package com.ellisdeclercq.mei;

public class FizzBuzz {

    public static void main(String[] args) {

        if(args.length > 0){
            System.out.println("welcome " + args[0]);
        }
        System.out.println("je bent nu in het programma FizzBuzz");

        int a = 3;
        int b = 5;

        for (int getal = 1; getal <= 100; getal++) {
            if (getal % (a * b) == 0) {
                System.out.println("FizzBuzz");
            } else {

                if (getal % a == 0) {
                    System.out.println("Fizz");
                } else if (getal % b == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(getal);
                }
            }

        }

    }

}

