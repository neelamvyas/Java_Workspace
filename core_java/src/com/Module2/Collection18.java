package com.Module2.copy;

import java.util.ArrayList;

public class Collection18 
{
    public static void main(String[] args) 
    
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Yellow");

        boolean areEqual = list1.equals(list2);
        System.out.println("Are the two lists equal? " + areEqual);
    }
}
