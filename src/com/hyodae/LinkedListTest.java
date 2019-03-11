package com.hyodae;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		String [] arr = {"Rose", "Lily", "Tulip", "Lilac", "Cherry"};
		
		LinkedList<String> que = new LinkedList<String>();
		
		for (int i=0; i<arr.length; i++) {
			que.offer(arr[i]);
		}
		while (que.peek()!=null) {
			System.out.print(que.poll() + "\t");
		}
	}
}
