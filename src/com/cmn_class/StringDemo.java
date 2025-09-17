package com.cmn_class;
/*
 * common class :
 * string : 
 * it is immutable
 * string buffer
 * wrapper
 * object
 * 
 */
public class StringDemo {
public static void main(String[] args) {
	String str="This is Tops Technologies";
	
	System.out.println("original string is :"+str);
	System.out.println("original length is :"+str.length());
	
	System.out.println("to lower :"+str.toLowerCase());
	System.out.println("to upper :"+str.toUpperCase());
	System.out.println("sub string: "+str.substring(0, 6));//This i
	System.out.println("substring is :"+str.substring(2));
	System.out.println("char at :"+str.charAt(8));
	
	if(str.equalsIgnoreCase("this is Tops Technologies")) {
		System.out.println("both strings are equal");
	}else {
		System.out.println("both strings are diff");
	}
	System.out.println("now string is :"+str);
	System.out.println("now length is :"+str.length());
	
}
}
