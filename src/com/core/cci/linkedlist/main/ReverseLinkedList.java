package com.core.cci.linkedlist.main;

import com.core.cci.linkedlist.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Integer[] decimalNodes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		LinkedList<Integer> linkedList = new LinkedList<Integer>(decimalNodes);
		System.out.println(linkedList);
		linkedList.reverse(3);
		System.out.println(linkedList);
		
		String[] stringNodes = {"Jatin", "Sehgal", "Neha", "Garima", "Manav", "Sarath"};
		LinkedList<String> stringLinkedList = new LinkedList<String>(stringNodes);
		System.out.println(stringLinkedList);
		stringLinkedList.reverse(2);
		System.out.println(stringLinkedList);
		
		Float[] floatNodes = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.10f, 11.11f};
		LinkedList<Float> floatLinkedList = new LinkedList<Float>(floatNodes);
		System.out.println(floatLinkedList);
		floatLinkedList.reverse(3);
		System.out.println(floatLinkedList);
		
		Integer[] intNodes = null;
		LinkedList<Integer> intLinkedList = new LinkedList<Integer>(intNodes);
		System.out.println(intLinkedList);
		intLinkedList.reverse(3);
		System.out.println(intLinkedList);
		intLinkedList.reverse();
		System.out.println(intLinkedList);
	}
}
