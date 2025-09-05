package com.oops;
/*
 * oops:
 * 1.class : class is a collection of data member and member function
 * 2.object :gives the permission to access functionality of class
 * 3.encapsulation 
 * 4.inheritance
 * 5.polymorphism
 * 6.abstraction
 */
class Students{
	int id;
	String name;
	
	public void setData() {
		id=12;
		name="Tops";
	}
	public void show() {
		System.out.println("id ="+id);
		System.out.println("name ="+name);
	}
}
public class ClassDemo {
public static void main(String[] args) {
	//[class_name] [obj name]=new [class_name()]
	Students st=new Students();
	st.setData();
	st.show();
}
}
