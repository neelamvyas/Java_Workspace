package com.Module2.copy;

public class Exception5 {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main java.lang.ArithmeticException: / by zero");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two numbers as arguments.");
        }
    }
}
