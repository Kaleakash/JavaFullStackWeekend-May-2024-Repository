package abc;		// java.util

public class Car {
	// property 
	int wheel=4;
	String colour;
	float price;			// instance variable. 
	
	Car() {			// empty constructor 
		System.out.println("object created...");
		wheel=4;
		colour="Black";
		price = 1000000;			// default value set for all object whenever memory created
	}
	
	// behaviour 
	void start() {
		System.out.println("car start");
	}
	
	void appliedGear() {
		System.out.println("applied gear");
	}
	void moving() {
		System.out.println("car is moving");
	}
	void stop() {
		System.out.println("car stop");
	}
	void carInfo(String name) {
		String info="Car details "+name;		// local variable.
		System.out.println(info);
		System.out.println("wheel "+wheel);
		System.out.println("colour "+colour);
		System.out.println("price "+price);
		
	}
}
