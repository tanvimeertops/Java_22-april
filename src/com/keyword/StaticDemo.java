package com.keyword;
/*
 * static :constant at server side
 * use with variable : 
 *     
 * use with method : 
 * all the variable inside static method is static by default
 * no need to call static method using object but call using class name
 * 
 */
class SDemo{
	int i_no;
	static int s_no;
	
	public static void display() {
		s_no=34;
		
		System.out.println("s no is :"+s_no);
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		SDemo s1=new SDemo();
		SDemo s2=new SDemo();
		SDemo s3=new SDemo();
			s1.i_no=10; //4 byte
			s2.i_no=20; //4 byte  12 byte
			s3.i_no=300;//4 byte
			s1.s_no=1;
			s2.s_no=2; //4 byte
			s3.s_no=5;
			
			
			SDemo.display();
			
		
//		System.out.println("i no is:"+s1.i_no); //
//		System.out.println("i no is:"+s2.i_no);
//		System.out.println("i no is:"+s3.i_no);
//		
//		System.out.println("s no is :"+s1.s_no);
//		System.out.println("s no is :"+s2.s_no);
//		System.out.println("s no is :"+s3.s_no);
	}


	

}
