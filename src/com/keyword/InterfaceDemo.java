package com.keyword;
/*
 * Interface:
 * 1. Interface is same like a class
 * 2. we cannot make object of interface
 * 3. all the data are final by default 
 * 4. all the functions are abstract by default
 * 5. main purpose is to use multiple inheritance
 * 6. functions are defined in child class
 * 7. use "implements" to inherit the inherit 
 * 8.pure data hiding
 */


class Result{
	String grade="A+";

}
class IDemo extends Result  implements InterDemo {

	@Override
	public void show() {
		System.out.println("roll no is "+roll_no);
		System.out.println("result is :"+grade);
		System.out.println("i no :"+i_no);
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	IDemo id=new IDemo();
	id.show();
}
}
