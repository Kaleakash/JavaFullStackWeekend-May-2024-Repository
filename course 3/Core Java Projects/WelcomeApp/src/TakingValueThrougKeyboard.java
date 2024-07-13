
import java.util.Scanner;

public class TakingValueThrougKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the value of a");
//		int a = sc.nextInt();  // it is use to scan int value 
//		System.out.println("enter the value of b");
//		int b = sc.nextInt();
//		int sum = a+b;
//		System.out.println("Sum of two number is "+sum);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();		// scan string value 
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		
	}

}
