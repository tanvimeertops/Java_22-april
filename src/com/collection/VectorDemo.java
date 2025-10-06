package com.collection;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector: collection of data of different type
 * 1.It is a dynamic array
 * 2.default value is []
 * 3.default size is 0
 * 4.default capacity is 10
 * 5.the sequence in which value is stored the same sequence it is
 * displayed
 * 6.duplicate value is allowed
 * 7.add() and remove()
 * 8.automatically implements List interface
 * 
 * Enumeration:to display the value into list instead of square bracket
 * 1.to give value to iterator using elements()
 * 2.to traverse through the loop
 * 3.to take value from list
 * only use with vector
 */
public class VectorDemo {
public static void main(String[] args) {
	Vector v1=new Vector(3,1);
	
	System.out.println("default value is :"+v1);
	System.out.println("default size is :"+v1.size());
	System.out.println("default capacity is :"+v1.capacity());
	
	v1.add(12);    //0
	v1.add(34.5677f);//1
	v1.add('T');//2
	v1.add("Tops");//3
	v1.add(new Integer(678));
	v1.add(12);    //0
	v1.add(34.5677f);//1
//	v1.add('T');//2
//	v1.add("Tops");//3
//	v1.add(new Integer(678));
//	v1.add('T');//2
	System.out.println("now value is :"+v1);
	System.out.println("now size is :"+v1.size());
	System.out.println("now capacity is :"+v1.capacity());
	
	v1.remove(4);
	Enumeration e1=v1.elements();
	while (e1.hasMoreElements()) {
		System.out.println(e1.nextElement());
	}
	
}
}
