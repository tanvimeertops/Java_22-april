package com.oops;
/*
 * combination of row and col
 * 1234
 * 1234
 * 1234
 * 1234
 * 1234
 * 
 */
public class _2D_array {
public static void main(String[] args) {
	int[][] a=new int[5][4];
	
	for (int i = 0; i < a.length; i++) {
		//a[2]
		for (int j = 0; j < 4; j++) {
			a[i][j]=j+1;
			
		}
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < 4; j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
}
}
