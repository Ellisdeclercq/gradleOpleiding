package com.ellisdeclercq.mei;

public class EersteStatements {

    public static void main(String[] args) {

        /*int i = 1;
        int totaal = 0;

        while (i <= 100) {

         totaal = totaal + i;
         i = i + 1;
        }
        System.out.println(totaal);*/


        int total = 0;
        for (int i = 1; i <= 100; i = i + 1) {
            total += i ;
        }
        System.out.println(total);
    }
}
