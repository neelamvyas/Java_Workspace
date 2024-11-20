package com.Module2.copy;
//area of triangle...
class Triangle 
{
    int a = 3, b = 4, c = 5;

    void area()
    {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle: " + area);
    }

    void perimeter()
    {
        System.out.println("Perimeter of Triangle: " + (a + b + c));
    }
}

public class OOP5 
{
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();
        triangle.area();
        triangle.perimeter();
    }
}
