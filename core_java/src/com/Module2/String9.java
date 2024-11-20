package com.Module2.copy;

public class String9 {
    public static void main(String[] args) {
        String str1 = "Red is favorite color.";
        String str2 = "Red";
        
        System.out.println("Red is favorite color. Starts with Red? " + str1.startsWith(str2));
        
        str1 = "Orange is also my favorite color.";
        System.out.println("Orange is also my favorite color. Starts with Red? " + str1.startsWith(str2));
    }
}
