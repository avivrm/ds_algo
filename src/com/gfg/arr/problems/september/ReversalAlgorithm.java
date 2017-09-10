package com.gfg.arr.problems.september;


/*
 * Reversal algorithm for array rotation
Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.

Example:

Input:  arr[] = [1, 2, 3, 4, 5, 6, 7]
            d = 2
Output: arr[] = [3, 4, 5, 6, 7, 1, 2] 

*
*
*/

public class ReversalAlgorithm {
	public static void main(String[] args) {
		Object[] arr = {1, 2, 3, 4, 5, 6, 7};
		int rotateByNumber = 2;
		int size = 7;
		
		//rotationAlgo(arr,rotateByNumber,size);
		
		reverseArrayByGFG(arr, 0, rotateByNumber);
		reverseArrayByGFG(arr, rotateByNumber, size);
		reverseArrayByGFG(arr, 0, size);
		
		print(arr, "Print Reversed Array");
	}
	
	public static void reverseArrayByGFG(Object[] arr, int startIndex, int endIndex) {
		while(startIndex<endIndex) {
			Object temp = arr[startIndex];
			arr[startIndex] = arr[endIndex-1];
			arr[endIndex-1] = temp;
			startIndex++;
			endIndex--;
		}
	}
	 
	public static void rotationAlgo(Object[] arr, int rotateByNumber, int size) {
		Object[] arrA = getSubArray(arr, 0, rotateByNumber);
		Object[] arrB = getSubArray(arr, rotateByNumber, size);
		
		Object[] arrAReverse = reverseArray(arrA);
		Object[] arrBReverse = reverseArray(arrB);
		
		Object[] concatedArray = concatArray(arrAReverse, arrBReverse);
		
		printArrayReverse(concatedArray);
	}
	
	public static Object[] getSubArray(Object[] oldArr, int startIndex, int endIndex) {
		Object[] newArray = new Object[endIndex - startIndex];
		for(int j = 0, i = startIndex; i< endIndex;i++,j++){
			newArray[j] = oldArr[i]; 
		}
		return newArray;
	}
	
	public static Object[] reverseArray(Object[] oldArr) {
		int size = oldArr.length -1;
		Object[] newArr = new Object[oldArr.length];
		for(int i=0,j=size;i<=size;i++,j--){
			newArr[i] = oldArr[j];
		}
		return newArr;
	}
	
	public static Object[] concatArray(Object[] a, Object[] b) {
		int length = a.length + b.length;
        Object[] result = new Object[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
	}
	
	public static void printArrayReverse(Object[] arr) {
		int len = arr.length;
		for(int i = len-1; i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
	}
	

	public static void print(Object[] arr,String msg) {
		System.out.println(msg);
		for(Object obj : arr) {
			System.out.print( obj.toString() + " " );
		}
		System.out.println("");
	}
}
