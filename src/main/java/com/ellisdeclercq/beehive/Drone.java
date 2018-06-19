package com.ellisdeclercq.beehive;

public class Drone extends Bee {
    String name;
    long load;
    int times;
    long amount;

    public Drone (String name, long load, int times ) {
        super(name);
        System.out.println("create new drone");
        this.load = load;
        this.times = times;
    }

    public static void main(String[] args) {
        Drone Richard = new Drone("Richard",25000, 5);
        Richard.amount = Richard.load * Richard.times;

        System.out.println(Richard.amount);
    }
}
