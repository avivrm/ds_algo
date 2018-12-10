package com.array.ArrayRotation;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int size = arr.length;
        int d = 1;

        //Juggle Algorithm
        juggleAlgo(arr, size, d);
        for (int val : arr)
            System.out.print(String.format(" %d ",val));

        //reverse
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        reverseAlgo(arr2, size, d);
        for (int val : arr2)
            System.out.print(String.format(" %d ",val));

    }

    public static void juggleAlgo(int arr[], int n, int d){
        int i, j, k, temp;
        for (i = 0; i < d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }


    public static void reverseAlgo(int arr[], int n, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
