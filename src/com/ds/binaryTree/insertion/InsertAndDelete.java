package com.ds.binaryTree.insertion;

import com.util.MyUtility;

import java.util.LinkedList;
import java.util.Queue;

public class InsertAndDelete {

    static TreeNode root;

    static void insert(TreeNode temp, int key){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(temp);

        while(!queue.isEmpty()){
            temp = queue.peek();
            queue.remove();

            if(temp.getLeft() == null)
            {
                temp.setLeft(new TreeNode(key));
                break;
            }else{
                queue.add(temp.getLeft());
            }

            if(temp.getRight() == null)
            {
                temp.setRight(new TreeNode(key));
                break;
            }else{
                queue.add(temp.getRight());
            }
        }
    }

    static void delete(TreeNode rot, int key){
        TreeNode temp = null;
        TreeNode key_node = null;
        Queue<TreeNode> queue = new LinkedList<>();
        ((LinkedList<TreeNode>) queue).push(root);

        while(!queue.isEmpty()){
            temp = queue.peek();
            queue.remove();

            if(temp.getVal() ==  key)
            {
                key_node = temp;
            }

            if( null != temp.getLeft()){
                ((LinkedList<TreeNode>) queue).push(temp.getLeft());
            }

            if( null != temp.getRight()){
                ((LinkedList<TreeNode>) queue).push(temp.getRight());
            }
        }

        int x = temp.getVal();

        //delete deepest node
            deleteDeepestNode(root, temp);
        // replacing deepest node
        key_node.setVal(x);
    }

    public static void deleteDeepestNode(TreeNode root, TreeNode d_node){
        TreeNode temp = null;
        Queue<TreeNode> queue = new LinkedList<>();
        ((LinkedList<TreeNode>) queue).push(root);

        while(!queue.isEmpty()){
            temp = queue.peek();
            queue.remove();

            if(temp.getLeft() == d_node){
                temp.setLeft(null);
                break;
            }else if(null != temp.getLeft()){
                ((LinkedList<TreeNode>) queue).push(temp.getLeft());
            }

            if(temp.getRight() == d_node){
                temp.setRight(null);
                break;
            }else  if(null != temp.getRight()){
                ((LinkedList<TreeNode>) queue).push(temp.getRight());
            }
        }


    }

    public static void main(String[] args) {

        // Insert  key

        root = new TreeNode(10);
        root.setLeft(new TreeNode(11));
        root.getLeft().setLeft(new TreeNode(7));
        root.setRight(new TreeNode(9));
        root.getRight().setLeft(new TreeNode(15));
        root.getRight().setRight(new TreeNode(8));


       /* System.out.print( "Inorder traversal before insertion:");
        MyUtility.inOrder(root);

        int key = 12;
        insert(root, key);

        System.out.print("\nInorder traversal after insertion:");
        MyUtility.inOrder(root);*/


        // delete key

        System.out.print( "Inorder traversal before insertion:");
        MyUtility.inOrder(root);

        int key = 11;
        delete(root, key);

        System.out.print("\nInorder traversal after insertion:");
        MyUtility.inOrder(root);

    }
}
