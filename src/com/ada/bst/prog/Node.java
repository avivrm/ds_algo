package com.ada.bst.prog;


public class Node {

	Integer key;
	Node left;
	Node right;
	
	public Node() {
		super();
		this.key = null;
	}
	
	public Node(int key, Node left, Node right) {
		super();
		this.key = key;
		this.left = left;
		this.right = right;
	}
	
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}

}
