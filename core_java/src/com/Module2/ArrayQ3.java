package com.Module2.copy;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ3 {
    public static void sortArray(int[] arr, boolean ascending) {
        Arrays.sort(arr);
        if (!ascending) {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Sort in ascending order? (true/false): ");
        boolean ascending = sc.nextBoolean();

        sortArray(arr1, ascending);
        sortArray(arr2, ascending);

        System.out.println("Sorted first array: " + Arrays.toString(arr1));
        System.out.println("Sorted second array: " + Arrays.toString(arr2));
        sc.close();
    }
}
