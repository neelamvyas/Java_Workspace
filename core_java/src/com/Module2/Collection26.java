package com.Module2.copy;

import java.util.ArrayList;

public class Collection26 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at index " + i + ": " + colors.get(i));
        }
    }
}
