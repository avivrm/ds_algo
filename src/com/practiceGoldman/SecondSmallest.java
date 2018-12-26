package com.practiceGoldman;

                                // 26. Second Smallest //

public class SecondSmallest {
    public static int secondSmallest(int[] x) {

        if (x.length < 2) {
            return x[0];
        }

        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        int Elem;

        for (int i = 0; i < x.length; i++) {
            Elem = x[i];
            if (Elem < smallest) {
                secSmallest = smallest;
                smallest = Elem;
            } else if (Elem < secSmallest) {
                secSmallest = Elem;
            }
        }
        return (secSmallest);
    }

    public static void main(String args[]) {

        int[] a = { 0 };
        int[] b = { 0, 1 };

        boolean result = true;
        result &= secondSmallest(a) == 0;
        result &= secondSmallest(b) == 1;

        if (result) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}