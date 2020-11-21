package org.test;

import java.util.ArrayList;
import java.util.List;

public class ListPgmEx1 {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer> ();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(10);
		num.add(10);
		num.add(0);
		num.add(0);
		System.out.println("List of numbers before replacing  value\n"+num);
		int n = num.size();
		for(int i =0; i<n;i++)
		{
			if(num.get(i) == 10)
			{
				num.set(i, 120);
			}
		}
		System.out.println("List of numbers after replacing values\n"+num);
	}

}
