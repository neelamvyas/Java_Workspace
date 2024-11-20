package com.Module2.copy;

import java.util.ArrayList;

public class Collection25 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.set(1, "Yellow");
        System.out.println("After replacing second element: " + colors);
    }
}

