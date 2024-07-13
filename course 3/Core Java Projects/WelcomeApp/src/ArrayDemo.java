
public class ArrayDemo {

	public static void main(String[] args) {
		int abc[];		// declaration of an array 
		
		//System.out.println(abc);
		int xyz[]= {10,20,30,40,50,60,70,80};	// intialization of an array 
		//System.out.println(xyz);
		System.out.println("first value "+xyz[0]);
		System.out.println("second value "+xyz[1]);
		System.out.println("retreive the value using for loop");
		System.out.println("size of array "+xyz.length);
		for(int i=2;i<6;i++) {
			System.out.println("value in using loop "+xyz[i]);
		}
		System.out.println("Retrieve the value using enhanced loop");
		for(int n:xyz) {
			System.out.println("Value using for each "+n);
		}
	}

}
