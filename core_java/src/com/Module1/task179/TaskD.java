package com.Module1.task179;
//factorial of a number 
import java.util.Scanner;

public class TaskD {
  
	public static void main(String[] args) {
		 Scanner sc =  new Scanner(System.in);
				 System.out.print("Enter your number : ");
		         int num = sc.nextInt();
		         int fact=1;
		         
		         for(int i=1;i<=num;i++)
		         {
		        	 fact*=i;
		         }
		         System.out.println("factorial of "+num+" is "+fact);
	
}

}