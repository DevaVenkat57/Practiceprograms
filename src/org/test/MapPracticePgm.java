package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPracticePgm {
	public static void main(String[] args) {
		//Map without any generics
		Map mp = new HashMap ();
		mp.put("name","Devendran");
		mp.put("Gender", "M");
		mp.put("Phone no.", "9941023254l");
		
		System.out.println(mp);
		
		System.out.println(mp.get("name"));
		
		// for iterating the whole Map we need generics in entryset
		
		Set<Entry<String,String>> en = mp.entrySet();	
		for(Entry<String,String> x: en)
		{
			System.out.println(x);
		}
	}
	
	

}
