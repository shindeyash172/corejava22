package com.aurionpro.test;

import com.aurionpro.model.Table;

public class threadTest4 {
public static void main(String[] args) throws InterruptedException {
	

	Table tableObj = new Table(5);
	
	Thread t1 = new Thread(tableObj);
	t1.start();
	Table tableObj1 = new Table(10);
//	tableObj.setNumber(10);
	Thread t2 = new Thread(tableObj1);
	t2.sleep(100000);
	t2.start();
}
}