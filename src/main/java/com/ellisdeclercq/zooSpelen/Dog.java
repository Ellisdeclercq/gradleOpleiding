package com.ellisdeclercq.zooSpelen;

import com.ellisdeclercq.mei.RandomNumber;

public class Dog extends Animal {


    String [] tricks = {"Sit", "Lay", "Apport", "Roll Over"};

    public Dog (String name) {
        super(name);

    }

    @Override
    public void createSound () {
        System.out.println(name + " says WOOOOOOOF");
    }

    public void bite() {
        System.out.println(name + " is biting, OMG!");
    }

    public void perform () {
        int trick = RandomNumber.berekenRandomGetal(0, (tricks.length - 1));
        //int trick = 1;
        System.out.println(tricks[trick] + " is " + name + " favourite trick, how great");
    }

}
