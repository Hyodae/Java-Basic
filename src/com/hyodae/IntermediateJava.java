package com.hyodae;


//import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class IntermediateJava {

	
	public static void main(String[] args) {


		//////////////////////////////////////////
		// 19 - Generic Return Types
		System.out.println("\n\n#################################");
		System.out.println("# 19 - Generic Return Types\n");
		{
			System.out.println(max(23,43,1));
			System.out.println(max("apples","tots","chicken"));
			
		}
		
		
		//////////////////////////////////////////
		// 17 - Generic Methods
		// 18 - Implementing a Generic Method	
		System.out.println("\n\n#################################");
		System.out.println("# 17 - Generic Methods");
		System.out.println("# 18 - Implementing a Generic Method\n");
		{
			Integer[] iray = {1,2,3,4};
			Character[] cray = {'b','u','c','y'};
			
			printMe2(iray);
			printMe2(cray);
		
		}		
		
		//////////////////////////////////////////
		// 16 - HashSet
		System.out.println("\n\n#################################");
		System.out.println("# 16 - HashSet\n");
		{
			String[] things = {"apple", "bob", "ham", "bob", "bacon"};
			List<String> list = Arrays.asList(things);
			
			System.out.printf("%s ", list);
			System.out.println();
			
			Set<String> set= new HashSet<String>(list);
			System.out.printf("%s ", set);
			
		}

		
		//////////////////////////////////////////
		// 15 - Queue
		System.out.println("\n\n#################################");
		System.out.println("# 15 - Queue\n");
		{
			PriorityQueue<String> q = new PriorityQueue<String>();
			
			q.offer("first");
			q.offer("second");
			q.offer("third");
			
			System.out.printf("%s ", q);
			System.out.println();
			
			System.out.printf("%s ", q.peek());
			System.out.println();

			q.poll();
			System.out.printf("%s ", q);
		}		
		
		//////////////////////////////////////////
		// 14 - Stacks, push, pop
		System.out.println("\n\n#################################");
		System.out.println("# 14 - Stacks, push, pop\n");
		{
			Stack<String> stack = new Stack<String>();
			stack.push("bottom");
			printStack(stack);
			stack.push("second");
			printStack(stack);
			stack.push("third");
			printStack(stack);

			stack.pop();
			printStack(stack);
			stack.pop();
			printStack(stack);
			stack.pop();
			printStack(stack);
		}

		
		//////////////////////////////////////////
		// 12 - addAll
		// 13 - frequency, disjoint
		System.out.println("\n\n#################################");
		System.out.println("# 12 - addAll");
		System.out.println("# 13 - frequency, disjoint\n");
		{
			// convert stuff array to a list
			String[] stuff = {"apples", "beef", "corn", "ham"};
			List<String> list1 = Arrays.asList(stuff);
			
			ArrayList<String> list2 = new ArrayList<String>();
			list2.add("youtube");
			list2.add("google");
			list2.add("digg");
			
			for (String x : list2) {
				System.out.printf("%s ", x);
			}
			
			Collections.addAll(list2, stuff);
			System.out.println();

			for (String x : list2) {
				System.out.printf("%s ", x);
			}				
			System.out.println();

			System.out.println(Collections.frequency(list2, "digg"));
			
			boolean tof = Collections.disjoint(list1, list2);
			System.out.println(tof);
			
			if (tof) {
				System.out.println("these list do not have anything in common");
			} else {
				System.out.println("There list must have something in common!");
			}
		}		
		
		//////////////////////////////////////////
		// 10 - Methods reverse and copy
		// 11 - Collections Methods fill
		System.out.println("\n\n#################################");
		System.out.println("# 10 - Methods reverse and copy");
		System.out.println("# 11 - Collections Methods fill\n");
		{
			// create an array and convert to list
			Character[] ray = {'p', 'w', 'n'};
			List<Character> l = Arrays.asList(ray);
			System.out.println("List is : ");
			output(l);
			
			// reverse and print out the list
			Collections.reverse(l);
			System.out.println("After reverse : ");
			output(l);
			
			// create new array and a new list
			Character[] newRay = new Character[3];
			List<Character> listCopy = Arrays.asList(newRay);
			
			// Copy contents of list into listcopy
			Collections.copy(listCopy, l);
			System.out.println("Copy of list : ");
			output(listCopy);
			
			// fill collection with crap
			Collections.fill(l, 'X');
			System.out.println("Aftr filling the list : ");
			output(l);
		}		
		
		//////////////////////////////////////////
		// 09 - Collections Method sort
		System.out.println("\n\n#################################");
		System.out.println("# 09 - Collections Method sort\n");
		{
			String[] crap = {"apples", "lemons", "geese", "bacon", "youtube"};
			List<String> l1 = Arrays.asList(crap);
			
			Collections.sort(l1);
			System.out.printf("%s\n", l1);
			
			Collections.sort(l1, Collections.reverseOrder());
			System.out.printf("%s\n", l1);
		}
		
		//////////////////////////////////////////
		// 08 - Converting Lists to Arrays
		System.out.println("\n\n#################################");
		System.out.println("# 08 - Converting Lists to Arrays\n");
		{
			String[] stuff = {"babies", "watermelong", "melons", "fudge"};
			LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
			
			thelist.add("pumpikinf");
			thelist.addFirst("firstthing");
			
			// convert back to an array
			stuff = thelist.toArray(new String[thelist.size()]);
			
			for (String x : stuff) {
				System.out.printf("%s ", x);
			}
		}		
		
		//////////////////////////////////////////
		// 06 - LinkedList
		// 07 - LinkedList Program
		System.out.println("\n\n#################################");
		System.out.println("# 06 - LinkedList");
		System.out.println("# 07 - LinkedList Program\n");
		{
			String[] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
			List<String> list1 = new LinkedList<String>();
			for (String x : things) {
				list1.add(x);
			}
			
			String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
			List<String> list2 = new LinkedList<String>();
			for (String y : things2) {
				list2.add(y);
			}
			
			list1.addAll(list2);
			list2 = null;
			
			printMe(list1);
			removeStuff(list1, 2, 5);
			printMe(list1);
			reverseMe(list1);
		}
		
		
		//////////////////////////////////////////
		// 04 - Introduction to Collections
		// 05 - ArrayList Program
		System.out.println("\n\n#################################");
		System.out.println("# 04 - Introduction to Collections");
		System.out.println("# 05 - ArrayList Program\n");
		{
			String[] things = {"eggs", "lasers", "hats", "pie"};
			List<String> list1 = new ArrayList<String>();
			
			// add array items to list
			for (String x: things) {
				list1.add(x);
			}
			
			String[] morethings = {"lasers", "hats"};
			List<String> list2 = new ArrayList<String>();

			// add array items to list
			for (String y: morethings) {
				list2.add(y);
			}
			
			for (int i=0; i<list1.size(); i++) {
				System.out.printf("%s ", list1.get(i));
			}
			System.out.println();
			
			editlist(list1,list2);
			for (int i=0; i<list1.size(); i++) {
				System.out.printf("%s ", list1.get(i));
			}
		}		
	
				
		//////////////////////////////////////////
		// 03 - Recursion
		System.out.println("\n\n#################################");
		System.out.println("# 03 - Recursion\n");
		{
			System.out.println(fact(5));
			
		}
		
		//////////////////////////////////////////
		// 02 - Some More String Methods
		System.out.println("\n\n#################################");
		System.out.println("# 02 - Some More String Methods\n");
		{
			String s= "HyodaeKimdlkdsjfjakfjafjdaljeiksaljdlsfdKim";
			System.out.println(s.indexOf('k',10));
			System.out.println(s.indexOf('x'));
			System.out.println(s.indexOf("Kim"));
			System.out.println(s.indexOf("Kim", 10));
			
			String a = "Bacon";
			String b = "monster";
			
			System.out.println(a + b);
			System.out.println(a.concat(b));
			System.out.println(a.replace('B', 'F'));
			
			System.out.println(b.toUpperCase());
			
			String c = "    monster     ";
			System.out.println(c.trim());
		}
		
		//////////////////////////////////////////
		// 01.Common String
		System.out.println("\n\n#################################");
		System.out.println("# 01.Common String\n");
		{
			String[] words = {"funk", "chunk", "furry", "baconator"};
			
			// StartsWith
			for (String w : words) {
				if (w.startsWith("fu")) {
					System.out.println(w + " starts with fu");
				}
			}
	
			// endsWith
			for (String w : words) {
				if (w.endsWith("unk")) {
					System.out.println(w + " ends with unk");
				}
			}
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	// 19 - Generic Return Types
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T m = a;
		
		if (b.compareTo(a) > 0) {
			m = b;
		} 
		
		if (c.compareTo(m) > 0) {
			m = c;
		}
		
		return m;
	}
	
	
	// 18 - Implementing a Generic Method	
	public static <T> void printMe2(T[] x) {
		for (T b : x) {
			System.out.printf("%s ", b);
		}
		System.out.println();
	}
	
	
	// 17 - Generic Methods
/*	
	public static void printMe2(Integer[] i) {
		for (Integer x : i) {
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
	
	public static void printMe2(Character[] i) {
		for (Character x : i) {
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
*/
	
	
	
	// 14 - Stacks, push, pop
	
	private static void printStack(Stack<String> s) {
		if (s.isEmpty()) {
			System.out.println("you have nothing in our stack");
		} else {
			System.out.printf("%s TOP\n", s);
		}
	}
	
	// 11 - Collections Methods fill
	
	// output method
	private static void output(List<Character> thelist) {
		for (Character thing : thelist) {
			System.out.printf("%s ", thing);
		}
		System.out.println();
	}	
	
	
	
	// 07 - LinkedList Program

	// printMe method
	private static void printMe(List<String> l) {
		for (String b : l) {
			System.out.printf("%s ", b);
		}
		System.out.println();
	}
	
	// removeStuff method
	private static void removeStuff(List<String> l, int from, int to) {
		l.subList(from, to).clear();
	}
	
	// reverseMe
	private static void reverseMe(List<String> l) {
		ListIterator<String> bobby = l.listIterator(l.size());
		while (bobby.hasPrevious()) {
			System.out.printf("%s ", bobby.previous());
		}
	}
	
	// 05 - ArrayList Program
	public static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			if (l2.contains(it.next())) {
				it.remove();
			}
		}
	}
	
	// 03. Recursion : fact
	public static long fact(long n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
	
	
}
