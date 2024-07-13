
public class ArrayDemo {

	public static void main(String[] args) {
//		int abc[];		// declaration of an array 
//		
//		//System.out.println(abc);
//		int xyz[]= {10,20,30,40,50,60,70,80};	// intialization of an array 
//		//System.out.println(xyz);
//		System.out.println("first value "+xyz[0]);
//		System.out.println("second value "+xyz[1]);
//		System.out.println("retreive the value using for loop");
//		System.out.println("size of array "+xyz.length);
//		for(int i=2;i<6;i++) {
//			System.out.println("value in using loop "+xyz[i]);
//		}
//		System.out.println("Retrieve the value using enhanced loop");
//		for(int n:xyz) {
//			System.out.println("Value using for each "+n);
//		}
		
		// array memory creation in java 
		int abc[]=new int[10];
		System.out.println("size of array "+abc.length);
		System.out.println(abc[0]);
		System.out.println(abc[9]);
		//System.out.println(abc[10]);  // exception generated 
		abc[0]=100;
		abc[1]=200;
		System.out.println("0 position value is "+abc[0]);
		System.out.println("1 position value is "+abc[1]);
	}

}
