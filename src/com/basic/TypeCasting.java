package com.basic;
/*
 * type casting/conversion
 * conversion from one type to another of any primitive type
 * int         long
 * long   		int
 * float			
 * double
 * char
 * boolean
 * byte
 * implicit conversion (Automatic) :smaller data type to bigger data type
 * 
 * explicit conversion :bigger data type to smaller data type
 * 
 * 
 */
public class TypeCasting {
public static void main(String[] args) {
	int i1=10; //4
	long l1=i1; //8
	
	System.out.println("implicit conversion: "+l1);
	
	
	int i2=(int)l1;
	System.out.println("explicit conversion :"+i2);
	
	
	int i3=512; //4
	byte b1=(byte)i3; //1 byte //-128 -127 -126 -125 -124 -123  to 127 
	
	
	System.out.println("explicit conversion :"+b1);
	
	char ch='^'; //2 
	int i4=ch;//4
	System.out.println("implicit conversion :"+i4);
	
	float f1=41.5f; //4
	int i5=(int)f1;//4
	float f2=i5;
	System.out.println("explicit conversion: "+i5);
	System.out.println("implicit conversion: "+f2);
}
}
