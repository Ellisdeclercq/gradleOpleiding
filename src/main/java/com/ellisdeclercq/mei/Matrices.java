package com.ellisdeclercq.mei;

public class Matrices {
    public static void main(String[] args) {
        int[] [] a = {
                {1, 2, 0},
                {2, 3, 4},

        };
        int [] [] b = {
                {1, 2},
                {3, 2},
                {1, 4},
        };

        int [] [] c = mul(a, b);
        print(c);
    }

    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.println(cell + "\t");

            }
            System.out.println();

            }

        }





    public static int[][] mul(int[][] a, int[][] b) {
        if (a [0].length == b.length) {
            System.out.println(b.length);
            System.out.println("OK");
        } else {
            return null;
        }
        int[] [] p = new int[a.length][b[0].length];

        return p;
    }
}
