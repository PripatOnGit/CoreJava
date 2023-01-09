package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<>();
	
	a1.add("aaa");
	a1.add("trueNumber");
	a1.add("null");
	
	//Cursor using Iterator 
	
	  System.out.println("Using Iterator");
	  Iterator<String> it = a1.iterator();
	  while(it.hasNext()) { System.out.println(it.next()); }
	 
	
	//Cursor using ListIterator - only works with List
	System.out.println("Using List Iterator");
	
	ListIterator<String> li = a1.listIterator();
	while(li.hasNext()) { 
		System.out.println(li.next()); 
		}
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
	}
	
}
