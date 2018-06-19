package com.ellisdeclercq;

import java.text.DecimalFormat;
import java.text.ParseException;

public class ExceptionDemo {

    public static void main(String[] args) {


        DecimalFormat a = new DecimalFormat("#,##0.00 €");

        double input = 1525.6878;

        System.out.println(a.format(input));

        String b = "1.368,48";


        try {
            double j = (double) a.parse("6,547.68 €");
            System.out.println(j);
        } catch (ParseException e) {

        }




    }

}