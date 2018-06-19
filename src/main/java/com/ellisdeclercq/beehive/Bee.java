package com.ellisdeclercq.beehive;

public class Bee {

    private String name;

    public Bee(String name) {
        this.name = name;
    }


    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(name + " is Flying");
    }

}
