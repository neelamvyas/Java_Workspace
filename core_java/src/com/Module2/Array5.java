package com.Module2.copy;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }

        System.out.println("Length of the string: " + length);
        sc.close();
    }
}
