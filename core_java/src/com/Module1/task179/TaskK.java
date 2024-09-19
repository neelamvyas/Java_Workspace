package com.Module1.task179;

import java.util.Scanner;

public class TaskK {
	
	public static void main(String[] args) {
		int m=0,i,flag=0;
		Scanner sc = new Scanner(System.in);
				System.out.println("enter to check number : ");
		        int num= sc.nextInt();
		        m=num/2;
		        
		        if(num==0||num==1)
		        {
		        	System.out.println(num + " is not prime number");
		        }
		        else {
		        	for(i=2;i<=m;i++)
		        	{
		        		if(num%i==0)
		        		{
		        			System.out.println(num + " is prime number");
		        			flag=1;
		        			break;
		        		}
		        	}
		        	if(flag==0)
		        	{
		        		System.out.println(num + " is prime number");
		        	}
		        }
	}

}
