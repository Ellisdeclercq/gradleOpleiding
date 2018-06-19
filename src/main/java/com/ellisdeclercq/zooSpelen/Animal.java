package com.ellisdeclercq.zooSpelen;

public abstract class Animal {
    protected String name;

    public Animal(String name) {            // constructor
        this.name = name;
    }

    public String getName () {
        return this.name;
    } // getter

    public void setName (String name) {
        this.name = name;
    } // setter

    public abstract void createSound();


}
