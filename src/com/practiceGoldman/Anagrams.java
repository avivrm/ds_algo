package com.practiceGoldman;

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
    static class Word {
        String str;

        int index;

        Word(String str, int index)
        {
            this.str = str;
            this.index = index;
        }
    }

    static class DupArray {
        Word[] array;
        int size;

        public DupArray(String str[], int size)
        {
            this.size = size;
            array = new Word[size];

            int i;

            for (i = 0; i < size; ++i) {
                array[i] = new Word(str[i], i);
            }
        }
    }

    static class compStr implements Comparator<Word> {
        public int compare(Word a, Word b)
        {
            return a.str.compareTo(b.str);
        }
    }

    static List<String> printAnagramsTogether(String wordArr[],
                                      int size)
    {
        DupArray dupArray = new DupArray(wordArr, size);
        int i;

        for (i = 0; i < size; ++i) {
            char[] char_arr = dupArray.array[i].str.toCharArray();
            Arrays.sort(char_arr);
            dupArray.array[i].str = new String(char_arr);
        }

        Arrays.sort(dupArray.array, new compStr());

        List<String> anagrams = new LinkedList<>();
        for (i = 0; i < size; ++i)
        {
            System.out.print(wordArr[dupArray.array[i].index] + " ");
            anagrams.add(wordArr[dupArray.array[i].index]);
        }
        return anagrams;
    }

    public static void main(String args[])
    {
        String wordArr[] = { "cat", "dog", "tac", "god", "act" };
        int size = wordArr.length;
        printAnagramsTogether(wordArr, size);
    }
}