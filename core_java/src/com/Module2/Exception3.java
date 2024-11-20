package com.Module2.copy;

public class Exception3 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;  // This will cause both ArithmeticException and ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
