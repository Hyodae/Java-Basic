package com.hyodae;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		String [] arr = {"Rose", "Lily", "Tulip", "Lilac", "Cherry"};
	
		Stack<String> stk = new Stack<String>();

		for (int i=0; i<arr.length; i++) {
			stk.push(arr[i]);
		}
		
		while(!stk.isEmpty()) {
			System.out.print(stk.pop() + "\t");
		}
	}
}
