package com.tree;

import java.util.Stack;

public class TraverseWithoutRecursion {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void inOrder(Node root){
        if(root == null)
        {
            System.out.println("root  is null");
            return;
        }

        Node current = null;
        Stack<Node> s = new Stack<>();

        current = root;
        while( current != null || !s.isEmpty()){

            while(current != null){
                s.push(current);
                current = current.left;
            }

            current = s.pop();

            System.out.print(" " + current.data + " ");

            current = current.right;

        }

    }


    static void preOrder(Node root){
        if(root == null)
        {
            System.out.println("root  is null");
            return;
        }

        Node current = null;
        Stack<Node> s = new Stack<>();

        current = root;
        while( current != null || !s.isEmpty()){

            while(current != null){
                System.out.print(" " + current.data + " ");
                s.push(current);
                current = current.left;
            }

            current = s.pop();

            current = current.right;

        }

    }

    static void postOrder(Node root){
        if(root == null)
        {
            System.out.println("root  is null");
            return;
        }

        Node current = null;
        Stack<Node> s = new Stack<>();

        current = root;
        while( current != null || !s.isEmpty()){

            while(current != null){
                s.push(current);
                current = current.left;
            }

            current = s.pop();

           // System.out.print(" " + current.data + " ");

            current = current.right;

        }

    }

    public static void main(String[] args) {
        Node root = new TraverseWithoutRecursion().new Node(1);
        root.left = new TraverseWithoutRecursion().new Node(2);
        root.right = new TraverseWithoutRecursion().new Node(3);
        root.left.left = new TraverseWithoutRecursion().new Node(4);
        root.left.right = new TraverseWithoutRecursion().new Node(5);

        System.out.println("\nPrint PreOrder");
        preOrder(root);

        System.out.println("\nPrint InOrder");
        inOrder(root);

        /*System.out.println("\nPrint PostOrder");
        postOrder(root);*/
    }
}
