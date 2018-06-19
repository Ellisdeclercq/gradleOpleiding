package com.ellisdeclercq.beehive;

public class Nest {
    public static void main(String[] args) {

        Queen elisabeth = new Queen("Elisabeth", 15648646);
        Drone Richard = new Drone("Richard", 25000, 25);

        elisabeth.matingFlight(Richard);
        System.out.println(elisabeth.sperm);

        elisabeth.makeEgg();

        elisabeth.fly();
    }
}
