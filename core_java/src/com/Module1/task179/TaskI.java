package com.Module1.task179;
//summation of all digits....
import java.util.Scanner;

public class TaskI {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		
		int sum =0;
		
		while(n>0) 
		{
			int rem = n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("Sum of digits:"+sum);
		
		
		
		
	}
}
