package com.aurionpro.test;

public class threadTest5 {
public static void main(String[] args) {
	Runnable task = ()->{
		synchronized(args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
		};
	
	for (int i = 0; i < 10; i++) {
		String name = "Thread "+i;
		Thread temp = new Thread(task,name);
		temp.start();
		
	}
}
}
