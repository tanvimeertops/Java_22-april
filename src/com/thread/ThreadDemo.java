package com.thread;

import javax.swing.plaf.synth.SynthScrollPaneUI;

/*
 * Thread :it is a process 
 * single :single task at one time
 * multi thread: multiple task can run at same time
 * 
 * thread life cycle
 * 1.newborn
 * 2.runnable
 * 3.running
 * 4.block
 * 5.stop
 * main is a thread
 */
class First extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			System.out.println("This is first thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
public class ThreadDemo {
public static void main(String[] args) {
	First fs=new First();
	fs.start();
	for (int i = 0; i <5; i++) {
		
		System.out.println("This is main thread");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("is alive or not: "+fs.isAlive());
	}
	
	
}
}
