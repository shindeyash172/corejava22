package com.aurionpro.test;

public class threadTest3  {
	public static void main(String[] args) {

		Thread t1 = new Thread(new InnerClass(),"staticThread");
		t1.start();
	
	
	Runnable runObj = new Runnable() {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+"Anonymous class");
			
		}
	};

	Thread t2 = new Thread(runObj,"staticThread");
	t2.start();
	}
		private static class InnerClass implements Runnable{
			
			public void run() {
				System.out.println(Thread.currentThread().getName()+"static inner class");

			}
			
		}
}
		
//		Runnable printnum= () -> { for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }System.out.println(i);
//            }
//        };
//
//        Thread thread = new Thread(printnum);
//        thread.start();
//    

	
