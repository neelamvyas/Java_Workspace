package com.Module2.copy;

public class Exception4 {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught inner ArithmeticException: " + e.getMessage());
            }
            
            int[] a = new int[5];
            a[5] = 10;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught outer ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
