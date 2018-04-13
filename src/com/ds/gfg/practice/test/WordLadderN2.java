package com.ds.gfg.practice.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class WordLadderN2 {

	public static int ladderLength(String start, String end, Set<String> dict) {
        if (start == null || end == null || dict == null || dict.size() == 0) {
                return 0;
        }
            Queue<String> queue = new LinkedList<String>();
            queue.offer(start);
            dict.remove(start);
            int length = 1;

            while (!queue.isEmpty()) 
            {
                int count = queue.size();
                
                for (int i = 0; i < count; i++) 
                {
                    String current = queue.poll();
                    for (int j = 0; j < current.length(); j++) 
                    {
                        for (char c = 'a'; c <= 'z'; c++) 
                        {
                            if (c == current.charAt(j)) {
                                    continue;
                            }

                            String temp = replace(current, j, c);

                            if (temp.equals(end)) {
                                    return length + 1;
                            }

                            if (dict.contains(temp)) {
                                    queue.offer(temp);
                                    dict.remove(temp);
                            }
                        }
                    }
                }
                length++;
            }
            return 0;
    }

	private static String replace(String s, int index, char c) {
		char[] chars = s.toCharArray();
		chars[index] = c;
		return new String(chars);

	}
	
	public static void main(String[] args) {
		String start = "toon";
		String end = "plea";
		Set dict = new HashSet<String>();
		dict.add("poon");dict.add("plee");dict.add("same");dict.add("poie");dict.add("plea");dict.add("plie");dict.add("poin");
		System.out.println(ladderLength(start, end, dict));
	}
}
