package com.ellisdeclercq.zooSpelen;

public class Zoo {

    public static void main(String[] args) {
        Dog joppe = new Dog("Joppe");

        Cat minoes = new Cat("Minoes", 10);

        Lion simba = new Lion("Simba", 5, 10);

        Bird coco = new Bird("Coco");

        Rabbit witloof = new Rabbit("Witloof");

        Dog donna = new Dog("Donna");

        Cat tassoe = new Cat ("Tassoe", 7);

        Lion scar = new Lion ("Scar", 1, 1);

        Bird nelly = new Bird ("Nelly");

        Rabbit bruintje = new Rabbit ("Bruintje");


        Animal [] zoo = {minoes, simba, joppe, coco, witloof, donna, tassoe, scar, nelly, bruintje };

        for (int i = 0; i < zoo.length; i++) {
            Animal dieren = zoo[i];
            dieren.createSound();
        }

    }
}
