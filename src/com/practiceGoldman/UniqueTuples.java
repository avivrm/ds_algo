package com.practiceGoldman;

import java.util.HashSet;
import java.util.Set;

public class UniqueTuples {

    public static Set<String> uniqueTuples(String input, int len ) {

        var result = new HashSet<String>();
        int inputLength = input.length();

        for (int i = 0; i < (inputLength - len + 1); i++) {
            result.add(input.substring(i, (i + len)));
        }
        return result;
    }

    public static void main( String[] args ) {
        String input = "aab";
        Set<String> result = uniqueTuples( input, 2 );
        if( result.contains( "aa" ) && result.contains( "ab" ) ) {
            System.out.println( "Test passed." );

        } else {
            System.out.println( "Test failed." );

        }
    }

}
