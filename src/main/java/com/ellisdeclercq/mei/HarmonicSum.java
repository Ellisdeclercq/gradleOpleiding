package com.ellisdeclercq.mei;

public class HarmonicSum {
    public static void main(String[] args) {
        int maxDenomninator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;

        for(int denominator = 1; denominator <= maxDenomninator; ++denominator){
            sumL2R = sumL2R + ( (float)1 / denominator);
        }
        System.out.println(sumL2R);
    }
}
