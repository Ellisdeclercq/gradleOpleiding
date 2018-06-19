package com.ellisdeclercq.thuisoefenen;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
       int[] cijfers = {1254,6568, 5468, 1698, 1056, 7359, 1568, 6578};
       String[] woorden = {"hallo","mooie","bloem","beter","chocolade"};

        System.out.println("Originele cijfers : " +Arrays.toString(cijfers));
        Arrays.sort(cijfers);
        System.out.println("Gesorteerde cijfers : "+ Arrays.toString(cijfers));

        System.out.println("Originele woorden : " +Arrays.toString(woorden));
        Arrays.sort(woorden);
        System.out.println("Gesorteerde woorden : " +Arrays.toString(woorden));

    }
}
