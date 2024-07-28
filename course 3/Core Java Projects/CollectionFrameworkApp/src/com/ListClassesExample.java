package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClassesExample {

	public static void main(String[] args) {
		// ArrayList 
		
//		List ll1 = new ArrayList();
//		ll1.add(10);
//		ll1.add(30);
//		ll1.add(50);
//		ll1.add(20);
//		ll1.add(80);
//		System.out.println(ll1);
//		System.out.println("find value using index "+ll1.get(1));
//		ll1.add(1, 100);
//		System.out.println(ll1);
//		System.out.println("find value using index "+ll1.get(1));
//		ll1.remove(2); 	// remove using index 
//		Integer i = 50;
//		ll1.remove(i);		// remove using index 
//		System.out.println(ll1);
//		System.out.println("search "+ll1.contains(10));
//		System.out.println("search "+ll1.contains(100));
		
		// LinkedList 
		LinkedList ll1 =new LinkedList();
		ll1.add(10);
		ll1.add(30);
		ll1.add(50);
		ll1.add(20);
		ll1.add(80);
		System.out.println(ll1);
		System.out.println("find value using index "+ll1.get(1));
		ll1.add(1, 100);
		System.out.println(ll1);
		System.out.println("find value using index "+ll1.get(1));
		ll1.remove(2); 	// remove using index 
		Integer i = 50;
		ll1.remove(i);		// remove using index 
		System.out.println(ll1);
		System.out.println("search "+ll1.contains(10));
		System.out.println("search "+ll1.contains(100));
		System.out.println("first element "+ll1.getFirst());
		System.out.println("last element "+ll1.getLast());
		ll1.removeFirst();
		ll1.removeLast();
		System.out.println(ll1);
	}

}
