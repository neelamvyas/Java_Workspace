package com.Module1.task179;

import java.util.Scanner;

//summation of last and first digit ....
public class TaskJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int last=n%10;
		int a;
		int first=0;
		
		while(n>0)
		{
			a=n%10;
			if(n/10==0)
			{
				first=a;
			}
			n=n/10;
		}
		System.out.println("sum of first and last digist : "+ (first+last));
	}
}
