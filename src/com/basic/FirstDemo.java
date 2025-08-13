package com.basic;

import java.awt.print.Printable;

public class FirstDemo {
public static void main(String[] args) {
	int i1=2147483647; //4 bytes
	long l1=848458454656l; //8 bytes
	float f1=8545.6767f;//4 bytes
	double d1=984595.5656;//8 bytes
	char ch='d';//2 bytes
	boolean bb=true;//1 bit
	byte b1=127;//1 byte
	
	System.out.println("Integer value :"+i1);
	System.out.println("long value :"+l1);
	System.out.println("float value :"+f1);
	
	System.out.println("Size of Integer is :"+Integer.BYTES+ " bytes");
	System.out.println("Size of Long is :"+Long.BYTES+ " bytes");
	System.out.println("Size of float is :"+Float.BYTES+ " bytes");
	
	/*
	System.out.println("Hello");
	System.out.println(10+20);
	System.out.println("10+20");
	System.out.println("10"+"20"); // 
//	System.out.println('10'+'20'); // 
	System.out.println(10-1);
	System.out.println(10*2);
	System.out.println(10+2);*/
	//Print "A says Hi to B" (Without quotations),
	//where A and B are the names "Ram" and "Shyam".
	
	String A="Ram";
	String B="Shyam";
	
	System.out.println(A+" says Hi to "+B);
	
}
}
