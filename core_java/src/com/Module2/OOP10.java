package com.Module2.copy;

class Factorial {
    int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class OOP10 {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int number = 5;  // You can take user input as well
        System.out.println("Factorial of " + number + " is: " + f.calculateFactorial(number));
    }
}

