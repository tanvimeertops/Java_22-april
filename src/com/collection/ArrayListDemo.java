package com.collection;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collection :collection of data of different type
 * class:
 * ArrayList
 * HashSet
 * HashMap
 * Vector
 * Generic
 * 
 * Interface:
 * List
 * Set
 * Map
 * Iterator: to display the value into list instead of square bracket
 * 1.to give value to iterator using iterator()
 * 2.to traverse through the loop
 * 3.to take value from list
 * Enumeration
 * 
 * ArrayList: collection of data of different type
 * 1.It is a dynamic array
 * 2.default value is []
 * 3.default size is 0
 * 4.the sequence in which value is stored the same sequence it is
 * displayed
 * 5.duplicate value is allowed
 * 6.add() and remove()
 * 7.automatically implements List interface
 * 
 * 
 */
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	System.out.println("default value is :"+a1);
	System.out.println("default size is :"+a1.size());
	a1.add(12);    //0
	a1.add(34.5677f);//1
	a1.add('T');//2
	a1.add("Tops");//3
	a1.add(new Integer(678));
	System.out.println("Now value is :"+a1);
	System.out.println("Now size is :"+a1.size());
	a1.add("Tops");
	
	System.out.println("Now value is :"+a1);
	System.out.println("Now size is :"+a1.size());
	
	a1.remove(3);
	System.out.println("Now value is :"+a1);
	System.out.println("Now size is :"+a1.size());
	a1.remove(new Integer(12));
	System.out.println("Now value is :"+a1);
	System.out.println("Now size is :"+a1.size());
	
	Iterator i1=a1.iterator();
	
	while (i1.hasNext()) {
		System.out.println(i1.next());
		
	}
}
}
