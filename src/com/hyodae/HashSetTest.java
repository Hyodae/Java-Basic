package com.hyodae;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("Rose");
		set.add("Lily");
		set.add("Cherry");
		set.add("Tulip");
		set.add("Iris");
		set.add("Lilac");
		set.add("Ivy");
		
		// duplicate item : will not be saved
		set.add("Rose");
		set.add("Lily");
		set.add("Cherry");
		
		for (String item : set) {
			System.out.print(item + "\t");
		}
	}
}
