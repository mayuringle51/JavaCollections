package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exe01_printArrayList {

	public static void main(String[] args) {

// Write a Java program to create an array list, add some colors (strings) and
// print out the collection.

		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		
		System.out.println(list);
		
		//Iterate ArrayList
		
		for(String str : list) {
			System.out.println(str);
		}
		
		//Insert "Orange" at First Position
		list.add(0, "Orange");
		System.out.println(list);
		
		//Retrieve Element by Index
		System.out.println(list.get(2));
		
		//Update ArrayList Element Red-->Yellow
		list.set(1, "Yellow");
		System.out.println(list);
		
		//Remove Third Element
		list.remove(2);
		System.out.println(list);
		
		//Search Element in ArrayList
		System.out.println(list.contains("Blue"));
		
		// sort a given array list
		Collections.sort(list);
		System.out.println("List after sort: "+list);
		
		List<String> listNew = new ArrayList<String>();
		//copy one array list into another
		Collections.copy(list, listNew);
		
		System.out.println("ArrayList "+list);
		System.out.println("New ArrayList "+listNew);
		
		//shuffle elements in an array list.
		Collections.shuffle(list);
		System.out.println("Shuffle List "+list);
		
		//Reverse ArrayList
		Collections.reverse(list);
		System.out.println("Reverse List "+list);
		
		//extract a portion of an array list.
		List<String> list2= list.subList(0, 3);
		
		System.out.println("Extracted List "+list2);




		
		
	}	

}
