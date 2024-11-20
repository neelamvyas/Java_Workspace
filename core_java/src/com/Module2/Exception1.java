package com.Module2.copy;

public class Exception1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main java.lang.ArithmeticException: / by zero");
        }
    }
}
