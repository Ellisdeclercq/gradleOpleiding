package com.ellisdeclercq.shapesCreation;

public class Triangle_Right_Angled extends Shape {
    private double base;
    private double height;

    public Triangle_Right_Angled (double base, double height) {
        this.base = base;
        this.height = height;
    }
    public void calculatePerimeter () {
        double zijde = Math.sqrt((Math.pow(base,2)) + (Math.pow(height, 2)));
        this.perimeter = base + height + zijde;
        System.out.println("the perimeter of this right-angled triangle is " + perimeter);
    }

    public void calculateArea() {
        this.area = (base * height) / 2;
        System.out.println("the area of this right-angled triangle is " + area);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
