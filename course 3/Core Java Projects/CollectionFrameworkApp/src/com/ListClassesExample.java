package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

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
//		LinkedList ll1 =new LinkedList();
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
//		System.out.println("first element "+ll1.getFirst());
//		System.out.println("last element "+ll1.getLast());
//		ll1.removeFirst();
//		ll1.removeLast();
//		System.out.println(ll1);
		// Vector 
//		Vector ll = new Vector();
//		ll.add(10);						// part of list method 	
//		ll.addElement(20);				// part of vector method 
//		System.out.println(ll);
		
		// Stack Operation
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		System.out.println(ss);
		System.out.println("Pop "+ss.pop());		// remove top element 
		System.out.println(ss);
		System.out.println("Peek "+ss.peek());		// it display top element 
		System.out.println(ss);
		System.out.println("Search "+ss.search(100));
		System.out.println("Search "+ss.search(1000));
		
	}

}
