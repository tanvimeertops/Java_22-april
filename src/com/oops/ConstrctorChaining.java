package com.oops;
/*
 * Overriding function with same name,same parameter and return but 
 * diff body
 * super : calls the function of immediate parent 
 */
class A1{
	public A1() {
		System.out.println("this is constructor A");
	}
	public void show() {
		System.out.println("this is Show A");
	}
}
class B extends A1{ 
	public B() {
		System.out.println("this is constructor B");
	}
	public void show() {
		super.show();
		System.out.println("this is Show B");
	}
}

class C extends B{
	public C() {
		System.out.println("this is constructor C");
	}
	public void show() {
		super.show();
		System.out.println("this is Show C");
		
	}
}
public class ConstrctorChaining {
public static void main(String[] args) {
	C c =new C();
	c.show();
}
}
