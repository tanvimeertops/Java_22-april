package com.exception;
/*
 * Exception: any abnormal condition:
 * Errors:
 * Compile time : ;,} missing (syntax error)
 * runtime : Arithmetic exception ,number format exception
 * error: developer mistake 
 * 
 * try : 
 * 	1.if we have a doubt that any may have error use try with that code
 * 	2. errors are thrown at catch block
 * 	3. the line from which error is there, that line will be skipped 
 * and rest of the lines will be executed
 * catch :catch the error and trace back the error
 * finally :whether error in there or not finally will executed
 * throw 
 * throws
 * 
 */
public class ExceptionDemo {
public static void main(String[] args) {
	int a=10,b=0;
	int[] x=new int[3];
	try {
		
		System.out.println("div is :"+a/b);
		for (int i = 1; i <=4; i++) {
			x[i]=i;
			System.out.println(x[i]);
		}
	} catch (Exception e) {
	}
	
	finally {
		System.out.println("Hi name is Tops");
	}
	
	System.out.println("This code is written by tops on 22 sep");
}
}
