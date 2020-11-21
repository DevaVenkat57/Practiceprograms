package org.test;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		int count =0;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number to check even or odd");
		int i = s.nextInt();
		
			if(i%2 == 0) {
				System.out.println("The number is even");
				count = count + i;
								}
			else
			{
				System.out.println("The number is odd");
			}
			
			
		}
		
}
		


