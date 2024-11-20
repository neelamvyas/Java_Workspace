package com.Module2.copy;

import java.util.Scanner;

//check leap year..
public class BasicQ3 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter value of i : ");
		int yr = sc.nextInt();
		
		if(yr%4==0)
		{
			System.out.println("it's leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}
}
