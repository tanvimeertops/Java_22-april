package com.oops;
/*
 * Array: collection of  data of similar type
 * single dimension:
 * 
 * multi dimension
 * 2D
 * jagged array
 * 
 * starts with 0
 * size=length-1 
 */
public class ArrayDemo {
public static void main(String[] args) {
	//declare
	int[] a=new int[5];
	
	for (int i = 0; i <5; i++) { //0 to 5 6
		a[i]=i+1;//1 2 3 4 5 
	}
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
