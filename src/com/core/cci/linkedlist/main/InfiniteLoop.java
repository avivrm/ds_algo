package com.core.cci.linkedlist.main;

import com.core.cci.linkedlist.LinkedList;
import com.core.cci.linkedlist.Node;

public class InfiniteLoop {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
		Node<Integer> head = linkedList.getHead();
		Node<Integer> tempNode = head.next().next().next();
		Node<Integer> temp = head;
		while(null != temp.next()) {
			temp = temp.next();
		}
		temp.setNext(tempNode);
//		System.out.println(linkedList);
		System.out.println("Is There a loop in the linked list: " + linkedList.checkLoop());
		
	}
}
