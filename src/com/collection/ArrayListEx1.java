package com.collection;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args)
	{
		ArrayList al1 = new ArrayList<>();
		al1.add(10);
		al1.add('a');
		al1.add("aaa");
		al1.add(10.01);
		al1.add(true);
		al1.add(10);
		al1.add(10);
		al1.add(null);
		
		System.out.println(al1);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		//al2.add('a');
		//al2.add("aaa");
		//al2.add(10.01);
		//al1.add(true);
		al2.add(0);
		al2.add(10);
		//al1.add(null);
		
		System.out.println(al2);
		
		
		
	}
		
}
