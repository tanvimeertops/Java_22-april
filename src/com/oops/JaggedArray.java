package com.oops;

import java.util.Scanner;

/*
 * jagged array :same like 2D array
 * 123   3
 * 1	 1	
 * 12345 5
 * 12    2
 */
public class JaggedArray {
public static void main(String[] args) {
	int nrow,ncol;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of row:");
	nrow=sc.nextInt();//nrow
	
	int[][] a=new int[nrow][];
	
	for (int i = 0; i < a.length; i++) {
		System.out.println("enter no of col for row no "+(i+1)+": ");
		ncol=sc.nextInt();//3
		a[i]=new int[ncol];//a[0] = 3
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=j+1;
			
		}
		
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
}
}
