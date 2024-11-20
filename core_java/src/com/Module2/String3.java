package com.Module2.copy;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        int result = n + (n * 10 + n) + (n * 100 + n * 10 + n);
        System.out.println("Result: " + result);
    }
}
