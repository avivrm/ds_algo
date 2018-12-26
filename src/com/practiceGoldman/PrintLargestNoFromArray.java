package com.practiceGoldman;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

                        // 21. Largest No from Array //

/**
 *      The main function that prints the
 *      arrangement with the largest value.
 *      The function accepts a vector of strings
 *
 *      e.g {"1","34","3","98","9","76","45","4"}  -> output should be 998764543431
 *
 */

class PrintLargestNoFromArray {

    static void printLargest(Vector<String> arr){

        Collections.sort(arr, new Comparator<String>(){

            @Override
            public int compare(String X, String Y) {

                String XY=X + Y;

                String YX=Y + X;

                return XY.compareTo(YX) > 0 ? -1:1;
            }
        });

        Iterator it = arr.iterator();

        while(it.hasNext())
            System.out.print(it.next());

    }

    public static void main (String[] args) {

        Vector<String> arr;
        arr = new Vector<>();

        //output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);

        // output should be 777776
        /* arr.add("7");
        arr.add("776");
        arr.add("7");
        arr.add("7");
        */
    }
}
