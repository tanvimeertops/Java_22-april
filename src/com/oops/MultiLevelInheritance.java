package com.oops;
class Student2{
	int id;
	String name;
	
	public void setData() {
		id=4545;
		name="pooja";
	}
}

class Child1 extends Student2{
	int sports_mark=45;
}
class Child2 extends Child1{
	String grade="A+";
	public void show() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
		System.out.println("sport marks:"+sports_mark);
		System.out.println("grade is :"+grade);
	}
}
public class MultiLevelInheritance {
public static void main(String[] args) {
	Child2 c2=new Child2();
	c2.setData();
	c2.show();
}
}
