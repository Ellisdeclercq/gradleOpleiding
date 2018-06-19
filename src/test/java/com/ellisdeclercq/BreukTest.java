package com.ellisdeclercq;

import com.ellisdeclercq.breuken.Breuk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreukTest {

    @Test
    public void breukOptellen() {
        Breuk a = new Breuk(1, 5);
        Breuk b = new Breuk(3, 4);

        Breuk c = a.plus(b);


        assertEquals(c.getTeller(), 19);
        assertEquals(c.getNoemer(), 20);

    }


    @Test
    public void breukOptellen2() {
        Breuk c = new Breuk(5, 10);
        Breuk d = new Breuk(8, 5);

        Breuk e = c.plus(d);

        assertEquals(e.getTeller(), 21);
        assertEquals(e.getNoemer(), 10);

    }

    @Test
    public void breukAftrekken() {
        Breuk a = new Breuk(1, 2);
        Breuk b = new Breuk(3, 4);

        Breuk c = a.min(b);

        assertEquals(c.getTeller(), -1);
        assertEquals(c.getNoemer(), 4);

    }

    @Test
    public void breukAftrekken2() {
        Breuk a = new Breuk(3, 4);
        Breuk b = new Breuk(1, 2);

        Breuk c = a.min(b);

        assertEquals(c.getTeller(), 1);
        assertEquals(c.getNoemer(), 4);

    }


    @Test
    public void breukVermenigvuldigen() {
        Breuk a = new Breuk (3, 8);
        Breuk b = new Breuk (4, 9);

        Breuk c = a.maal(b);

        assertEquals(c.getTeller(), 1);
        assertEquals(c.getNoemer(), 6);
    }

    @Test
    public void breukOmkeren () {
        Breuk a = new Breuk (10, 5);

        Breuk b = a.omkering();

        assertEquals(b.getTeller(), 1);
        assertEquals(b.getNoemer(), 2);
    }

    @Test
    public void breukDelen () {
        Breuk a = new Breuk (1, 4);
        Breuk b = new Breuk (1,8);

        Breuk c = a.deel(b);

        assertEquals(2, c.getTeller());
        assertEquals(1, c.getNoemer());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deNoemerMagNietNulZijn() {
        Breuk a = new Breuk (1,0);
    }

}

