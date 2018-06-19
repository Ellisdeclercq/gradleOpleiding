package com.ellisdeclercq.mei;

import java.util.Arrays;

public class LottoGenerator {

    public static void main(String[] args) {

        int[] trekking = new int [6];
        int x = 0;
        for (int z = 0; z < trekking.length ; z++) {
            x = RandomNumber.berekenRandomGetal(1,45);
            trekking[z] = x;
        }


        System.out.println(x);
        for (int p = 0; p <trekking.length; p++) {
            System.out.println();
        }



        //System.out.println(x);
        //System.out.println(" " + trekking[0] + " " + trekking[1] + " " + trekking[2] + " " + trekking[3] + " " + trekking[4] + " " + trekking[5]);
    }
}
