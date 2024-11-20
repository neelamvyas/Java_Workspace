package com.Module2.copy;

import java.util.ArrayList;

public class Collection4
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        String color = colors.get(1);
        System.out.println("Element at index 1: " + color);
    }
}
