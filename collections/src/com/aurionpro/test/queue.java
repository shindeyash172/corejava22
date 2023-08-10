package com.aurionpro.test;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>();
	q.add(1);
	q.offer(2);
	q.add(3);
	q.offer(4);
System.out.println(q);
//q.clear();
System.out.println(q.poll());//null if empty removes first
System.out.println(q);
System.out.println(q.element());// head 
System.out.println(q);

}
}
