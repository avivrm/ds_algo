package com.gfg.arr.problems;

import java.util.Scanner;

/*
 * Print shortest path to print a string on screen
 */
public class ShortestPath {

	public static void main(String... strings) {
		System.out.println("Enter the alphabets");
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		str = scan.nextLine();
				
		if(str.isEmpty() || null == str){
			str = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
		}
		String[] strArr = str.split(" "); 
		
		System.out.println("Enter the row column value like 2X3");
		//Scanner scan1 = new Scanner(System.in);
		String rowCoulmn = scan.nextLine();
		if(rowCoulmn.isEmpty() || null == rowCoulmn){
			rowCoulmn = "4X5";
		}
		
		String[] rowArr = new String[Integer.valueOf(rowCoulmn.split("X")[0])];
		
		String[] colArr = new String[Integer.valueOf(rowCoulmn.split("X")[1])];
		scan.close();
		
		
		String[][] matrix = convertToMatrix(rowArr,colArr,strArr);
		System.out.println(matrix);
		getShortestPath(matrix,"GEEK");
	}
	
	public static void getShortestPath(String[][] matrix,String word){
	
		System.out.println("Work in Progress");
		
	}
	
	public static String[][] convertToMatrix(String[] rowArr, String[] colArr, String[] strArr){
		
		String[][] matrix = new String[rowArr.length][colArr.length];
		
		for(int i=0;i<rowArr.length;i++){
			for(int j=0;j<colArr.length;j++){
				
				int index = i*colArr.length + j;
				String s = "";
				if(index<=strArr.length)
					s = strArr[index];
				else
					break;
				
				matrix[i][j] = s;
			}
		}
		
		return matrix;
	}

}
