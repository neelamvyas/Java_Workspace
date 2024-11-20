package com.Module2.copy;

import java.util.ArrayList;

public class Collection6 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.remove(2);
        System.out.println(colors);
    }
}