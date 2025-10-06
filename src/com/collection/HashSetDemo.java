package com.collection;

import java.util.HashSet;

//Hashset : collection of data of different type
//* 1.It is a dynamic array
//* 2.default value is []
//* 3.default size is 0
//* 4.All value have hashkey
//* 5.All hashkey have there own hascode
//* 6.all values are stored hash code wise
//* 7.duplicate value are not allowed
//* 8.add() and remove()
//* 9.automatically implements set interface
public class HashSetDemo {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	System.out.println("default value is :"+h1);
	System.out.println("default size is :"+h1.size());
	h1.add(12);    //0
	h1.add(34.5677f);//1
	h1.add('T');//2
	h1.add("Tops");//3
	h1.add(new Integer(678));
	System.out.println("now value is :"+h1);
	System.out.println("now size is :"+h1.size());
	h1.add("Tops");
	System.out.println("now value is :"+h1);
	System.out.println("now size is :"+h1.size());
	h1.remove("Tops");
	System.out.println("now value is :"+h1);
	System.out.println("now size is :"+h1.size());
}
}
