package com.Module2.copy;
//parent and child class method...
class Parent {
    void display() 
    {
        System.out.println("This is a parent class");
    }
}

class Child extends Parent 
{
    void show()
    {
        System.out.println("This is child class");
    }
}

public class OOP2 {
    public static void main(String[] args) 
    {
        Parent parentObj = new Parent();
        Child childObj = new Child();
        
        
        parentObj.display();
        

        childObj.show();
        

        childObj.display();
    }
}

