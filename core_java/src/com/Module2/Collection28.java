package com.Module2.copy;

import java.util.HashMap;
import java.util.Collection;

public class Collection28 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        Collection<String> values = map.values();
        System.out.println("Values in the map: " + values);
    }
}

