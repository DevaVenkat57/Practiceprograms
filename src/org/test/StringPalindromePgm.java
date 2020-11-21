package org.test;

import java.util.Scanner;

public class StringPalindromePgm {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String to check Palindrome");
		String original = s.next();
		String reverse="";
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
			
		}
		System.out.println("Reversed String is:"+reverse);
		if(original.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
			
		}
		
	}

}
