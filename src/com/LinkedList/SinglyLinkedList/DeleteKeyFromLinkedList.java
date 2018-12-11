package com.LinkedList.SinglyLinkedList;

public class DeleteKeyFromLinkedList {

    Node head;

    public void push(Node node){

        if(head == null){
            head = node;
            return;
        }

        Node copyNode = head;

        while(copyNode.getNext() != null){
            copyNode = copyNode.getNext();
        }

        // creating new node
        copyNode.setNext(node);

    }

    public void delete(int key){

        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.getVal() == key)
        {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.getVal() != key)
        {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;

    }

    public void traverseLinkedList(){

        if(head == null)
        {
            System.out.println("Linked List is empty");
            return;
        }

        Node copyNode = head;
        // printing nodes except last one
        while(copyNode.getNext() != null){
            System.out.println(" val at " + copyNode.getVal());
            copyNode = copyNode.getNext();
        }

        // printing last node
        System.out.println(" val at " + copyNode.getVal());

    }

    public static void main(String[] args) {
        DeleteKeyFromLinkedList obj = new DeleteKeyFromLinkedList();
        obj.push(new Node(7));
        obj.push(new Node(2));
        obj.push(new Node(5));
        obj.push(new Node(3));
        obj.push(new Node(8));
        obj.push(new Node(9));
        obj.push(new Node(11));

        // traverse before deletiom
        obj.traverseLinkedList();

        obj.delete(9);

        // traverse after deletiom
        obj.traverseLinkedList();


    }
}
