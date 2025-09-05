package com.oops;
class Parent{
	String p_name;
	long ph_no;
	
	public void setPData() {
		p_name="salim khan";
		ph_no=8798989999l;
	}
}

class ChildOne extends Parent{
	String name="salman";
	public void show() {
		System.out.println("For any complain of "+name+" "+p_name+
			"call "+ph_no	);
	}
}

class ChildTwo extends Parent{
	String name="suhail";
	public void show() {
		System.out.println("For any complain of "+name+" "+p_name+
			"call "+ph_no	);
	}
}
public class HierarchicalInheritance {
public static void main(String[] args) {
	ChildOne co=new ChildOne();
	ChildTwo ct=new ChildTwo();
	
	co.setPData();
	co.show();
	ct.setPData();
	ct.show();
}
}
