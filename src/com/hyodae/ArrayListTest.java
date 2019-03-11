package com.hyodae;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	private static void print(ArrayList<Integer> list) {
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		System.out.println("# Create ArrayList and add data");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(85);
		list.add(100);
		list.add(70);
		list.add(95);
		print(list);

		System.out.println("# Add data at index 2");
		list.add(2,60);
		print(list);
		
		System.out.println("# Change data at index 2");
		list.set(2,0);
		print(list);
		
		System.out.println("# Remove data at index 2");
		list.remove(2);
		print(list);
		
		System.out.println("# Remove data - value 85");
		list.remove(new Integer(85));
		print(list);
		
		System.out.println("# Sorting");
		Collections.sort(list);
		print(list);
	}


}
