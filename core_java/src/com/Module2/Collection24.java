package com.Module2.copy;

import java.util.ArrayList;

public class Collection24
{
    public static void main(String[] args)
{
        ArrayList<String> colors = new ArrayList<>(3);  // Setting initial capacity
        colors.add("Red");
        colors.add("Green");

        colors.ensureCapacity(10);  // Increase capacity to 10
        colors.add("Blue");
        System.out.println(colors);
    }
}
