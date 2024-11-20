package com.Module2.copy;

import java.util.ArrayList;

public class Collection20
{
    public static void main(String[] args)
{
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Blue");
        list2.add("Yellow");

        list1.addAll(list2);
        System.out.println("Joined list: " + list1);
    }
}
