package com.Abstraction.A;

public class Rectangle extends GeometricFigure{

    private double A;
    private double B;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        A = a;
        B = b;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    @Override
    void area() {
        double S = A*B;
        System.out.println("To'g'ri tortburchak yuzasi : " + S);
    }

    @Override
    void perimeter() {
        double P = 2*(A+B);
        System.out.println("To'g'ri tortburchak perimetri : " + P);
    }
}
