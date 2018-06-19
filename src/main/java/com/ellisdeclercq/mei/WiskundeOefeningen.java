package com.ellisdeclercq.mei;

public class WiskundeOefeningen {
    public static void main(String[] args) {
        double straal = 10;
        double oppervlakte = (Math.sqrt(Math.PI) * straal);
        double omtrek = 2 * Math.PI * straal;
        double x = 5;
        double a = 3;
        double functieY = 2 * x + Math.sin(straal/3);
        double functieZ = (a + (3 * Math.sqrt(x))) / 2;
        double n = 8;
        double functieX = (2 * (Math.log10(n)))/Math.sqrt(n);
        double g = 6.67e-11;
        int m1 = 4;
        int m2 = 9;
        double functieF = g * ((m1 * m2) /(Math.pow(straal,2)));

        System.out.println("de oppervlakte is " + oppervlakte);
        System.out.println("de omtrek is " + omtrek);
        System.out.println("functie y is " + functieY);
        System.out.println("functie z is " + functieZ);
        System.out.println("functie x is " + functieX);
        System.out.println("functie f is " +functieF);


    }
}
