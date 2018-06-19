package com.ellisdeclercq.zooSpelen;

public class Lion extends Cat {

    int power;

    public Lion (String name, int lives, int power) {
        super (name, lives);
        this.power = power;
    }

@Override
    public void createSound() {
    System.out.println("the mighty strong lion " + name + " roars");
}

    public void rule() {
        System.out.println("the powerful lion " + name + " has a ruling strength of " + power);
    }


}
