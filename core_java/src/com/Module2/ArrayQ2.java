package com.Module2.copy;

import java.util.Arrays;

public class ArrayQ2{
    
    // Function to find the second maximum number
    public static int findSecondMax(int[] arr) {
        // If the array has fewer than 2 elements, return a large negative number to indicate an error
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return Integer.MIN_VALUE;
        }

        // Initialize two variables to store the first and second maximum numbers
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        // If secondMax remains the smallest possible integer, it means no second max was found
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum number found.");
            return Integer.MIN_VALUE;
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99, 6};

        // Call the function to find the second maximum
        int secondMax = findSecondMax(arr);

        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("The second maximum number is: " + secondMax);
        }
    }
}
