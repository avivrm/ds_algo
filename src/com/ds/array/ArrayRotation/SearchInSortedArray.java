package com.ds.array.ArrayRotation;

import com.util.MyUtility;

public class SearchInSortedArray {

    public static void main(String[] args) {
        // Let us search 3 in below array
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = arr.length;
        int key = 3;
        System.out.println("Index of the element is : "
                + pivotedBinarySearch(arr, n, key));
    }

    static int pivotedBinarySearch(int arr[], int n, int key)
    {
        int pivot = MyUtility.getPivotFromArray(arr, 0, n-1);

        // If we didn't find a pivot, then
        // array is not rotated at all
        if (pivot == -1)
            return binarySearch(arr, 0, n-1, key);

        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot-1, key);
        return binarySearch(arr, pivot+1, n-1, key);
    }

    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;

        /* low + (high - low)/2; */
        int mid = (low + high)/2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid -1), key);
    }

}
