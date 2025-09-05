package com.oops;
/*
 * Inheritance :deriving attribute of some other class
 * types
 * single : one parent one child
 * multi level :one grandparent one parent one child
 * hierarchical :one parent multiple child
 * multiple :multiple parent one child
 * Hybrid :comb of two
 * 
 * object will made with last child only
 * uses extends keyword to inherit a class
 * 
 * advantage
 * less code redundancy
 * less object creation
 */
class Student{
	int id;
	String name;
	
	public void setData() {
		id=123;
		name="pooja";
	}
}

class Child extends Student{  
	public void show() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
}
public class InheritanceDemo {
public static void main(String[] args) {
	Child ch=new Child();
	ch.setData();
	ch.show();
}
}
