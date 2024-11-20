package com.Module2.copy;

public class String8 {
    public static void main(String[] args) {
        String str1 = "Java Exercises";
        String str2 = "se";
        
        System.out.println("\"Java Exercises\" ends with \"se\"? " + str1.endsWith(str2));
        
        str1 = "Java Exercise";
        System.out.println("\"Java Exercise\" ends with \"se\"? " + str1.endsWith(str2));
    }
}
