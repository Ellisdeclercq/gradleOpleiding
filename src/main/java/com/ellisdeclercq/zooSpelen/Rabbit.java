package com.ellisdeclercq.zooSpelen;

public class Rabbit extends Animal {

    boolean fluffy;

    public Rabbit (String name) {
        super(name);
        fluffy = Math.random() > 0.5;
    }
    public void isFluffy() {
         if (fluffy == true) {
            System.out.println(name + "is a fluffy rabbit");
        } else {
        System.out.println(name + " is not a fluffy rabbit");
        } }

        public void createSound() {
            System.out.println("my rabbit " + name + " is making MIEP MIEP MIEP sounds");
        }

}
