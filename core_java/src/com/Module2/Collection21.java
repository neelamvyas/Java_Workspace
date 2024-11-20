package com.Module2.copy;

import java.util.HashSet;

public class Collection21 
{
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        String[] array = set.toArray(new String[set.size()]);
        for (String color : array) {
            System.out.println(color);
        }
    }
}

