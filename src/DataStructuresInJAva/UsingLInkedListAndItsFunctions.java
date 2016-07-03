package DataStructuresInJAva;

import java.util.Collections;
import java.util.LinkedList;

public class UsingLInkedListAndItsFunctions {
	
	public static void main(String args[]){
		
//Create a LinkedList
		
		LinkedList<String>list=new LinkedList<String>();
//Adding Elements to LinkedList
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
//Printing the elements in LinkedList
		
		System.out.println("Elements in the linked list are "+list );
		list.set(3, "b");
		System.out.println("Elements in the linked list are "+list );
		
//Removing elements from LinkedList
		
		list.remove(1);
		System.out.println("Elements in the linked list are "+list );
		list.remove("e");
		System.out.println("Elements in the linked list are "+list );
		System.out.println("Third element is "+list.get(2) );
		
//Sorting the LInkedList elements
		
		Collections.sort(list);
		
//Printing the sorted LinkeList
		
		System.out.println("Elements in the linked list are "+list );
	
//Create a comparator
		
	}

}
