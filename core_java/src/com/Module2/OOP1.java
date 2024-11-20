package com.Module2.copy;
//print the area of sq,rec...
class Area {
    
    void area(int length, int breadth) 
    {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    
    void area(int side)
    {
        System.out.println("Area of square: " + (side * side));
    }
}

public class OOP1
{
    public static void main(String[] args)
    {
        Area obj = new Area();
        obj.area(5, 10);  // Rectangle area
        obj.area(7);      // Square area
    }
}

