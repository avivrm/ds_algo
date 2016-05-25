package com.core.cci.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Program to sort a stack with the help of just one extra stack.
 * NOTE: This program is better than the solution given in CCI (Cracking The Coding Interview) in terms of time. 
 * @author Jatin Sehgal <v-jsehgal@expedia.com>
 *
 */
public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> numStack = new Stack<>();
		List<Integer> numList = Arrays.asList(new Integer[]{2, 8, 5, 11, 15, 6});
//		List<Integer> numList = Arrays.asList(new Integer[]{2});
		numStack.addAll(numList);
		System.out.println(sortStack(numStack));
	}
	
	public static Stack<Integer> sortStack(Stack<Integer> numStack) {
		Stack<Integer> sortedStack = new Stack<>();
		int stackSize = numStack.size();
		int num = numStack.pop();
		while(sortedStack.size() < stackSize) {
			if(!sortedStack.isEmpty() && sortedStack.peek() > num) {
				numStack.push(sortedStack.pop());
			} else {
				sortedStack.push(num);
				if(!numStack.isEmpty())
				num = numStack.pop();
			}
		}
		return sortedStack;
	}
}
