package com.ellisdeclercq.shapesCreation;

public class Circle extends Shape {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void calculateArea () {
        this.area = (this.radius * this.radius * Math.PI);
        System.out.println("the area of this circle is " + area);
    }

    public void calculatePerimeter() {
        this.perimeter = (this.radius) *Math.PI * 2;
        System.out.println("the perimeter of this circle is " + perimeter);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
