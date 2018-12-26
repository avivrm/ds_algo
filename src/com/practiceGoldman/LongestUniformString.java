package com.practiceGoldman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

                                // 12. Longest Uniform String //

/**
 *
 *  e.g.
 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
 */

public class LongestUniformString {

    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

    static int[] longestUniformSubstring(String input){
        int longestStart = -1;
        int longestLength = 0;
        int count = 1;
        int length = input.length();

        while(count < length) {
            int start = count - 1;
            int currentLength = 1;
            while(count < length && input.charAt(count) == input.charAt(count - 1) ){
                count++;
                currentLength++;
            }
            if(currentLength > longestLength){
                longestStart = start;
                longestLength = currentLength;
            }
            count++;
        }
        
        return new int[]{ longestStart, longestLength };
    }

    public static void main(String[] args) {
        testCases.put("", new int[]{-1, 0});
        testCases.put("10000111", new int[]{1, 4});
        testCases.put("aabbbbbCdAA", new int[]{2, 5});

        boolean pass = true;
        for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
            int[] result = longestUniformSubstring(testCase.getKey());
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if(pass){
            System.out.println("All tests pass!");
        } else {
            System.out.println("At least one failure! :( ");
        }
    }
}