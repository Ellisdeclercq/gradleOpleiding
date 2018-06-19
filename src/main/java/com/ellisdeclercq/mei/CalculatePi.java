package com.ellisdeclercq.mei;

public class CalculatePi {
    public static void main(String[] args) {
        int limit = 10;
        int teken = 1;
        double som = 0;
        for(int i = 1; i <= limit; i = i + 2) {
            double term = (1/ (double) i) * teken;

            teken = teken * -1;
            som = som + term;
        }
        double pi = 4 * som;
        System.out.println(pi);
    }
}
