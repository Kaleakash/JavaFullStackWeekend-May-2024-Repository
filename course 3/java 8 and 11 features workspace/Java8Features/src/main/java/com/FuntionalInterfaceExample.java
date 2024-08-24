package com;

import java.util.function.Function;

class MyFuntional implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		return "Your pass me number as "+t;
	}
}
public class FuntionalInterfaceExample {
	public static void main(String[] args) {
	// 1st way 
	Function<Integer, String> fun1 = new MyFuntional();
	System.out.println(fun1.apply(100));
	// 2nd way using Lambda 
	Function<Integer, String> fun2 =(num)->"You pass me number as "+num;
	System.out.println(fun2.apply(200));
	}
}
