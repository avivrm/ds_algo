package com.quovantis.program.reverselinklist;

public class LinkedListReverse {
    
    public static void main(String args[]) {
         
        //Preparing some linked list structure
        LinkedList linkedList = new LinkedList(5);
        linkedList.next = new LinkedList(4);
        linkedList.next.next = new LinkedList(3);
        linkedList.next.next.next = new LinkedList(2);
        linkedList.next.next.next.next = new LinkedList(1);
 
        System.out.println("Original Linked List: " + linkedList.toString());
 
        //recursively reverse and print
        linkedList = recursiveReverse(linkedList);
        System.out.println("Recursively Reversed List: "
                + linkedList.toString());
 
        //iteratively reverse and print
        linkedList = iterativeReverse(linkedList);
        System.out.println("Iteratively Recursed to Original: "
                + linkedList.toString());
    }
 
    /**
     * This method uses recursive method to reverse a singly linked list.
     */
    public static LinkedList recursiveReverse(LinkedList linkedList) {
 
        // check for empty or size 1 linked list. This is a base condition to
        // terminate recursion.
        if (linkedList == null || linkedList.next == null) {
            return linkedList;
        }
 
        LinkedList remainingReverse = recursiveReverse(linkedList.next);
 
        // update the tail as beginning
        LinkedList current = remainingReverse;
        while (current.next != null) {
            current = current.next;
 
        }
        // assign the head as a tail
        current.next = linkedList;
        linkedList.next = null;
 
        return remainingReverse;
    }
 
    /**
     * This method uses iterative approach to reverse a singly linked list.
     */
    public static LinkedList iterativeReverse(LinkedList linkedList) {
 
        if (linkedList == null || linkedList.next == null) {
            return linkedList;
        }
 
        LinkedList prevNode, currNode, nextNode;
        prevNode = null;
        nextNode = null;
        currNode = linkedList;
 
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
 
        return prevNode;
    }
 
}
