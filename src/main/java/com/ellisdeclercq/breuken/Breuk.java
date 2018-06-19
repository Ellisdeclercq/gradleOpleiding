package com.ellisdeclercq.breuken;

import static java.lang.Math.abs;

public class Breuk {

    private int teller;
    private int noemer;

    public Breuk (int teller, int noemer) {

        this.teller = teller;
        if (noemer == 0) {
            throw new IllegalArgumentException("Noemer mag niet 0 zijn!");
        }
        this.noemer = noemer;

    }

    public int getTeller() {
        return teller;
    }



    public int getNoemer() {
        return noemer;
    }





/*
    private void plusmin(Breuk a, Breuk b) {
        int tellerc = a.teller * b.noemer;
        int noemerc = a.noemer * b.teller;
        Breuk d = (tellerc, noemerc);

        System.out.println(d);
    }
    */

    public Breuk plus(Breuk that) {
        int nieuweTeller = this.teller * that.noemer + this.noemer * that.teller;
        int nieuweNoemer = this.noemer * that.noemer;
        Breuk c = new Breuk(nieuweTeller, nieuweNoemer);
        c.vereenvoudig();
        return c;
    }

    public Breuk min (Breuk that) {
        int nieuweTeller = this.teller * that.noemer - this.noemer * that.teller;
        int nieuweNoemer = this.noemer * that.noemer;
        Breuk b = new Breuk(nieuweTeller, nieuweNoemer);
        b.vereenvoudig();
        return b;
    }

    public Breuk maal (Breuk that) {
        int nieuweTeller = this.teller * that.teller;
        int nieuweNoemer = this.noemer * that.noemer;
        Breuk a = new Breuk(nieuweTeller, nieuweNoemer);
        a.vereenvoudig();
        return a;
    }

    public Breuk omkering () {
        int nieuweTeller = this.noemer;
        int nieuweNoemer = this.teller;
        Breuk a = new Breuk(nieuweTeller, nieuweNoemer);
        a.vereenvoudig();
        return a;
    }

    public Breuk deel (Breuk that) {
        that = that.omkering();
        Breuk result = this.maal(that);
        return result;
    }


    public static int greatestCommonFactor(int a, int b) {
        if(a == 0 || b == 0) {
            return 1;
        }

        a = abs(a);
        b = abs(b);
        if(a < b) {
            return greatestCommonFactor(b, a);
        }

        int delta = a % b;
        if(delta == 0) {
            return b;
        } else {
            return greatestCommonFactor(b, delta);
        }
    }

    public void vereenvoudig(){
        int gemDeler = greatestCommonFactor(this.teller, this.noemer);
        this.teller = this.teller / gemDeler;
        this.noemer = this.noemer / gemDeler;

    }


}
