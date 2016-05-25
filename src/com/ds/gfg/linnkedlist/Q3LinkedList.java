package com.ds.gfg.linnkedlist;

public class Q3LinkedList {

	
	public static Q3Node createLinkedList(String str){
		Q3Node head = null;
		Q3Node current = null;
		for(int i = 0;i<str.length();i++){
			char charr =str.charAt(i);
			Q3Node node = new Q3Node();
			node.setAlphabet(charr);
			if(head == null){
				head = node;
				current = head;
			}else{
				current.setNext(node);
				current = node;
			}
		}
		return head;
	}
	
	public static int compareLinkedList(Q3Node node1,Q3Node node2){
		int sum = 0;
		while(node1 != null || node2 != null)
		{
			if(node1 != null && node2 != null)
			{
				char char1= node1.getAlphabet();
				char char2= node2.getAlphabet();
				
				//sum	= sum + (char1>char2?1:-1);
				
				int ascii1 = (int) char1;
				int ascii2 = (int) char2;
				sum = sum + (ascii1-ascii2);
				node1 = node1.getNext();
				node2 = node2.getNext();
			}else if(node1 != null){
				sum = sum + 1;
				node1 = node1.getNext();
			}else if(node2 != null){
				sum = sum - 1;
				node2 = node2.getNext();
			}
		}
		return sum;
	}
}
