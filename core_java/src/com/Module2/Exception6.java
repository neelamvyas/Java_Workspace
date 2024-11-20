package com.Module2.copy;

class Exception6 {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("Welcome to vote");
        }
    }
    
    public static void main(String[] args) {
        int age = 16;
        try {
            validate(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main java.lang.ArithmeticException: " + e.getMessage());
        }
    }
}
