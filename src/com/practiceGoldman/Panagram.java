package com.practiceGoldman;

import java.util.SortedSet;
import java.util.TreeSet;

                                // 16 . Panagram //

/**
 * Pangram Finder
 *
 * The sentence "The quick brown fox jumps over the lazy dog" contains
 * every single letter in the alphabet[a-z]. Such sentences are called pangrams.
 * Write a function findMissingLetters, which takes a String `sentence`,
 * and returns all the letters it is missing
 *
 */

class Panagram {

    private static class PanagramDetector {
        static SortedSet<Character> sortedLetters = new TreeSet<Character>();

        static{
            String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < ALPHABET.length(); i++) {
                sortedLetters.add(ALPHABET.charAt(i));
            }
        }

        public String findMissingLetters(String sentence) {
            SortedSet<Character> letters  = new TreeSet<>(sortedLetters);
            String s = sentence.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                letters.remove(s.charAt(i));
            }

            StringBuilder sb = new StringBuilder();
            for (Character c : letters) {
                sb.append(c.charValue());
            }

            return sb.toString();
        }

    }

    public static void main(String[] args) {
        PanagramDetector pd = new PanagramDetector();
        boolean success = true;

        success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
        success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

        if (success) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}