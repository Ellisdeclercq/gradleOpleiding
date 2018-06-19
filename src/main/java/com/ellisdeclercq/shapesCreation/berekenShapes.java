package com.ellisdeclercq.shapesCreation;

import java.util.Scanner;

public class berekenShapes {

    public static void main(String[] args) {


            System.out.println("input 1 for a circle, 2 for a rectangle, 3 for a right-angled triangle");

            Scanner s = new Scanner(System.in);
            int userInput = s.nextInt();

            while(userInput < 1 || userInput > 3 ) {
                System.out.println("please enter a valid number");
                userInput = s.nextInt();
            }
            switch (userInput) {
                case 1:
                    System.out.println("you chose a circle, please input the radius");
                    Circle z = new Circle(s.nextDouble());
                    z.calculateArea();
                    z.calculatePerimeter();
                    break;

                case 2:
                    System.out.println("you chose a rectangle, please input the width");
                    double width = s.nextDouble();
                    System.out.println("please input the height");
                    double height = s.nextDouble();
                    Rectangle y = new Rectangle(width, height);

                    y.calculateArea();
                    y.calculatePerimeter();

                    break;
                case 3:
                    System.out.println("you chose a right-angled triangle, please input the base");
                    double base = s.nextDouble();
                    System.out.println("please input the height");
                    double hoogte = s.nextDouble();
                    Triangle_Right_Angled x = new Triangle_Right_Angled(base, hoogte);

                    x.calculateArea();

                    x.calculatePerimeter();


            }

        }

    }

