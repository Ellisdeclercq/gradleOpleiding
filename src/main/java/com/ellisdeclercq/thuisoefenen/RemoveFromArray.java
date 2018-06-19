package com.ellisdeclercq.thuisoefenen;

import java.util.Arrays;

public class RemoveFromArray {
    public static void main(String[] args) {
        int[] my_array = {25, 14,56,15,36,77,18,29,49};

        System.out.println("original Array : " +Arrays.toString(my_array));

        int removeIndex = 1;

        for(int i = removeIndex; i < my_array.length -1; i++) {
            my_array[i] = my_array[i+1];
        }
    }
}
