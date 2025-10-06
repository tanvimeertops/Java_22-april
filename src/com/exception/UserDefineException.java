package com.exception;

import java.time.temporal.TemporalAmount;
import java.util.Scanner;

/*User defined exception :
 * balance:1000
 * deposit :2000
 * balance: 3000
 * withdraw: 5000
 *	If you deposit 2000rs more you can withdraw 5000rs
 * THROW :
 * 1.written inside the method
 * 2.throw followed by new keyword and constructor
 * 3.must inherit exception class to make user defined exception
 * throws: 
 * written after method declaration
 * can be a user defined or system defined exceptoin
 */
class TanviException extends Exception{
	double amount;
	public TanviException(double amount) {
		
		this.amount=amount;
	}
}
class ATM{
		double balance=1000;
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("you have deposited "+amount+
				" your current balance is "+balance);
	}
	
	public void withdraw(double amount) throws TanviException {
		if(amount<balance) {
			balance-=amount;
			System.out.println("you have withdrawn "+amount+
					" your current balance is "+balance);
		}else {
			double needs=amount-balance;
				//      	5000-4000
			throw new TanviException(needs);
		}
		
	}
}
public class UserDefineException {
public static void main(String[] args) {
	ATM atm=new ATM();
	Scanner sc=new Scanner(System.in);
	double amount;
	System.out.println("enter the amount to be deposited: ");
	amount=sc.nextDouble(); //3000
	atm.deposit(amount);
	System.out.println("enter the amount to be withdrawn: ");
	amount=sc.nextDouble();//5000
	try {
		atm.withdraw(amount);
	} catch (TanviException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		System.out.println("If you deposit "+e.amount+" rs"+ 
		"more you can withdraw "+amount);
	}
	
	
}
}
