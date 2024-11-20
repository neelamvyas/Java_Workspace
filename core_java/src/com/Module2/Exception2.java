package com.Module2.copy;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main java.lang.ArithmeticException: / by zero");
        }
        
        sc.close();
    }
}
