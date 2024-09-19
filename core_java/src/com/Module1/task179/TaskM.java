package com.Module1.task179;

import java.util.Scanner;

public class TaskM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your value of a : ");
		int a = sc.nextInt();
		System.out.println("enter your value of b : ");
		int b = sc.nextInt();
		System.out.println("enter your option : ");
		int op = sc.nextInt();
		 switch(op)
		 {
		 		case 1 :
		 			op=a+b;
		 			System.out.println("Addition : "+op);
		 		    break;
		 		case 2 :
		 			op=a-b;
		 			System.out.println("Subtraction : "+op);
		 			break;
		 		case 3 :
		 			op=a*b;
		 			System.out.println("Multiplication : "+op);
		 			break;
		 		case 4 :
		 			op=a/b;
		 			System.out.println("Division : "+op);
		 			break;
		 		
		 		default:
		 		System.out.println("Not an option...");
		 		break;
		 }
		 
		
				
	}
}
