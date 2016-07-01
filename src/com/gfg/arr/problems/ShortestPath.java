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
		
		String[] rowLength = new String[Integer.valueOf(rowCoulmn.split("X")[0])];
		
		String[] colLength = new String[Integer.valueOf(rowCoulmn.split("X")[1])];
		scan.close();
		
		
		String[][] matrix = convertToMatrix(rowLength,colLength,strArr);
		System.out.println(matrix);
		getShortestPath(matrix,
				Integer.valueOf(rowCoulmn.split("X")[0]),
				Integer.valueOf(rowCoulmn.split("X")[1]),
				"GEEK");
	}
	
	public static void getShortestPath(String[][] matrix,int rowLength,
			int colLength,String word){
	
		int rowPos = 0, colPos = 0;
		
		char lastLetter = matrix[rowPos][colPos].charAt(0);
		
		int wordLength = word.length();
		
		for(int i=0;i<wordLength;i++){
			char letter = word.charAt(i);
			
			while(lastLetter != letter){
				if((int)lastLetter < (int)letter){
					
				}else{
					
				}
			}
			
		}
		
	}
	
	
	public int findRowPos(String[][] matrix,int rowLength,
			int colLength,char letter){
	
		for(int i = 0;i<rowLength;i++){
			if((int)matrix[rowLength][0].charAt(0) <= (int)letter 
					&&  
					(int)letter <= (int)matrix[rowLength][colLength].charAt(0)){
				return i;
			}
		}
		
		return -1;
	}
	
	public int findColPos(String[][] matrix,int rowPos,
			int colLength,char letter){
	
		for(int i = 0;i<colLength;i++){
			if((int)matrix[rowPos][i].charAt(0) <= (int)letter 
					&&  
					(int)letter <= (int)matrix[rowPos][colLength].charAt(0)){
				return i;
			}
		}
		
		return -1;
	}
	
	public static String[][] convertToMatrix(String[] rowLength, String[] colLength, String[] strArr){
		
		String[][] matrix = new String[rowLength.length][colLength.length];
		
		for(int i=0;i<rowLength.length;i++){
			for(int j=0;j<colLength.length;j++){
				
				int index = i*colLength.length + j;
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
