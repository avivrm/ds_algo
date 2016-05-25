package com.ds.gfg.linnkedlist;

public class Q2LinkedList {

	public Q2Node createLinkedList(int[] intArr){
		Q2Node head = null;
		Q2Node current = null;
		for(int i=0;i<intArr.length;i++){
			Q2Node node = new Q2Node();
			node.setData(intArr[i]);
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
	
	public Q2Node mergeLinkedList(Q2Node node1,Q2Node node2){
		Q2Node res = null;
		while(node1 != null || node2 != null){
			if(node1 != null && node2 != null){
				if(node1.getData() <= node2.getData()){
					Q2Node newNode = node1;
					node1 = node1.getNext();
					newNode.setNext(res);
					res = newNode;
				}else{
					Q2Node newNode = node2;
					node2 = node2.getNext();
					newNode.setNext(res);
					res = newNode;
				}
			}else if(node1 != null){
				Q2Node newNode = node1;
				node1 = node1.getNext();
				newNode.setNext(res);
				res = newNode;
			}else if(node2 != null){
				Q2Node newNode = node2;
				node2 = node2.getNext();
				newNode.setNext(res);
				res = newNode;
			}
		}
		return res;
	}
	
	public String toString(Q2Node node){
		StringBuilder str = new StringBuilder();
		while(node.getNext() != null){
			str.append(node.getData() + Q1LinkedList.seprator);
			node = node.getNext();
		}
		str.append(node.getData());
		return str.toString();
		
	}
	
}
