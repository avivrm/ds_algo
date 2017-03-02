package com.gfg.random.problem;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * http://www.geeksforgeeks.org/print-all-jumping-numbers-smaller-than-or-equal-to-a-given-value/
 */
public class JumpingProblem {

	public static void main(String...strings)
	{
		printJumping(15);
	}
	
	private static void printJumping(int x){
		System.out.println(0 + " ");
		for(int i=1; i<=9 && i<=x; i++){
			bfs(x,i);
		}
	}
	private static void bfs(int x, int num){
		Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
		queue.add(num);
		while(!queue.isEmpty()){
			num = queue.poll();
			
			if(num < x){
				System.out.println("-------------------------------");
				System.out.println(num + " ");
				int last_dig = num % 10;
				System.out.println("Last digit : "+ last_dig);
				
				if (last_dig == 0)
				{
					System.out.println((num*10) + (last_dig+1));
	                queue.add((num*10) + (last_dig+1));
				}
	 
	            // If last digit is 9, append previous digit only
	            else if (last_dig == 9){
	            	System.out.println((num*10) + (last_dig-1));
	            	queue.add( (num*10) + (last_dig-1) );
	            }
	            	
	 
	            // If last digit is neighter 0 nor 9, append both 
	            // previous and next digits
	            else
	            {
	            	queue.add((num*10) + (last_dig-1));
	            	queue.add((num*10) + (last_dig+1));
	            	System.out.println((num*10) + (last_dig+1));
	            	System.out.println((num*10) + (last_dig-1));
	            }
				
				System.out.println("-------------------------------");
			}
		}
	}
}
