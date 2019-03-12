package com.hyodae;

import java.util.Iterator;
import java.util.Vector;

public class IteratorTest {

	public static void main(String[] args) {
		String [] arr = {"Rose", "Lily", "Tulip", "Lilac", "Cherry"};

		Vector<String> vec = new Vector<String>();
		for (int i=0;i <arr.length; i++) {
			vec.add(arr[i]);
		}
		
		Iterator<String> item = vec.iterator();
		while (item.hasNext()) {
			System.out.print(item.next() + "\t");
		}
	}
}
