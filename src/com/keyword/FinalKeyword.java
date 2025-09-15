package com.keyword;

import javax.management.relation.Role;

/*
 * Final: constant at value side
 * final use with variable :
 * 1.must initialize at declaration time
 * 2.cannot change the value at run time as well as at compile time
 * class :oop to abstract
 * method:opp to abstract 
 */
final class FDemo{
	final int id = 12;
	String name;
	
	public void setData() {
		name="varsha";
	}
	public final void show() {
		System.out.println("roll no is:"+id);
		System.out.println("name is :"+name);
	}
}

//class Demo extends FDemo{
//	
//}
public class FinalKeyword {
public static void main(String[] args) {
	FDemo fd=new FDemo();
	fd.setData();
	fd.show();
}
}
