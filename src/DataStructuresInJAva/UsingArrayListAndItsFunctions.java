package DataStructuresInJAva;

import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayListAndItsFunctions {	
	
	public static void main(String []args){
//Create an ArrayList
		
	ArrayList<String> arr=new ArrayList<String>(10);
	
//Adding Elements to ArrayList
	
	arr.add("string1");
	arr.add("string2");
	arr.add("string3");
	
//Printing the elements in ArrayList
	
	System.out.println("Elements of arraylist are "+arr);
	System.out.println("Third element is "+arr.get(2));
	
//Removing elements from ArrayList	
	
	arr.remove(2);
	System.out.println("Elements of arraylist are "+arr);
	arr.add("string");
	arr.remove("string1");
	System.out.println("Elements of arraylist are "+arr);
	System.out.println("Size of arraylist is "+arr.size());
	
//Sorting the ArrayList elements
	
	Collections.sort(arr);
	
//Printing the sorted ArrayList 
	
	System.out.println("Elements of arraylist are "+arr);
	
//Create a comparator
	
	}

}	
