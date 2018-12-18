package com.ds.binaryTree.bfs;

import com.ds.binaryTree.insertion.TreeNode;

public class LevelOrderTraverse {

    static TreeNode root;

    /* function to print level order traversal of tree*/
    static void printLevelOrder(TreeNode root)
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    static int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else
        {
            int lheight = 0;
            int rheight = 0;
            /* compute  height of each subtree */
                lheight = height(root.getLeft());

                rheight = height(root.getRight());

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    /* Print nodes at the given level */
   static void printGivenLevel (TreeNode root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getVal() + " ");
        else if (level > 1)
        {
            printGivenLevel(root.getLeft(), level-1);
            printGivenLevel(root.getRight(), level-1);
        }
    }


    public static void main(String[] args) {
        root = new TreeNode(10);
        root.setLeft(new TreeNode(11));
        root.getLeft().setLeft(new TreeNode(7));
        root.setRight(new TreeNode(9));
        root.getRight().setLeft(new TreeNode(15));
        root.getRight().setRight(new TreeNode(8));

        printLevelOrder(root);
    }
}
