package com.keyword;
/*
 * Interface: 
 * 1.Interface is same as a class but we cannot create object of interface
 * 2.interface contains only data and functions
 * 3.all the data are final by default
 * 4.all the functions are abstract by default
 * 5.main purpose is to use multiple inheritance
 * 6.use "implements" to inherit interface
 * 7.pure data hiding
 * 
 * class--->class extends
 * interface ---> interface--->extends
 * class-->interface--->implements
 */
class Result{
	String grade="A+";
}
class IDemo extends Result implements InterDemo{

	@Override
	public void show() {
		System.out.println("roll_no is "+roll_no);
		System.out.println("grade is :"+grade);
		System.out.println("number is :"+i2);
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	IDemo id=new IDemo();
	id.show();
}
}
