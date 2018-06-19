package com.ellisdeclercq.mei;

public class PrimeNumber {
    public static void main(String[] args) {
        int testgetal = 6;
        int deelgetal = testgetal;
        int count = 0;
        while (deelgetal > 0) {

            System.out.println("while loop"+deelgetal);
            if (testgetal % deelgetal == 0) {
                count++;
                System.out.println("if loop"+count);
            }
            deelgetal--;

        }
        if (count == 2) {
            System.out.println("Het is een priemgetal");
        } else {
            System.out.println("Het is geen priemgetal");
        }



        /*
        int n = 13;
        int kandidaat = 2;
        boolean isPriem = true;
        while (kandidaat < n) {
            int r = n % kandidaat;
            if (r == 0) ;
            {
                isPriem = false;
            }

        kandidaat++;
    }
    if(isPriem) {


        System.out.println("het is een priemgetal");
    } else {
        System.out.println("het is geen priemgetal");

    }

    */
    }
}






