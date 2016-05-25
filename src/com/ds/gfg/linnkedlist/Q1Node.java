package com.ds.gfg.linnkedlist;

public class Q1Node {
	private int val;
	private Q1Node next;

	public Q1Node() {
		val = 0;
		next = null;
	}

	public Q1Node(int v, Q1Node n) {
		val = v;
		next = n;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Q1Node getNext() {
		return next;
	}

	public void setNext(Q1Node next) {
		this.next = next;
	}

	
}
