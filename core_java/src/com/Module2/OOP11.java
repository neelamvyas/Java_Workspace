package com.Module2.copy;

abstract class Shape {
    abstract void rectangleArea(int length, int breadth);
    abstract void squareArea(int side);
    abstract void circleArea(double radius);
}

class Ar extends Shape {
    void rectangleArea(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void squareArea(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void circleArea(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

public class OOP11 {
    public static void main(String[] args) {
        Ar area = new Ar();
        area.rectangleArea(5, 10);
        area.squareArea(7);
        area.circleArea(3.5);
    }
}

