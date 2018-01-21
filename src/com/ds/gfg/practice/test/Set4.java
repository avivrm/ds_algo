package com.ds.gfg.practice.test;

public class Set4 {
	
	public static void main(String[] args) {
		int a = 4;
		fun(a);
	}
	
	static void fun(int x)
	{
	  if(x > 0)
	  {
	     fun(--x);
	     System.out.println(x);
	     fun(--x);
	  }
	}
}