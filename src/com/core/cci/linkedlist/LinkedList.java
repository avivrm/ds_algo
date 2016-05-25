package com.core.cci.linkedlist;

import java.util.ArrayList;
import java.util.List;

import com.core.cci.linkedlist.Node;

public class LinkedList<T> {
	

	
	public LinkedList(T[] nodes) {
		createList(nodes);
	}
	
	public LinkedList() {}

	@SuppressWarnings("unchecked")
	private Node<T>[] getNodeList(T[] nodeList) {
		Node<T>[] nodes = new Node[nodeList.length];
		for(int i = 0; i < nodeList.length; i++) {
			nodes[i] = new Node<T>(nodeList[i]);
		}
		return nodes;
	}

	public void createList(T[] nodeList) {
		if(null == nodeList || nodeList.length == 0) {
			System.out.println("creating EMPTY linked list.");
			return;
		}
		Node<T>[] nodes = getNodeList(nodeList);
		head = nodes[0];
		Node<T> node = null;
		for(int i = 1; i < nodes.length; i++) {
			node = nodes[i-1];
			node.setNext(nodes[i]);
		}
		Node<T> lastNode = node.next();
		lastNode.setNext(null);
	}
	
	public void reverse(int limit) {
		head = (limit > 0) ? reverse(limit, head) : reverse(); 
	}
	
	private Node<T> reverse(int limit, Node<T> head) {
		if(null == head) {
			return null;
		}
		Node<T> previous = null; 
		Node<T> current = head;
		Node<T> next = head.next();
		int counter = 0;
		while(null != current && counter++ < limit) {
			current.setNext(previous);
			previous = current;
			current = next;
			if(null != next) {
				next = next.next();
			}
		}
		head.setNext(reverse(limit, current));
		return previous;
	}
	
	public Node<T> reverse() {
		if(null == head) {
			return null;
		}
		Node<T> previous = null; 
		Node<T> current = head;
		Node<T> next = head.next();
		while(null != current) {
			current.setNext(previous);
			previous = current;
			current = next;
			if(null != next) {
				next = next.next();
			}
		}
		head = previous;
		return head;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		if(null == head) {
			return "EMPTY LIST.";
		}
		Node<T> node = head;
		while(null != node) {
			str.append(node.getData());
			if(null != node.next()) {
				str.append("->");
			}
			node = node.next();
		}
		return str.toString();
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	private Node<T> head;
	
	private int length;

	public void removeDuplicate() {
		Node<T> temp = head;
		List<T> unqiueValues = new ArrayList<T>();
		while(null != temp) {
			if(!unqiueValues.contains(temp.getData())) {
				unqiueValues.add(temp.getData());
			}
			temp = temp.next();
		}
		prepareLinkedList(unqiueValues);
	}
	
	public Node<T> prepareLinkedList(T[] values) {
		if(null == values || values.length == 0) {
			head = null;
		} else {
			length = values.length;
			head = new Node<T>(values[0], null);
			Node<T> temp = head;
			for(int i = 1; i < values.length; i++) {
				Node<T> node = new Node<T>(((T)values[i]), null);
				temp.setNext(node);
				temp = node;
			}
		}
		return head;
	}
	
	public Node<T> prepareLinkedList(List<T> values) {
		return prepareLinkedList(((T[])values.toArray()));
	}
	
	public Node<T> prepareLinkedListFromNumber(Integer value) {
		Integer digit = 0;
		Node<T> temp = head;
		Node<T> next;
		while(value != 0) {
			digit = value%10;
			value = value/10;
			if(null == head) {
				head = (Node<T>) new Node<Integer>(digit, null);
				temp = head;
			} else {
				next = (Node<T>) new Node<Integer>(digit, null);
				temp.setNext(next);
				temp = temp.next();
			}
		}
		return head;
	}

	public int getValue() {
		if(null == head) {
			return 0;
		}
		
		int value = 0;
		Node<T> temp = head;
		int multiplicationFactor = 1;
		while(null != temp) {
			value = ((Integer)temp.getData() * multiplicationFactor) + value;
			temp = temp.next();
			multiplicationFactor *= 10;
		}
		return value;
	}
	
	public void displayLinkedList() {
		if(null == head) {
			return;
		}
		System.out.println("\n");
		Node<T> temp = head;
		while(null != temp) {
			System.out.print(temp.getData());
			if(null != temp.next()) {
				System.out.print(" --> ");
			}
			temp = temp.next();
		}
	}

	public Node<T> getHead() {
		return head;
	}

	public int getLength() {
		return length;
	}
	
	/*public int length() {
		if(null == head) {
			return 0;
		}
		Node<T> temp = head;
		int length = 0;
		for(;null != temp;temp = temp.getNextNode(),length++);
		return length;
	}*/

	public boolean checkLoop() {
		if(null == head || null == head.next()) {
			return false;
		}
		Node<T> temp1 = head;
		Node<T> temp2 = temp1;
		while(null != temp1) {
			if(null == temp2.next() || null == temp2.next().next()) {
				return false;
			} else {
				temp2 = temp2.next().next();
			}
			if(temp2.getData().equals(temp1.getData())) {
				return true;
			}
			temp1 = temp1.next();
		}
		return false;
	}
}

