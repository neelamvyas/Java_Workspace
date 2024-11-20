package com.Module2.copy;

public class String7 {
    public static void main(String[] args) {
        String str1 = "topsint.com";
        String str2 = "topsint.com";
        System.out.println("Comparing topsint.com and topsint.com: " + str1.equals(str2));
        
        String str3 = "Topsint.com";
        System.out.println("Comparing Topsint.com and topsint.com: " + str3.equals(str2));
    }
}
