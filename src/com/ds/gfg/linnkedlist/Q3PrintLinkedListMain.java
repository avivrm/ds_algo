package com.ds.gfg.linnkedlist;

/**
 * @author avinashve 
 * 		   Compare two strings represented as linked lists Input:
 *         list1 = g->e->e->k->s->a list2 = g->e->e->k->s->b Output: -1
 *
 *         Input: list1 = g->e->e->k->s->a list2 = g->e->e->k->s Output: 1
 *
 *         Input: list1 = g->e->e->k->s list2 = g->e->e->k->s Output: 0
 */
public class Q3PrintLinkedListMain {

	public static void main(String[] args) {
		String str1 = "avinash";
		String str2 = "jatin";
		
		System.out.println(str1.compareTo(str2));
		
		Q3Node node1 = Q3LinkedList.createLinkedList(str1);
		Q3Node node2 = Q3LinkedList.createLinkedList(str2);
		int res = Q3LinkedList.compareLinkedList(node1, node2);
		System.out.println(res);
	}
}
