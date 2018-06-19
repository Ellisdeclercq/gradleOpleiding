package com.ellisdeclercq.mei;

public class Product1ToN {
    public static void main(String[] args) {
        int product = 2;
        int max = 10;
        int cijfer = 2;

        while (cijfer <= max){
            cijfer = product * cijfer;
            product++; cijfer++;

        }
        System.out.println("het product is " + product);
    }
}
