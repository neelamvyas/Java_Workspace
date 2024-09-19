package com.Module1.task179;

import java.util.Scanner;

public class TaskN {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your choice : ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		   case 1:
			   System.out.print("Enter radius of circle: ");
               int r = sc.nextInt();
               double ca = 3.14 * r * r;
               System.out.println("Area of circle = " + ca);
               break;
			   			   
		   case 2:
			   System.out.print("Enter length of rectangle: ");
               double l = sc.nextDouble();
               System.out.print("Enter breadth of rectangle: ");
               double b = sc.nextDouble();
               double ra = l * b;
               System.out.println("Area of rectangle = " + ra);
               break;
               
		   case 3:
			   System.out.print("Enter height: ");
               double h = sc.nextDouble();
               System.out.print("Enter base: ");
               double base = sc.nextDouble();
               double ta= 0.5 *base*h;
       		
       		System.out.println("Area of triangle = "+ta);
			   
			   
		}
	}
}
