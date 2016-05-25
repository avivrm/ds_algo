package com.ds.gfg.linnkedlist;

public class Q1LinkedList {
	
	private Q1Node head;
	private int size;
	
	static String seprator = " --> ";

	Q1LinkedList(){
		// No Initialization
	}
	
	public void createLinkedList(int[] arr){
		int counter = 0;
		while(counter < arr.length){
			Q1Node newNode = new Q1Node();
			newNode.setVal(arr[counter]);
			if(head == null){
				head = newNode;
			}else{
				Q1Node node = head;
				for(int i=0 ;i<counter;i++){
						if(i == counter-1){
							node.setNext(newNode);
						}else{
							node = node.getNext();
						}
				}
			}
			counter++;
		}
		size = counter;
	}
	
	public void reverse(){
		Q1Node node = head;
		Q1Node temp = null;
		for(int i=0;i<size;i++){
			Q1Node newNode = node;
			node = node.getNext();
			newNode.setNext(temp);
			temp = newNode;		
		}
		head = temp;
	}
	
	public Q1Node reverse(Q1Node node,int counter){
		Q1Node current = node;
		Q1Node temp = null;
		for(int count=0;count < counter && current != null ;count++){
			Q1Node newNode = current;
			current = current.getNext();
			newNode.setNext(temp);
			temp = newNode;
		}
		
		if(current != null){
			node.setNext(reverse(current,counter));
		}
		return temp;
	}
	
	public String toString(){
		Q1Node node = head;
		StringBuilder str = new StringBuilder();
		while(node.getNext() != null){
			str.append(node.getVal() + Q1LinkedList.seprator);
			node = node.getNext();
		}
		str.append(node.getVal());
		return str.toString();
		
	}

	public Q1Node getHead() {
		return head;
	}

	public void setHead(Q1Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
