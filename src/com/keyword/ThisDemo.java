package com.keyword;
/*
 * This : current class context
 * 
 */

class TDemo{
	int id;
	String name;
	
	public void setData(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void show() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
}
public class ThisDemo {
public static void main(String[] args) {
	TDemo tDemo =new TDemo();
	tDemo.setData(1, "nikita");
	tDemo.show();
}
}
