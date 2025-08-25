package com.basic;

import javax.naming.InitialContext;

/*
 * Loop :iterative/repetitive
 * 1.entry control: 
 * 	for
 * 	while
 * 2.exit control:
 * 	do while
 */
public class LoopDemo {
public static void main(String[] args) {
	/*syn
	 * for (initialization;condition;incree/decree){
	 * statement
	 * }
	 */
				
	for(int i=10;i>=1;i--) {
		System.out.println("Hello World!!!");
	}
	 //times line executed 21
	/*syn
	 *initialization;
	 *while(condition){
	 *statement;
	 *incree/decree;
	 *}
	 */
	
	int i=1; //1
	while(i<=10) {
		System.out.println("Hello Tops");
		i++;
	}
	////times line executed 32
	/*syn
	 *initialization;
	 *do{
	 *statement;
	 *incree/decree;
	 *}while(condition)
	 *}
	 */
	

	int j=1;//1
	do {
		System.out.println("Hello folks!!!");
		j++;
	}while(j<=10);
////times line executed 41
}
}
