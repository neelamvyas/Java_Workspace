package com.Module2.copy;
//rec and sq classes with area and perimeter ...
class Rect
{
    int length, breadth;

    Rect(int length, int breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    void area()
    {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void perimeter() 
    {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
}

class Sq extends Rect
{
    Sq(int side) 
    {
        super(side, side);
    }
}

public class OOP4 {
    public static void main(String[] args) 
    {
        Rect rectangle = new Rect(5, 10);
        rectangle.area();
        rectangle.perimeter();
        
        Sq square = new Sq(7);
        square.area();
        square.perimeter();
    }
}
