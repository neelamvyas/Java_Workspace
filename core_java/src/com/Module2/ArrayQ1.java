package com.Module2.copy;

import java.util.Scanner;

public class ArrayQ1 {
	
	
	public static int findmax(int[] array)
	{
	  int max= array[0];
	  for(int i =1;i<array.length;i++)
	  {
		  if(array[i]>max)
		  {
			  max=array[i];
		  }
	  }
	  return max;
 	}
	
	public static void main(String[] args)
    {
		
		Scanner sc= new Scanner(System.in);
		int[] array= new int[5];
		System.out.println("enter the number of elements : ");
		for(int i =0; i<5; i++)
		{
			array[i]= sc.nextInt();
		}
		
		int maxNum = findmax(array);
		
		System.out.println(" Maximum number from an array is : "+maxNum);
	}
}
