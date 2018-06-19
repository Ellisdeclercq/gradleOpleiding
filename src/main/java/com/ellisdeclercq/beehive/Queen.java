package com.ellisdeclercq.beehive;

import com.ellisdeclercq.mei.RandomNumber;

public class Queen extends Bee{


    int food;
    long sperm;
    long numberOfEggs;

    public Queen (String name, long numberOfEggs) {
        super(name);
        food = RandomNumber.berekenRandomGetal(20000,30000);
        sperm = 0;
        this.numberOfEggs = numberOfEggs;
    }

    public void matingFlight (Drone inputObject)
    {
        this.sperm = this.sperm + inputObject.amount;
        System.out.println(this.sperm);
    }


    public static void main(String[] args) {
        Queen Elisabeth = new Queen("Elisabeth", 40000);
        System.out.println(Elisabeth.sperm);


        System.out.println(Elisabeth.numberOfEggs);

    }

    public int createsEgg(int numberOfEggs) {
        int number = 1 + numberOfEggs;

        return number;
    }

    public void makeEgg(){
    while(this.sperm > 0 && this.food > 0) {
        this.numberOfEggs = this.numberOfEggs + 1;
        this.sperm = this.sperm - 1;
        this.food = this.food - 1;
    }

    }
}
