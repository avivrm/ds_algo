package com.goldman;


/**
 * Implement a run length encoding function.
 * For a string input the function returns output encoded as follows:
 *
 * "a"     -> "a1"
 * "aa"    -> "a2"
 * "aabbb" -> "a2b3"
 */


public class RunLengthEncoding {

    public static String rle(String input) {

        if(input.isEmpty()){
            return "";
        }

        StringBuffer result = new StringBuffer();

        char lastSeen = 0;
        int count = 1;

        for(int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            if(lastSeen == current){
                count++;
            } else {
                if(lastSeen != 0){
                    result.append(lastSeen).append(count);
                }
                count = 1;
                lastSeen = current;
            }
        }
        result.append(lastSeen).append(count);
        return result.toString();
    }

    public static void main(String[] args)  {

        if("".equals(rle("")) &&
                "a1".equals(rle("a")) &&
                "a3".equals(rle("aaa"))){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}