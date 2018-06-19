package com.ellisdeclercq.mei;

public class Fibonacci {
    public static void main(String[] args) {
        /*int i = 0;
        int max = 7;

        while (i <= max) {
            int power = (int)Math.pow(2, i);

            for(int j = 0; j < i; j++) {
                System.out.print((int)Math.pow(2, j) + " ");
            }
            System.out.println(power);

            for (int k = i - 1; k >= 0; k-- ) {
                System.out.println((int)Math.pow(2, k) + " ");
            System.out.println();
                System.out.println(power);
            i++;
        }
    }
}
*/

 int n = 20;

 int a = 0, b = 1;
 for (int i = 1; i <= n; i++){
     int som = a + b;
     a = b;
     b = som;
     System.out.println(som);


 }

 }

}
