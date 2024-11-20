package com.Module2.copy;

import java.util.ArrayList;
import java.util.List;

public class String10 {
    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";
        
        List<String> interleavings = new ArrayList<>();
        interleave(str1, str2, "", interleavings);
        
        System.out.println("The interleaving strings are: ");
        for (String s : interleavings) {
            System.out.println(s);
        }
    }

    private static void interleave(String str1, String str2, String result, List<String> interleavings) {
        if (str1.isEmpty() && str2.isEmpty()) {
            interleavings.add(result);
            return;
        }
        
        if (!str1.isEmpty()) {
            interleave(str1.substring(1), str2, result + str1.charAt(0), interleavings);
        }
        
        if (!str2.isEmpty()) {
            interleave(str1, str2.substring(1), result + str2.charAt(0), interleavings);
        }
    }
}
