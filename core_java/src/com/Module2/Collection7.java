package com.Module2.copy;

import java.util.ArrayList;

public class Collection7
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        boolean exists = colors.contains("Green");
        System.out.println("Is Green present? " + exists);
    }
}
