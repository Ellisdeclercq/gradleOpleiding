package com.ellisdeclercq.mei;

public class SumAndAverage {

    public static void main(String[] args) {
        int som = 0;
        int lowerbound = 1;
        int upperbound = 100;
        double number = lowerbound;
        int count = 0;
        int deler = 2;
        while (number % deler != 0) {
            do {
                som += number;
                ++number;
                ++count;
            }
            while (number <= upperbound);
        }


       /* for ( int nummer = lowerbound; nummer <= upperbound; nummer++ ){
            som += nummer;
        }*/
        double gemiddelde = (double) som / (double) upperbound;
        System.out.println("de som is " + som + "  en het gemiddelde is " + gemiddelde + " het aantal cijfers is " + count);

    }
}
