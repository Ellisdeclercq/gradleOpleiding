package com.ellisdeclercq;

public enum Maand {

        JANUARI(59, 76.1, 3.3),
        FEBRUARI(77, 63.1, 3.7),
        MAART(114, 70.0, 6.8),
        APRIL(159, 51.3, 9.8),
        MEI(191, 66.5, 13.6),
        JUNI(188, 71.8, 16.2),
        JULI(201, 73.5, 18.4),
        AUGUSTUS(190, 79.3, 18.0),
        SEPTEMBER(143, 68.9, 14.9),
        OKTOBER(113, 74.5, 11.1),
        NOVEMBER(66, 76.4, 6.8),
        DECEMBER(45, 81.0, 3.9);

        private final double zonUren;
        private final double regen;
        private final double temperatuur;


    Maand(double zonUren, double regen, double temperatuur) {
        this.zonUren = zonUren;
        this.regen = regen;
        this.temperatuur = temperatuur;
    }

    public double getZonUren() {
        return this.zonUren;
    }

    public double getRegen () {
        return this.regen;
    }

    public double getTemperatuur () {
        return this.temperatuur;
    }


}
