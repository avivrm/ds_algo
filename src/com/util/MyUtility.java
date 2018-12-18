package com.util;

import com.ds.binaryTree.insertion.TreeNode;

public interface MyUtility {

    static int getGCDOfTwoNo(int n, int d){
        if(n<=0 && d<=0)
            return 0;

        int gcd = 1;
        int j = n > d ? d : n;
        for(int i = 1; i <= j; i++){
            if( n%i == 0 && d%i == 0)
                gcd = gcd * i;
        }
        return gcd;
    }


    static int getPivotFromArray(int arr[], int low, int high){
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high)/2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid-1);
        if (arr[low] >= arr[mid])
            return getPivotFromArray(arr, low, mid-1);
        return getPivotFromArray(arr, mid + 1, high);
    }

    static void inOrder(TreeNode temp)
    {
        if (temp == null)
            return;

        inOrder(temp.getLeft());
        System.out.print(temp.getVal()+" ");
        inOrder(temp.getRight());
    }


    static void preOrder(TreeNode temp)
    {
        if (temp == null)
            return;

        System.out.print(temp.getVal()+" ");
        preOrder(temp.getLeft());
        preOrder(temp.getRight());
    }

    static void postOrder(TreeNode temp)
    {
        if (temp == null)
            return;

        postOrder(temp.getLeft());
        postOrder(temp.getRight());
        System.out.print(temp.getVal()+" ");
    }


}