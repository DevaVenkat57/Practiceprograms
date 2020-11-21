package org.test;

import java.util.Scanner;

public class CountOddEven {
	public static void main(String[] args) {
		int  count = 0, count1 =0;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the range");
		int n = s.nextInt();
		for(int j= 0; j<=n; j++)
		{
			if(j%2 == 0) {
				count = count + j;
								}
			else
			{
				count1 = count1 + j;
			}		

}
		s.close();
		System.out.println("The Count of Even numbers is "+count);
		System.out.println("The Count of Odd numbers is "+count1);
		

		System.out.println("Changes Made By Deva");
		
		System.out.println("Changes Made by Branch Venkat");
		}
}

