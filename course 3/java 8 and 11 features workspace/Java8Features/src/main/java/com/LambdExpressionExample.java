package com;

interface Hello{
	public String sayHello();
}
class HelloImp implements Hello {
	@Override
	public String sayHello() {
		return "Welcome using Hello Imp class";
	}
}
public class LambdExpressionExample {

	public static void main(String[] args) {
	// 1st option to provide the body for Hello interface 
	Hello obj1 = new HelloImp();
	System.out.println(obj1.sayHello());
	// 2nd option to provide the body for Hello interface using anonymous inner class.
	Hello obj2 = new Hello() {
		@Override
		public String sayHello() {
			// TODO Auto-generated method stub
			return "Welcome using Anonymous inner class";
		}
		public void hello() {
			System.out.println("Hello method of anonymous class");
		}
	};
	
	System.out.println(obj2.sayHello());
	
	}
}
