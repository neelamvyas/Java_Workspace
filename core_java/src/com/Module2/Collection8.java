package com.Module2.copy;

import java.util.ArrayList;
import java.util.Collections;

public class Collection8 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Collections.sort(colors);
        System.out.println(colors);
    }
}