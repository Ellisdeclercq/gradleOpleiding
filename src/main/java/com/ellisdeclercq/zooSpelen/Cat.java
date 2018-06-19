package com.ellisdeclercq.zooSpelen;

public class Cat extends Animal {

    int lives;

    public Cat (String name, int lives) {
        super(name);
        this.lives = lives;
    }

    @Override
    public void createSound() {
        System.out.println(name + " makes a sound: MIAUWW");
    }

    public void scratch() {
        System.out.println(name + " is scratching.. SsssCCcccRRRRAAAtTccchhh");
    }

}
