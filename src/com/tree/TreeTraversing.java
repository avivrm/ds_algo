package com.tree;

public class TreeTraversing {

    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "[ " + data  + " ]";
        }
    }

    static void inOrderTraversal(Node node){
        if(node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(" " + node.data + " ");
        inOrderTraversal(node.right);
    }

    static void preOrderTraversal(Node node){
        if(node == null)
            return;
        System.out.print(" " + node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    static void postOrderTraversal(Node node){
        if(node == null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(" " + node.data + " ");
    }


    public static void main(String[] args) {
        Node root = new TreeTraversing().new Node(1);
        root.left = new TreeTraversing().new Node(2);
        root.right = new TreeTraversing().new Node(3);
        root.left.left = new TreeTraversing().new Node(4);
        root.left.right = new TreeTraversing().new Node(5);


        System.out.println("\nPrint Preorder");
        preOrderTraversal(root);

        System.out.println("\nPrint Inorder");
            inOrderTraversal(root);

        System.out.println("\nPrint Postorder");
            postOrderTraversal(root);

    }
}
