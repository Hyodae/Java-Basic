package com.hyodae;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		String [] arr = {"Rose", "Lily", "Tulip", "Lilac", "Cherry"};

		Vector<String> vec = new Vector<String>();
		for (int i=0; i<arr.length; i++) {
			vec.add(arr[i]);
		}
		
		Enumeration<String> item = vec.elements();
		
		while (item.hasMoreElements()) {
			System.out.print(item.nextElement() + "\t");
		}
	}
}
