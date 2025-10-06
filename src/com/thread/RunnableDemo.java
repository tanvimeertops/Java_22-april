package com.thread;
class Second implements Runnable{

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println("This is second thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
	

public class RunnableDemo {
public static void main(String[] args) {
	
	Second sc=new Second();
	Thread t1=new Thread(sc);
	t1.start();
	for (int i = 0; i < 5; i++) {

		System.out.println("This is main thread");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("is alive or not: "+t1.isAlive());
	}
}
}
