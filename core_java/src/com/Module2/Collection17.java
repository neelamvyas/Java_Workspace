package com.Module2.copy;

import java.util.ArrayList;
import java.util.List;

public class Collection17
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        List<String> subList = colors.subList(1, 3);
        System.out.println("Sublist: " + subList);
    }
}

