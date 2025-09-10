package com.keyword;
/*
 * keyword : special word whose meaning is already defined
 * 1.super
 * 2.abstract :details hidden only essential info is shown
 * 		.use with method and class
 * 		1.no object can be created for abstract class
 * 		2.must inherit into some other class 
 * 	abstract method:
 * 		1.abstract method do not have method body
 * 		2. must implement into child class
 * 3.This 
 * 4.final
 * 5.static
 * 6.interface
 */
abstract class ADemo{
	
	public abstract void dummy();
}
class Demo extends ADemo{

	@Override
	public void dummy() {
		System.out.println("this is dummy function");
		
	}
	
}
public class AbstractionDemo {
public static void main(String[] args) {
//	ADemo ad=new ADemo();
	Demo d1=new Demo();
	d1.dummy();
}
}
