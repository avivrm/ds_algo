package com.LinkedList.SinglyLinkedList;

public class Node {

    private int val;
    public Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }

    public int getVal() {
        return val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
