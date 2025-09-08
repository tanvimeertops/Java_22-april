package com.oops;
/*
 * Constructor is a special member function which is initialize by its own
 * 1.same name as class
 * 2.no return type
 * 3.it is invoked automatically when object is created
 * types of constructor
 * 1.Default : no parameter
 * 2.parameterized :with parameter
 * 3.copy :clone of object
 * constructor overloading
 */

class Box{
	double length,width,height;
	
	public Box() {
		System.out.println("this is default constructor");
		length=1;
		width=2;
		height=3;
	}
	
	public Box(double l,double w,double h) {
		System.out.println("this is parameterised constructor");
		length=l;
		width=w;
		height=h;
	}
	
	public Box(Box b) {
		System.out.println("this is copy constructor");
		length=b.length;
		width=b.width;
		height=b.height;
	}
	public void display() {
		System.out.println("vol of box is "+length*width*height);
	}
	
	
}
public class ConstructorDemo {
public static void main(String[] args) {
	Box dc=new Box();
	dc.display();
	Box pc=new Box(10, 20, 30);
	pc.display();
	Box cc=new Box(dc);
	cc.display();
}
}
