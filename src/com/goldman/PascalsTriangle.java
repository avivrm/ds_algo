package com.goldman;

import java.util.HashMap;
import java.util.Map;

/**
 **  Below formation is called Pascals Triangle.
 **
 **  Example:
 **               1
 **              1 1
 **             1 2 1
 **            1 3 3 1
 **           1 4 6 4 1
 **         1 5 10 10 5 1
 **        1 6 15 20 15 6 1
 **
 **  Complete the 'pascal' function below so that given a
 **  col and a row it will return the value in that positon.
 **
 **  Example, pascal(1,2) should return 2
 **
 */

public class PascalsTriangle {

    public static Map<Integer, Map<Integer, Integer>> pascalHash
            = new HashMap<Integer,Map<Integer,Integer>>();

    public static  int pascal(int col, int row){
        if(col == 0 || col == row) {
            return 1;
        }
        int pascalValue = 0;
        if(pascalHash.containsKey(col)){
            if(pascalHash.get(col).containsKey(row)){
                return pascalHash.get(col).get(row);
            }
            else{
                pascalValue = pascal(col, row - 1) + pascal(col - 1, row - 1);
                //pascalHash.get(col).put(row,pascalValue);
            }
        }
        else{
            pascalValue = pascal(col, row - 1) + pascal(col - 1, row - 1);
            Map<Integer, Integer> rowHashMap = new HashMap();
            rowHashMap.put(row,pascalValue);
            pascalHash.put(col,rowHashMap);
        }
        return pascalValue;
    }

    public static void main(String[] args) {
        if(PascalsTriangle.pascal(0,0) ==  1 &&
                PascalsTriangle.pascal(1,2) ==  2 &&
                PascalsTriangle.pascal(5,6) ==  6 &&
                PascalsTriangle.pascal(4,8) ==  70 &&
                PascalsTriangle.pascal(6,6) ==  1) {
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }
    }
}
