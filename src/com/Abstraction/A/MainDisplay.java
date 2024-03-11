package com.Abstraction.A;

import java.util.Scanner;

public class MainDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uchburchak a-tomonini kiriting :");
        double a1 = scanner.nextDouble();
        System.out.println("Uchburchak b-tomonini kiriting :");
        double b1 = scanner.nextDouble();
        System.out.println("Uchburchak c-tomonini kiriting :");
        double c1 = scanner.nextDouble();

        GeometricFigure triangle = new Triangle(a1,b1,c1);

        System.out.println();
        System.out.println("Uchburchak natijalari :");

        triangle.area();
        triangle.perimeter();


        System.out.println();
        System.out.println("Trapetsiya a-tomonini kiriting :");
        double a2 = scanner.nextDouble();
        System.out.println("Trapetsiya b-tomonini kiriting :");
        double b2 = scanner.nextDouble();
        System.out.println("Trapetsiya h-balandligini kiriting :");
        double h = scanner.nextDouble();

        GeometricFigure trapezium = new Trapezium(a2,b2,h);

        System.out.println();
        System.out.println("Trapetsiya natijalari :");

        trapezium.area();
        trapezium.perimeter();

        System.out.println();
        System.out.println("To'g'ri tortburchak a-tomonini kiriting :");
        double a3 = scanner.nextDouble();
        System.out.println("To'g'ri tortburchak b-tomonini kiriting :");
        double b3 = scanner.nextDouble();

        GeometricFigure rectangle = new Rectangle(a3,b3);

        System.out.println();
        System.out.println("To'g'ri tortburchak natijalari :");

        rectangle.area();
        rectangle.perimeter();

    }
}
