package com.gfg.arr.problems.september;

/*
 * Program for array rotation
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * 
 * 
 *  METHOD 1 (Use temp array)
*
*	Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
*	1) Store d elements in a temp array
	   temp[] = [1, 2]
	2) Shift rest of the arr[]
	   arr[] = [3, 4, 5, 6, 7, 6, 7]
	3) Store back the d elements
	   arr[] = [3, 4, 5, 6, 7, 1, 2]
	Time complexity O(n)
	Auxiliary Space: O(d)
	
	
	
	METHOD 2 (Rotate one by one)
	
	leftRotate(arr[], d, n)
	start
	  For i = 0 to i < d
	    Left rotate all elements of arr[] by one
	end
 * 
 * 
 */

public class ArrayRotation {

	public static void main(String[] args) {
		Object[] arr = {4,2,8,6,3,5,8,92};
		int rotateByNumber = 4;
		int size = 8;
		/*String msg = "Array before rotation";
		print(arr,msg);
		Object[] objArr = rotate(arr, rotateByNumber, size);
		msg = "Array after rotation";
		print(objArr,msg);*/
		
		
		print(arr,"before rotation");
		for(int i =0; i<rotateByNumber; i++){
			rotateOneByOne(arr,size);
		}
		print(arr,"after rotation");
	}
	
	public static void rotateOneByOne(Object[] arr, int sizeOfArr) {
		Object temp = arr[0];
		for(int i = 0; i<sizeOfArr-1;i++){
			arr[i] = arr[i+1];
		}
		arr[sizeOfArr-1] = temp;
	}
	
	public static Object[] rotate(Object[] arr, int rotateByNumber, int sizeOfArr) {
		Object[] newArr = new Object[sizeOfArr];
		for(int i = 0,j = (rotateByNumber); j < sizeOfArr; i++,j++){
			newArr[i] = arr[j];
		}
		
		for(int i = (sizeOfArr - rotateByNumber), j = 0; j < rotateByNumber;i++,j++){
			newArr[i] = arr[j];
		}
		return newArr;
	} 
	
	public static void print(Object[] arr,String msg) {
		System.out.println(msg);
		for(Object obj : arr) {
			System.out.print( obj.toString() + " " );
		}
		System.out.println("");
	}
}
