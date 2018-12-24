package com.goldman;

/**
 find the median of the two sorted arrays.
 ex. {1, 3} and {2} is 2

 A Simple Merge based O(n) solution
 to find median of two sorted arrays

 ALGO::

 Method 1: (Linear and Simpler Approach)
 Here we need to find the median of the two sorted arrays of different sizes so we keep two
 variables to point to the arrays and one used to count the no of elements read.
 We used a simple Merge based O(n) solution just we are not merging the array instead
 we are keeping track of the last element read till we reach the median
 There are two cases :

 Case 1: m+n is odd
        Then we will find a clear median at (m+n)/2 index in the array obtained after merging
        both the arrays so we just traverse both the arrays and keep the last value in m1 after the loop,
        m1 will contain the value of the median

 Case 2: m+n is even
        Median will be average of elements at index ((m+n)/2 – 1) and (m+n)/2 in the array obtained
        after merging both the arrays so we need to keep track of not only the last element but also
        the second last element (m2 is used for this) so we traverse both the arrays and keep the last
        value in m1 and second last value in m2 after the loop, (m1+m2)/2 will contain the value of the median.

 */

class MedianOfSortedArrays
{
    public static double findMedianSortedArrays(int[] A, int[] B) {
        int n1 = A.length;
        int n2 = B.length;
        return getMedian(A, B, n1, n2);
    }


    public static double getMedian(int ar1[], int ar2[], int n, int m)
    {
        int i = 0; /* Current index of input array ar1[] */
        int j = 0; /* Current index of input array ar2[] */
        int count;
        double m1 = -1, m2 = -1;

        // Since there are (n+m) elements,
        // There are following two cases
        // if n+m is odd then the middle
        //index is median i.e. (m+n)/2
        if((m + n) % 2 == 1) {
            for (count = 0; count <= (n + m)/2; count++) {
                if(i != n && j != m){
                    m1 = (ar1[i] > ar2[j]) ? ar2[j++] : ar1[i++];
                }
                else if(i < n){
                    m1 = ar1[i++];
                }
                // for case when j<m,
                else{
                    m1 = ar1[j++];
                }
            }
            return m1;
        }

        // median will be average of elements
        // at index ((m+n)/2 - 1) and (m+n)/2
        // in the array obtained after merging ar1 and ar2
        else {
            for (count = 0; count <= (n + m)/2; count++) {
                m2 = m1;
                if(i != n && j != m){
                    m1 = (ar1[i] > ar2[j]) ? ar2[j++] : ar1[i++];
                }
                else if(i < n){
                    m1 = ar1[i++];
                }
                // for case when j<m,
                else{
                    m1 = ar1[j++];
                }
            }
            return (m1 + m2)/2;
        }
    }

    public static boolean doTestsPass()
    {
        boolean result = true;
        result = result && findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4}) == 2.5;
        result = result && findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) == 2.0;
        return result;
    };


    public static void main(String[] args)
    {
        if(doTestsPass())
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("There are test failures");
        }
    }
}