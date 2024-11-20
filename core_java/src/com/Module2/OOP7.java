package com.Module2.copy;

abstract class Base {
    abstract void message();
}

class FirstSubclass extends Base {
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Base {
    void message() {
        System.out.println("This is second subclass");
    }
}

public class OOP7 {
    public static void main(String[] args) {
        Base obj1 = new FirstSubclass();
        Base obj2 = new SecondSubclass();
        
        obj1.message();
        obj2.message();
    }
}

