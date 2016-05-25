package com.core.cci.linkedlist.main;

import com.core.cci.linkedlist.LinkedList;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		Integer[] values = new Integer[]{1,2,3,4,5,6,5,6,7,8,9,10,7,8,9,10};
		LinkedList<Integer>  linkedListInteger = new LinkedList<Integer>();
		linkedListInteger.prepareLinkedList(values);
		linkedListInteger.displayLinkedList();
		linkedListInteger.removeDuplicate();
		linkedListInteger.displayLinkedList();

		Float[] floatValues = new Float[]{1.2f, 2.4f, 3.5f, 6.4f, 2.3f, 1.2f, 7.8f, 1.2f, 1.2f, 2.4f};
		LinkedList<Float> linkedListFloat = new LinkedList<Float>();
		System.out.println("\n");
		linkedListFloat.prepareLinkedList(floatValues);
		linkedListFloat.displayLinkedList();
		linkedListFloat.removeDuplicate();
		linkedListFloat.displayLinkedList();
		
		String[] strValues = new String[]{"1", "2", "3", "1", "3", "3", "4", "5", "3"};
		LinkedList<String> linkedListString = new LinkedList<String>();
		System.out.println("\n");
		linkedListString.prepareLinkedList(strValues);
		linkedListString.displayLinkedList();
		linkedListString.removeDuplicate();
		linkedListString.displayLinkedList();
		
		Character[] charValues = new Character[]{'1', '2', '3', '1', '3', '4', '5'};
		LinkedList<Character> linkedListChar = new LinkedList<Character>();
		System.out.println("\n");
		linkedListChar.prepareLinkedList(charValues);
		linkedListChar.displayLinkedList();
		linkedListChar.removeDuplicate();
		linkedListChar.displayLinkedList();
		
		
		Integer[] emptyValues = new Integer[]{};
		LinkedList<Integer>  linkedListInteger1 = new LinkedList<Integer>();
		linkedListInteger1.prepareLinkedList(emptyValues);
		linkedListInteger1.displayLinkedList();
		linkedListInteger1.removeDuplicate();
		linkedListInteger1.displayLinkedList();
		
		Integer[] nullValues = null;
		LinkedList<Integer>  linkedListInteger2 = new LinkedList<Integer>();
		linkedListInteger2.prepareLinkedList(nullValues);
		linkedListInteger2.displayLinkedList();
		linkedListInteger2.removeDuplicate();
		linkedListInteger2.displayLinkedList();
		
		
	}

}
