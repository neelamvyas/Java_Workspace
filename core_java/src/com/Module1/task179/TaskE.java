package com.Module1.task179;
//fibonacci series
import java.util.Scanner;

public class TaskE {

	public static void main(String[] args) {
		 Scanner sc =  new Scanner(System.in);
				 System.out.print("Enter your number : ");
		         int num = sc.nextInt();
		         int a=0,b=0,c=1;
		         System.out.print("fibonacci Series : ");
		         for(int i=1;i<=num;i++)
		         {
		        	 a=b;
		        	 b=c;
		        	 c=a+b;
		        	 System.out.print(a+" ");

		         }
		        
	
}

}
