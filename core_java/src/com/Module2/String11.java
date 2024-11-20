package com.Module2.copy;

import java.util.HashMap;
import java.util.Map;

public class String11 {
    public static void main(String[] args) {
        String str = "successes";
        
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        int maxFrequency = 0, secondMaxFrequency = 0;
        char secondMostFrequentChar = ' ';
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int freq = entry.getValue();
            if (freq > maxFrequency) {
                secondMaxFrequency = maxFrequency;
                maxFrequency = freq;
            } else if (freq > secondMaxFrequency && freq < maxFrequency) {
                secondMaxFrequency = freq;
                secondMostFrequentChar = entry.getKey();
            }
        }
        
        System.out.println("The second most frequent character is: " + secondMostFrequentChar);
    }
}
