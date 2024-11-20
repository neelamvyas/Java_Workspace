package com.Module2.copy;

import java.util.Scanner;

/*
Counting the number of digit.
Entered number = 123456
output: 6
*/
public class BasicQ8 {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number : ");
		 int num= sc.nextInt();
		 if(num>=0)
		 {
			 int count=0;
			 while (num != 0) {
	                num /= 10;
	                count++;
	            }
			System.out.println("number of digits are : "+count); 
		 }
	}
	
}
