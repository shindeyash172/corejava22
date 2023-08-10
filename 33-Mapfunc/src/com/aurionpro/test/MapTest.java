package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.Set;

public class MapTest {
public static void main(String[] args) {
	Map<Integer, String> nameMap = new HashMap<>();
	
	nameMap.put(1,"yash");
	nameMap.put(2,"Aniket");
//	Set<Entry<Integer,String>> entrySet = nameMap.entrySet();	

//for(Entry x : entrySet){
//	System.out.println(x.getKey()+""+x.getValue() );
//}

nameMap.forEach((key,value)->{
	System.out.println(key+""+value);
});

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a name to check and remove: ");
String nameToRemove = scanner.nextLine();
//for (Map.Entry<Integer, String> entry : nameMap.entrySet()) {
//	if (nameMap.containsValue(nameToRemove)) {
//   1     for (Map.Entry<Integer, String> entry : nameMap.entrySet()) {
//    1        if (entry.getValue().equals(nameToRemove)) {
//     1           nameMap.remove(entry.getKey());
//      1       break;
//            }
//       1 }
//        1System.out.println("" + nameToRemove + "': " + nameMap);
//   1 } else {
//    1    System.out.println("'" + nameToRemove + "' not found in the map.");
//    1}
//System.out.println(nameMap.containsValue("raj"));
////System.out.println(nameMap.remove(1));
//System.out.println(nameMap.containsValue("yash"));
//System.out.println(nameMap.get(1));

}

}