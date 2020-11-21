package org.test;

import java.util.Scanner;

public class TrianglePgm {
	private void triangle() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of rows to be printed in triangle:"); 
        int rows = sc.nextInt(); 
  
        // loop to iterate for the given number of rows 
        for (int i = 1; i <= rows; i++) { 
  
            // loop to print the number of spaces before the star 
            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            // loop to print the number of stars in each row 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
  
            // for new line after printing each row 
            System.out.println(); 
        }
        

	}
	
	private void reverseTriangle() {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in); 
        System.out.println("Enter the number of rows to be printed in reverse triangle:"); 
        int rows = sc1.nextInt(); 
  
        // loop to iterate for the given number of rows 
        for (int i = 1; i <= rows; i++) { 
  
            // loop to print the number of spaces before the star 
            for (int j =1; j <= i; j++) { 
                System.out.print(" "); 
            } 
  
            // loop to print the number of stars in each row 
            for (int j = rows; j >= i; j--) { 
                System.out.print("* "); 
            } 
  
            // for new line after printing each row 
            System.out.println(); 
            
        } 
       

	}
	public static void main(String[] args) 
    { 
		TrianglePgm t = new TrianglePgm();
		t.triangle();		
		t.reverseTriangle();
        
    } 
}
