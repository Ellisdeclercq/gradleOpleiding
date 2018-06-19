package com.ellisdeclercq.thuisoefenen;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
       int[] values = new int [5];
       int total = 2;

       for(int i = 0; i < values.length; i++) {
           total = values[i] + total;
           System.out.println(total);
       }
        System.out.println(Arrays.toString(values));
    }
}
