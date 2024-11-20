package com.Module2.copy;

import java.util.ArrayList;

public class Collection9
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        ArrayList<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);
    }
}
