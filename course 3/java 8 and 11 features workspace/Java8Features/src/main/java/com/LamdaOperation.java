package com;
@FunctionalInterface
interface Operation {
	public int add(int x, int y);
}
@FunctionalInterface
interface Info {
	public void greeting(String name);
}
public class LamdaOperation {
	public static void main(String[] args) {
	Operation op1 = (x,y)->x+y;
	System.out.println("addition "+op1.add(100, 200));
	Operation op2 = (a,b)->a+b;
	System.out.println("addition "+op2.add(10, 20));
	Operation op3 = (var a, var b)->a+b;
	System.out.println("addition "+op3.add(1, 2));
	Operation op4 = (m,n)->{
		int add = m+n;
		return add;
	};
	System.out.println("addition "+op4.add(1000, 2000));
	Info obj1 = (name)->System.out.println("Welcome user "+name);
	obj1.greeting("Steven");
	Info obj2 = (var name)->{
		System.out.println("Welcome user with multi line statement "+name);
	};
	obj2.greeting("John");
	var a=10;		// declaring generic type of variable. 
	System.out.println(a);
	//a="Ravi";
	
	}
}
