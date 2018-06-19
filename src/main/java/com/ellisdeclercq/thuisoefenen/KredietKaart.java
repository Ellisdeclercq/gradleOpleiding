package com.ellisdeclercq.thuisoefenen;

import java.util.Scanner;

public class KredietKaart {
    public static void main(String[] args) {
        System.out.println("Please enter your creditcard number");
        Scanner s = new Scanner(System.in);
        String kaartnummer = s.next();







        System.out.println(sumDigits(5));
    }




    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


















}
