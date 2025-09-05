package com.oops;
/*
 * Function: does something
 * function without parameter without return type
 * function with parameter without return type
 * function without parameter with return type
 * function with parameter with return type
 * 
 * Polymorphism
 * function overloading :function with same name but different parameter
 * function overriding
  */
class A{
	int a,b;
	//function without parameter without return type
	public void sum() {
		a=10;
		b=78;
		System.out.println("sum is :"+(a+b));
	}
	//function with parameter without return type
	public void sum(int a,int b) {
		
		System.out.println("sum is :"+(a+b));
	}
	//function without parameter with return type
	public double div() {
		a=16;
		b=3;
		
		return (float)a/b;
		
	}
	//function with parameter with return type
	public double div(int a,int b) {
		
		
		return (float)a/b;
		
	}
}
public class FunctionDemo {
public static void main(String[] args) {
	A a=new A();
	a.sum();
	a.sum(4,8); //argument
	System.out.println("div is :"+a.div()); 
	System.out.println("div is :"+a.div(45,6)); 
	
}
}
