package com.ellisdeclercq.zooSpelen;

public class Bird extends Animal {

    public Bird (String name) {
        super(name);
    }

    @Override
    public void createSound() {
        System.out.println("Tsjilp Tsjilp " + name + " says"); // method
    }

    private void fly() {
        System.out.println(name + " is flying around");
    }
}
