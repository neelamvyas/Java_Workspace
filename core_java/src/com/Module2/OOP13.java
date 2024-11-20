package com.Module2.copy;

class Sh {
    void display() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Sh {
    void display() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Sh {
    void display() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void display() {
        System.out.println("Square is a rectangle");
    }
}

public class OOP13 {
    public static void main(String[] args) {
        Square square = new Square();
        square.display();  // Calls method from Square class
    }
}

