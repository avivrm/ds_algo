package com.goldman;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static char findFirst(String str)
    {
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        for (char c : str.toCharArray())
        {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }

        for (Map.Entry<Character,Integer> entry : counts.entrySet())
        {
            if (entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }

        throw new RuntimeException("didn't find any non repeated Character");

    }


    public static void main(String[] args){
        String[] inputs = {"apple","racecars", "ababdc"};
        char[] outputs = {'a', 'e', 'd' };

        boolean result = true;
        for(int i = 0; i < inputs.length; i++ )
        {
            result = result && findFirst(inputs[i]) == outputs[i];
            if(!result)
                System.out.println("Test failed for: " + inputs[i]);
            else
                System.out.println("Test passed for: " + inputs[i]);
        }

    }
}
