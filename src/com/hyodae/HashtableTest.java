package com.hyodae;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class HashtableTest {

	public static void main(String[] args) {

		Hashtable<String, Double> ht = new Hashtable<String, Double>();
		ht.put("Howard", 182.5);
		ht.put("Jane", 160.3);
		ht.put("Tom", 175.9);
		ht.put("Adam", 187.7);
		
		Scanner input = new Scanner(System.in);
		System.out.print("# input name >> ");
		String key = input.nextLine();
		double height = ht.get(key);
		System.out.println(key + "'s height : " + height);
		
		System.out.println("\nName \tHeight");
		System.out.println("--------------------------------");
		Set<String> set = ht.keySet();
		for (String item: set) {
			height = ht.get(item);
			System.out.println(item + "\t" + height);
		}
	}
}
