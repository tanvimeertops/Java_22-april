package com.cmn_class;
/*
 * convert from primitive to non primitive type and vice a versa
 * int 
 * float			String
 * long
 * double
 * byte
 * 
 * autoboxing: value given to object
 * boxing :value first given to variable to object
 * unboxing: object to variable
 * 
 * Object class :It is a root class for all java class 
 */

class Demo{
	public void show() {
		System.out.println("tHIS is demo class");
	}
}
public class WrapperClassDemo {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer("This is Tops Technologies");
	System.out.println("auto boxing: "+str);
	
	int i1=234;
	Integer i2=i1;
	System.out.println("Boxing is :"+i2);
	
	String str1="786c";
	String str2="100";
	
	System.out.println(str1+str2); //786100
	float i3=Float.parseFloat(str1);
	int i4=Integer.parseInt(str2);
	
	System.out.println(i3+i4);
	
	Demo d1=new Demo();
	
}
}
