package com.ada.bst.prog;

/*
 * Print like left root right node
 * 
 * Here we are printing this as a recursive
 * 
 */

public class InOrder {

	public static void main(String[] args) {
		int[] intArr = {5,4,1,9,10,6,7};
		Node inOrderTree = createInorderTree(intArr);
	}
	
	public static Node createInorderTree(int[] intArr) {
		Node root = new Node();
		int lastValue = 0;
		for(int val : intArr) {
			lastValue = val;
			
			if(null == root.getKey()) {
				root.setKey(val);
				continue;
			}
			
			Node newNode = new Node();
			newNode.setKey(val);
			
			if(val > lastValue) {
				root.setRight(newNode);
			}else {
				root.setLeft(newNode);
			}
		}
		return root;
	}
}
