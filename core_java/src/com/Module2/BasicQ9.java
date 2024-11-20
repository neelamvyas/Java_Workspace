package com.Module2.copy;
//print numbers from 1 to 100 which are divisible by 3 and 5 both....
public class BasicQ9 {

    public static void main(String[] args) {
    	 for (int i = 1; i <= 100; i++) {
             if (i % 3 == 0 && i % 5 == 0) {
                 System.out.print(i + " ");
             }
         }
	}
}
