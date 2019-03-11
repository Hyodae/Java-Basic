package com.hyodae;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		String [] arr = {"Rose", "Lily", "Tulip", "Lilac", "Cherry"};
		
		Vector<String> vec = new Vector<String>(4,3);
		System.out.println("vec.size() : " + vec.size());
		System.out.println("vec.capacity() : " + vec.capacity());
		System.out.println("");
	
		for (int i=0; i<arr.length; i++) {
			vec.add(arr[i]);
		}
		
		for (String item:vec) {
			System.out.print(item + "\t");
		}
		System.out.println("\n");
		
		System.out.println("vec.size() : " + vec.size());
		System.out.println("vec.capacity() : " + vec.capacity());		
	}
}
