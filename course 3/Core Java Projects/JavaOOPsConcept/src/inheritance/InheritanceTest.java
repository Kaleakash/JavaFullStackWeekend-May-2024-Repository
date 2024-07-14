package inheritance;
class A {			// super class. 
		void dis1() {
			System.out.println("A class method");
		}
}

class B extends A{			// sub class
	void dis2() {
		System.out.println("B class method");
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
			A obj1 = new A();
			obj1.dis1();
			
			B obj2 =new B();
			obj2.dis2();
			obj2.dis1();
	}

}
