package com.ds.gfg.practice.test;

public class Set3 {

	static int LIMIT = 1000;
	
	public static void main(String[] args) {
		fun2(5);
	}
	
	static void fun1(int n)
	{
	   int i = 0;  
	   if (n > 1)
	     fun1(n-1);
	   for (i = 0; i < n; i++)
	     System.out.println(" * ");
	}
	
	static void fun2(int n)
	{
		  if (n <= 0)
		     return;
		  if (n > LIMIT)
		    return;
		  System.out.println(n);
		  fun2(2*n);
		  System.out.println(n);
		}   
}
