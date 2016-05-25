package com.ds.gfg.linnkedlist;

/**
 * @author avinashve
 *reverse-alternate-k-nodes-in-a-singly-linked-list
 */
public class Q1PrintLinkedListMain {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,6,7,8,9};
		Q1LinkedList linkedList = new Q1LinkedList();
		linkedList.createLinkedList(intArr);
		Q1Node node = linkedList.reverse(linkedList.getHead(),3);
		linkedList.setHead(node);
		System.out.println(linkedList.toString());
	}
}
