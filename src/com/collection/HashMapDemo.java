package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Hashmap : collection of data of different type
//* 1.It is a dynamic array
//* 2.default value is {}
//* 3.default size is 0
//* 4.All the values are stored in <K,V> pair k=key v=value
//* 5.All pair have hashkey
//* 6.All hashkey have there own hascode
//* 7.all pair are stored hash code wise
//* 8.duplicate key are not allowed
//* 9.put() and remove()
//* 10.automatically implements Map interface
public class HashMapDemo {
public static void main(String[] args) {
	HashMap h1=new HashMap();
	System.out.println("Default value is "+h1);
	System.out.println("Default size is "+h1.size());
	h1.put(1, "jyoti");
	h1.put("kiran", 5.2);
	h1.put("nikita", "dhangar");
	h1.put("varsha", true);
	
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	
	h1.remove("nikita");
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	
	h1.put(1,"kalp");
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	h1.put(2, "kalp");
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	
	Set s1=h1.entrySet();
	Iterator i1=s1.iterator();
	
	while (i1.hasNext()) {
//		System.out.println(i1.next());
		Map.Entry me=(Entry) i1.next();
		
		System.out.println("key is :"+me.getKey());
		System.out.println("value is :"+me.getValue());
	}
	//10:58
	//Remove Consecutive Duplicates
	//aabbccdaa
	//abcda
}
}
