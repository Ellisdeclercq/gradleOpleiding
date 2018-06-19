package com.ellisdeclercq.mei;

public class RandomNumber {


    public static void main(String[] args) {
        int r = RandomNumber.berekenRandomGetal(6, 12);

        System.out.println(r);

        boolean a = isPrimeNumber(r);

        if (a){
            System.out.println("het is een priemgetal");
        } else {
            System.out.println("het is geen priemgetal");
        }

        System.out.println(a);

    }

    public static int berekenRandomGetal(int min, int max) {// helper functie zelf gemaakt
        int rand = (int) (min + (max - min + 1) * Math.random());
        return rand;
    }

    public static boolean isPrimeNumber(int n) {

        int kandidaat = 2;
        boolean isPriem = true;
        while (kandidaat < n) {
            int r = n % kandidaat;
            if (r == 0) {
                isPriem = false;
            }
            kandidaat++;
        }
        return isPriem;
    }
}
