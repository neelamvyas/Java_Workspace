package com.Module2.copy;
//find the greatest number ....
import java.util.Scanner;

public class BasicQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of j : ");
		int i = sc.nextInt();
		System.out.println("Enter value of j : ");
		int j = sc.nextInt();
		System.out.println("Enter value of k : ");
		int k = sc.nextInt();
		
				if(i>j)
				{
					if(i>k)
					{
						System.out.println("greatest number "+i);
					}
				}
				else
				{
					if(j>k)
					{
						System.out.println(" greatest number is "+j);
					
					}
					else
					{
						System.out.println("greatest number is "+k);
					}
				}
				
	}
}
