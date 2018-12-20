package com.practiceGoldman;

public class SnowPack {

    public static int computeSnowpack(Integer[] arr){

        int n = arr.length;

        int snow =0;

        int[] left = new int[n];

        int[] right = new int[n];

        left[0] = arr[0];
        for(int i = 1; i < n-1; i++)
            left[i] =  Math.max(left[i-1], arr[i]);

        right[n-1] = arr[n-1];
        for(int j = n-2; j>=0; j--)
            right[j] = Math.max(right[j+1],arr[j]);


        for(int k = 0;k < n;k++)
            snow += Math.min(left[k], right[k]) - arr[k];

        return snow;
    }

    public static boolean doTestsPass()
    {
        boolean result = true;
        result &= computeSnowpack(new Integer[]{0,1,3,0,1,2,0,4,2,0,3,0}) == 13;

        return result;
    }

    /*
     **  Execution entry point.
     */
    public static void main(String[] args)
    {
        if(doTestsPass())
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("Tests fail.");
        }
    }
}
