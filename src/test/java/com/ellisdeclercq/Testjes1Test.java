package com.ellisdeclercq;

import org.junit.Assert;
import org.junit.Test;

public class Testjes1Test {

    @Test
    public void primeNumbersReturnsTrueIfNumberIsPrime() {
       int [] primes = {3,5,13};
        for (int prime : primes) {
            Assert.assertTrue((Testjes1.isPrime(prime)));
        }
    }

    @Test
    public void primeNumbersReturnsFalseIfNumberisNotPrime() {
         boolean out = Testjes1.isPrime(6);
         Assert.assertFalse(out);
    }

    @Test
    public void oneIsNotaPrime() {
        boolean out = Testjes1.isPrime(1);
        Assert.assertFalse(out);
    }

    @Test

    public void negativeIsNotaPrime () {
        boolean out = Testjes1.isPrime(-97);
        Assert.assertFalse(out);
    }





    /*public static void main(String[] args) {

        boolean out = Testjes1.isPrime(7);
        if(out != true) {
            System.out.println("FOUT");
        } else {
            System.out.println("OK");
        }

        out = Testjes1.isPrime(6);
        if(out != false) {
            System.out.println("FOUT");
        } else {
            System.out.println("OK");
        }


    }*/

}
