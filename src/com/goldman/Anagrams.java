package com.goldman;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

                                        // 2. Anagrams //

/**
 * This program prints set of anagrams together in given string
 *
 * eg.
 * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
 *
 */


/**  ALGO
     ---
     ---

1) Create two auxiliary arrays index[] and words[]. Copy all given words to words[] and store the original indexes in index[]
index[]:  0   1   2   3   4
words[]: cat dog tac god act

2) Sort individual words in words[]. Index array doesn’t change.
index[]:   0    1    2    3    4
words[]:  act  dgo  act  dgo  act

3) Sort the words array. Compare individual words using strcmp() to sort
index:     0    2    4    1    3
words[]:  act  act  act  dgo  dgo

4) All anagrams come together. But words are changed in words array. To print the original words, take index from the index array and use it in the original array. We get
"cat tac act dog god"
 */

public class Anagrams {
    // class for each word of duplicate array
    static class Word {
        String str; // to store word itself
        int index; // index of the word in the
        // original array

        // constructor
        Word(String str, int index)
        {
            this.str = str;
            this.index = index;
        }
    }

    // class to represent duplicate array.
    static class DupArray {
        Word[] array; // Array of words
        int size; // Size of array

        // constructor
        public DupArray(String str[], int size)
        {
            this.size = size;
            array = new Word[size];

            // One by one copy words from the
            // given wordArray to dupArray
            int i;
            for (i = 0; i < size; ++i) {
                // create a word Object with the
                // str[i] as str and index as i
                array[i] = new Word(str[i], i);
            }
        }
    }

    // Compare two words. Used in Arrays.sort() for
    // sorting an array of words
    static class compStr implements Comparator<Word> {
        public int compare(Word a, Word b)
        {
            return a.str.compareTo(b.str);
        }
    }

    // Given a list of words in wordArr[],
    static List<String> printAnagramsTogether(String wordArr[],
                                      int size)
    {
        // Step 1: Create a copy of all words present
        // in given wordArr. The copy will also have
        // original indexes of words
        DupArray dupArray = new DupArray(wordArr, size);

        // Step 2: Iterate through all words in
        // dupArray and sort individual words.
        int i;
        for (i = 0; i < size; ++i) {
            char[] char_arr = dupArray.array[i].str.toCharArray();
            Arrays.sort(char_arr);
            dupArray.array[i].str = new String(char_arr);
        }

        // Step 3: Now sort the array of words in
        // dupArray
        Arrays.sort(dupArray.array, new compStr());

        // Step 4: Now all words in dupArray are together,
        // but these words are changed. Use the index
        // member of word struct to get the corresponding
        // original word
        List<String> anagrams = new LinkedList<>();
        for (i = 0; i < size; ++i)
        {
            System.out.print(wordArr[dupArray.array[i].index] + " ");
            anagrams.add(wordArr[dupArray.array[i].index]);
        }
        return anagrams;
    }

    // Driver program to test above functions
    public static void main(String args[])
    {
        String wordArr[] = { "cat", "dog", "tac", "god", "act" };
        int size = wordArr.length;
        printAnagramsTogether(wordArr, size);


        /*String[] expected = {"cat", "tac", "act", "dog", "god"};


        boolean result = true;
        result &= Arrays.equals(expected, printAnagramsTogether(wordArr, size).toArray());

        if(result){
            System.out.println("All test passed");
        }else{
            System.out.println("All test failed");
        }*/

    }
}