package com.core.cci.linkedlist.main;

import com.core.cci.linkedlist.LinkedList;

public class LinkedListSum {

	public static void main(String[] args) {
		LinkedList<Integer> linkedListInteger1 = new LinkedList<Integer>();
		linkedListInteger1.prepareLinkedListFromNumber(7735);
		linkedListInteger1.displayLinkedList();
		int value1 = linkedListInteger1.getValue();
		System.out.println("\n" + value1);
		
		LinkedList<Integer> linkedListInteger2 = new LinkedList<Integer>();
		linkedListInteger2.prepareLinkedListFromNumber(3375);
		linkedListInteger2.displayLinkedList();
		int value2 = linkedListInteger2.getValue();
		System.out.println("\n" + value2);
		
		LinkedList<Integer> linkedListSum = new LinkedList<Integer>();
		linkedListSum.prepareLinkedListFromNumber(value1 + value2);
		linkedListSum.displayLinkedList();
		System.out.println("\n" + linkedListSum.getValue());
	}
}
