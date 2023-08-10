package com.aurionpro.test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityqueue {
public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();
 pq.add(4);
 pq.add(7);
 pq.add(3);
 pq.add(6);
 pq.add(11);
 pq.add(15);
 pq.add(14);
 pq.add(13);
 pq.add(42);
 
System.out.println(pq);
System.out.println("head : "+pq.peek());
Iterator<Integer> iterator = pq.iterator();
while(iterator.hasNext()) {
	System.out.println(pq.poll()+" ");
}

}
}
