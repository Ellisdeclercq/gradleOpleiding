package com.ellisdeclercq.beehive;

import java.util.ArrayList;

public class eersteArrayList {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList();
        a.add("Jimi");
        a.add("Janis");
        a.add("Amy");
        a.add("Kurt");
        a.add("Jim");

        System.out.println(a.size());

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).toUpperCase());
        }

        a.remove(4);
        a.remove("Janis");
        a.remove(0);

        for (int b = 0; b < a.size(); b++) {
            System.out.println(a.get(b).toUpperCase());
        }



    }
}
