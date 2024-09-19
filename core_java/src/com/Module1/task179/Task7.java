package com.task179;
//sum of 5 subject and percentage
public class Task7 {
	public static void main(String[] args) {
		int m=70;//maths
		int s=90;//science
		int e=60;//english
		int h=90;//hindi
		int c=50;//civics
		
		 int Sum = m + s + e + h + c;
		 
		double per= (Sum/500.0) *100;
		
		System.out.println("Percentage of 5 subject : " +per);
	}

}
