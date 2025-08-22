package com.basic;
/*
 * Logical Operators: Used to combine or modify boolean expressions.
&& (conditional AND)
|| (conditional OR)
! (logical NOT - also a unary operator)
 */
public class ElsIfLadder {
public static void main(String[] args) {
	int a=150;
	int b=1470;
	int c=470;
	
	if(a>b && a>c) {
		System.out.println("A is greater");
	}else if(b>a && b>c) {
		System.out.println("B is greater");
	}else {
		System.out.println("c is greater");
	}
	
	// vowel and consonant
	char ch='u';
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E') {
		System.out.println("Vowel");
	}else {
		System.out.println("Consonant");
	}
}
}
