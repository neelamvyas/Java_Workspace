package com.Module2.copy;

import java.util.ArrayList;

public class Collection2
{
    public static void main(String[] args)
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
