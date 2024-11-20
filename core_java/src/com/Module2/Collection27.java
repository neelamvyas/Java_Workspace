package com.Module2.copy;

import java.util.HashSet;

public class Collection27 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Green");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Green");
        set2.add("Blue");

        set1.retainAll(set2);
        System.out.println("Common elements: " + set1);
    }
}

