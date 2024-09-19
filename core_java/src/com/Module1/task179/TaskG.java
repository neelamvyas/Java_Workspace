package com.Module1.task179;

import java.util.Scanner;

//reverse of given number......
public class TaskG {
    
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		
		int rev =0;
		
		while(num>0) 
		{
			int rem = num%10;
			
			rev=rev*10+rem;
			
			num = num/10;
			
		}
		System.out.println("Reverse Number:"+rev);
		
		
		
		
	}
}
