package com.core.cci.linkedlist;

public class Node<T> {

	public Node() {
		
	}
	public Node(T value) {
		this.data = value;
	}
	public Node(T value, Node<T> next) {
		this(value);
		this.next = next;
	}
	private T data;
	private Node<T> next;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> next() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
}
