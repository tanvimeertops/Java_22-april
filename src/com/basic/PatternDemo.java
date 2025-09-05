package com.basic;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * for i:
 *  initialization: 
 *  first number in pattern
 *  condition: last number of pattern
 *  <= min to max
 *  >= max to min
 *  incree/decree
 *  <=  ++
 *  >=  --
 * for j: 
 *  initialization :first col
 *  same no: that no only
 *  diff no: upper loop name (i)
 *  condition : last number of loop
 *  same no: that no only
 *  diff no: upper loop name (i)
 *  <= min to max
 *  >= max to min
 *  incree/decree
 *  <=  ++
 *  >=  --
 *  
 * 1
 * 10
 * 101
 * 1010
 * 10101
 * +++++1
 * ++++1 2
 * +++1 2 3
 * ++1 2 3 4
 * +1 2 3 4 5 
 *    *		1	1*2 2-1
 *   ***    3   2*2 4-1 
 *  *****   5   3*2 6-1
 *   ***
 *    *
 * for k:
 * completely depends on i
 */
public class PatternDemo {
public static void main(String[] args) {
	for (int i = 1; i <=3; i++) {
		for (int k = i; k <=3; k++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i*2-1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for (int i = 2; i >=1; i--) {
		for (int k = i; k <=3; k++) {
			System.out.print(" ");
		}
		for (int j = i*2-1; j >=1; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
