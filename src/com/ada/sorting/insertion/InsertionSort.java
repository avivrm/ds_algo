package com.ada.sorting.insertion;


public class InsertionSort {

	public static void main(String[] args) {
		int[] intArr = {5, 2 , 4, 6 , 1 ,7};
		
		int[] sortedArr = insertionSort(intArr);
		
		for(int val : sortedArr) {
			System.out.println(val);
		}
	}
	
	
	private static int[] insertionSort(int[] intArr) {
		for(int i = 1; i<intArr.length; i++) {
			int key = intArr[i];
			int j = i-1;
			while(j >= 0 && intArr[j] > key) {
				intArr[j + 1] = intArr[j];
				intArr[j] = key;
				j--;
			}
			
		}
		return intArr;
	}
}
