package com.basic;
/*
 * largest of 3 nos
 */
public class NestedIf {
public static void main(String[] args) {
			int a=150;
			int b=147;
			int c=470;
			
			if(a>b) {
				if(a>c) {System.out.println("A is greater");
					
				}else {
					System.out.println("C is greater");
				}
			}else {
				if(b>c) {
					System.out.println("B is greater");
				}else {
					System.out.println("c is greater");
				}
			}
}
}
