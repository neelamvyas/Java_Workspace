package com.Module1.task179;

import java.util.Scanner;

//max value...
public class TaskH {


	public static void main(String[] args) 
	{
		int max =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		
		while(num>0) 
		{
			   int rem = num%10;
			   if(rem>max)
			   {
				max = rem;
			   }
			num = num/10;
		}
		System.out.println("Max Number:"+max);
		
		}
}
