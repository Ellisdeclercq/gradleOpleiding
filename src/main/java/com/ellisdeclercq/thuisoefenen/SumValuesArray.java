package com.ellisdeclercq.thuisoefenen;

public class SumValuesArray {
    public static void main(String[] args) {
        int[] waarden = {154, 45, 95, 6, 554,456};
        int som = 0;
        for (int i = 0; i < waarden.length; i++) {
            int z = waarden[i];
            som = som + z;
        }System.out.println(som);
    }
}
