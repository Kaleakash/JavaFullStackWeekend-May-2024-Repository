package com;

public class TryAndCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		String str = "10";
		try {
		int res = a/b;
		System.out.println("REsult is "+res);
		int res1 = abc[2];
		System.out.println("result1 is "+res1);
		System.out.println(str+10);   // 1010
		System.out.println(Integer.parseInt(str)+10);// 20 
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println("message "+e.getMessage());
			System.out.println("name and message "+e.toString());
		}
	System.out.println("bye...");
	System.out.println("bye...");
	System.out.println("bye...");
	}

}
