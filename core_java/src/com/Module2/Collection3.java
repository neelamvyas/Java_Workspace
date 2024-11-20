package com.Module2.copy;

import java.util.ArrayList;

public class Collection3 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.add(0, "Yellow");
        System.out.println(colors);
    }
}
