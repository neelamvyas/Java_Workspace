package com.Module2.copy;

import java.util.HashSet;

public class Collection12
{
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        for (String element : set) {
            System.out.println(element);
        }
    }
}

