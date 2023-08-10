package com.aurionpro.test;
import java.util.HashSet;
import java.util.Iterator;

public class set {
public static void main(String[] args) {
HashSet<Integer> set = new HashSet<>();

set.add(1);
set.add(3);
set.add(5);
set.add(1);

//if(set.contains(4)) {
//	System.out.println("contains ");
//}
//else {
//	System.out.println("does not contains");
//}
//
//
//set.remove(1);
//if(!set.contains(1)) {
//	System.out.println("deleted");
System.out.println("size of set is :"+set.size());


System.out.println(set);


//*Iterator*
Iterator it = set.iterator();

//has next function
while(it.hasNext()) {
	System.out.println(it.next());
}



}
//

}

