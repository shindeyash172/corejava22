package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritenceTest {
	public static void main(String[] args) {
//		Boy boy = new Boy();
//		boy.eat();
//		boy.read();
//		
//		Kid kid = new Kid();
//		kid.read();
//		kid.play();
//		4
//		Infant infant = new Infant();
//		infant.sleep();
//		infant.play();
//		infant.read();
		Case1();
		System.out.println("------------");
		Case2();
		System.out.println("-----------");
		Case3();
		System.out.println("-----------");
		case4();
		System.out.println("-----------");
		case5();
		System.out.println("-----------");
		Case6();
	}

		public  static void Case1() {
			Man man;
			man = new Man();
			man.read();
			man.play();
			
		}
		public static void Case2() {
			Boy boy;
			boy = new Boy();
			boy.read();
			boy.play();
			boy.eat();
		} 
		public static void Case3(){
			Man man;
			man = new Infant();
			man.read();
			man.play();
			
			
		}
		
		private static void case4() {
			playAtPark(new Man());
			playAtPark(new Boy()); 
			playAtPark (new Infant ()); 
			playAtPark(new Kid());
}

		private static void playAtPark(Man man) {
			man.play();
		}	
		
		private static void case5() { //expects object of any child
			Object obj;
			obj=10;//Boxing System.out.println(obj.getClass());

			obj="Hello";

			System.out.println(obj.getClass().getSimpleName());

			obj=10<15;

			System.out.println(obj.getClass());

			
			}
		private static void Case6() {//Downcasting
			TypeCast(new Infant());
			}
			private static void TypeCast(Object obj) {
				if(obj instanceof Infant) {
					Infant infant = (Infant)obj;
					infant.sleep();}
			}
		}


