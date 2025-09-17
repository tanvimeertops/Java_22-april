package com.cmn_class;
/*
 * String Buffer : it is mutable
 */
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer("This is Tops Technologies");
	System.out.println("original string is :"+str);
	System.out.println("original length is :"+str.length());
	
	str.append("...Surat");
	System.out.println("original string is :"+str);
	System.out.println("original length is :"+str.length());
	
	str.insert(0, "Hii...");
	System.out.println("original string is :"+str);
	System.out.println("original length is :"+str.length());
	
	str.delete(0, 6);
	System.out.println("original string is :"+str);
	System.out.println("original length is :"+str.length());
	
	str.reverse();
	System.out.println("original string is :"+str.reverse());
	System.out.println("original length is :"+str.length());
}
}
