package com.Module2.copy;
//sum n average of 5 number....
import java.util.Scanner;

public class BasicQ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double avg;
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("Enter number : ");
			int num= sc.nextInt();
			sum+=num;
		}
		avg=sum/5.0;
		
		System.out.println("Sum of 5 number is : "+sum);
		System.out.println("Average of 5 number is : "+avg);
		
		
	}
}
