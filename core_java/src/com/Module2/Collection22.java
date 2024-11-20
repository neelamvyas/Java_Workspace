
package com.Module2.copy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Collection22 
{
	
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        List<String> list = new ArrayList<>(set);
        System.out.println("List: " + list);
    }
}

