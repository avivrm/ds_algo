package com.ds.gfg.linnkedlist;

/**
 * @author avinashve
 * Merge two sorted linked lists such that merged list is in reverse order
 * Examples: Input: a: 5->10->15->40 b: 2->3->20
 * Output: res: 40->20->15->10->5->3->2 
 * Input: a: NULL b: 2->3->20 Output: res: 20->3->2
 */
public class Q2PrintLinkedListMain {
	public static void main(String[] args) {
		int[] intArr1 = {5,10,15,16,17,18,19,40,50,60,70};
		int[] intArr2 = {2,3,20};
		Q2LinkedList linkedList = new Q2LinkedList();
		Q2Node node1 = linkedList.createLinkedList(intArr1);
		Q2Node node2 = linkedList.createLinkedList(intArr2);
		System.out.println(linkedList.toString(node1));
		System.out.println(linkedList.toString(node2));
		Q2Node node3 = linkedList.mergeLinkedList(node1, node2);
		System.out.println(linkedList.toString(node3));
	}
}