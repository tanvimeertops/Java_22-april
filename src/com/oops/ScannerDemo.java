package com.oops;

import java.util.Scanner;

/*
 * Scanner it is a class
 * main purpose is to take input from the user
 * System.in as an argument
 * 
 * int    nextInt()
 * long   nextLong()
 * char   next().charAt(0)
 * 
 * String 
 * next()      reads the line unto space
 * nextLine()  reads the line upto enter
 * 
 */
public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	
	int a;
	System.out.println("enter a value");
	a=sc.nextInt();
	
	System.out.println("a is :"+a);
	
	char ch;
	System.out.println("enter character:");
	ch=sc.next().charAt(0);
	System.out.println("character is :"+ch);
	
//	sc.nextLine();//buffer clean
	String name;
	System.out.println("enter your name:");
	name=sc1.nextLine();
	System.out.println("name is :"+name);
	
	
}
}
