package com.ellisdeclercq.shapesCreation;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea () {
        this.area = width * height;
        System.out.println("the area of this rectangle is " + area);
    }

    public void calculatePerimeter() {
        this.perimeter = (width + height) * 2;
        System.out.println("the perimeter of this rectangle is " + perimeter);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
