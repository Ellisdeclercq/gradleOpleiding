package com.ellisdeclercq;

import java.util.Date;

public class Annotations extends Date{
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a);
        int i = -365;
        a.setDate(i);
        System.out.println(a);



    }
}
