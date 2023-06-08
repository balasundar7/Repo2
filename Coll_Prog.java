package com.java;

import java.util.ArrayList;
import java.util.List;

public class Coll_Prog {

	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
		
		l.add(100);
		l.add(200);
		
		l.add("Name");
		l.add("Age");
		l.add(500);
		System.out.println(l);
		
		int size = l.size();
		System.out.println("Size of l:"+size);
		
		Object object = l.get(2);
		System.out.println(object);
		
		l.set(2,"Marks");
		System.out.println(l);
		
		Object remove = l.remove(1);
		System.out.println(remove);
		System.out.println(l);
		
		int indexOf = l.indexOf("Marks");
		System.out.println("Index of:"+indexOf);
		
		List<Integer>l1= new ArrayList<Integer>();
		l1.add(100);
		l1.add(200);
		System.out.println(l1);
		
		l.addAll(l1);
		System.out.println(l);
		
		
	
		
		
		
		
	}
}
