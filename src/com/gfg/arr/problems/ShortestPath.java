package com.gfg.arr.problems;

import java.util.Scanner;

/*
 * Print shortest path to print a string on screen
 */
public class ShortestPath {

	public static void main(String... strings) {
		
		String[][] staticMatrix = {{"A","B","C","D","E"},{"F","G","H","I","J"},{"K","L","M","N","O"}
		,{"P","Q","R","S","T"},{"U","V","W","X","Y"},{"Z","a","b","c","d"}}; 
		
		/*System.out.println("Enter the alphabets");
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
		scan.close();*/
		
		
	//	String[][] matrix = convertToMatrix(rowLength,colLength,strArr);
	//	System.out.println(matrix);
		getShortestPath(staticMatrix,6,5,"GEEK");
	}
	
	public static void getShortestPath(String[][] matrix,int rowLength,
			int colLength,String word){
	
		int rowPos = 0, colPos = 0;
		
		char lastLetter = matrix[rowPos][colPos].charAt(0);
		
		int wordLength = word.length();
		
		for(int i=0;i<wordLength;i++){
			char letter = word.charAt(i);
			
			int letterRowPos = findRowPos(matrix,rowLength,colLength-1,letter);
			int letterColPos = findColPos(matrix,letterRowPos,colLength,letter);
			
			while(lastLetter != letter){
				if(rowPos == letterRowPos && colPos == letterColPos){
					lastLetter = letter;
				}else if(rowPos<letterRowPos){
					System.out.println("Move Down");
					rowPos++;
				}else if(rowPos>letterRowPos){
					System.out.println("Move Up");
					rowPos--;
				}else if(colPos<letterColPos){
					System.out.println("Move Right");
					colPos++;
				}else if(colPos>letterColPos){
					System.out.println("Move left");
					colPos--;
				}
			}
	
			System.out.println("Ok");
			
		}
		
	}
	
	public static int findRowPos(String[][] matrix,int rowLength,
			int colLength,char letter){
	
		for(int i = 0;i<rowLength;i++){
			if((int)matrix[i][0].charAt(0) <= (int)letter 
					&&  
					(int)letter <= (int)matrix[i][colLength].charAt(0)){
				return i;
			}
		}
		return -99;
	}
	
	public static int findColPos(String[][] matrix,int letterRowPos,
			int colLength,char letter){
	
		for(int i = 0;i<colLength;i++){
			if((int)matrix[letterRowPos][i].charAt(0) == (int)letter){
				return i;
			}
		}
		return -99;
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
