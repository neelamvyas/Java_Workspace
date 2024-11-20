package com.Module2.copy;
//vowel and consonant....
import java.util.Scanner;

public class BasicQ2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a sigle alphabet : ");
		String ch = sc.nextLine();
		
		if(ch.length()!=1)
		{
			System.out.println("error: input should be single character...");
		}
		else {
			char cha=ch.charAt(0);
			cha=Character.toLowerCase(cha);
			if
			(cha=='a' || cha=='e' || cha=='i' || cha=='o' || cha=='u' ) {
				System.out.println("Vowel...");}
			else
			{
				System.out.println("Consonant..");
			}
			}
		
	
	}
}
