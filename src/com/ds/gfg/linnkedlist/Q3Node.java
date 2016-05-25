package com.ds.gfg.linnkedlist;

public class Q3Node {
	char alphabet;
	Q3Node next;
	
	Q3Node(){
		alphabet = 0;
		next = null;
	}

	public char getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(char alphabet) {
		this.alphabet = alphabet;
	}

	public Q3Node getNext() {
		return next;
	}

	public void setNext(Q3Node next) {
		this.next = next;
	}
}
