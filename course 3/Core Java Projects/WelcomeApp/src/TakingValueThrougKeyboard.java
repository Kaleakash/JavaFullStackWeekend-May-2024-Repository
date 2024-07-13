
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
		
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//		System.out.println("Enter the name");
//		String name = sc.next();		// scan string value 
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//		System.out.println("id is "+id);
//		Syste	m.out.println("name is "+name);
//		System.out.println("salary is "+salary);
		
		System.out.println("how many record do you want to store");
		int n = sc.nextInt();
		int id[]=new int[n];
		String names[]=new String[n];
		float salary[]=new float[n];
		String desg[]=new String[n];
		System.out.println("Enter each employee record one by one");
		for(int i=0;i<n;i++) {
			System.out.println("Enter id");
			id[i]=sc.nextInt();
			System.out.println("Enter name");
			names[i]=sc.next();
			System.out.println("Enter the salary");
			salary[i]=sc.nextFloat();
			System.out.println("Enter the desg");
			desg[i]=sc.next();
		}
		// business logic 
		for(int i=0;i<n;i++) {
			if(desg[i].equalsIgnoreCase("Manager")) {
				salary[i]=salary[i]+5000;
			}else if(desg[i].equals("Tester")) {
				salary[i]=salary[i]+3000;
			}else {
				salary[i]=salary[i]+1500;
			}
		}
		System.out.println("All Employee records are");
		for(int i=0;i<n;i++) {
		System.out.println("id is "+id[i]+" Name is "+names[i]+" Salary is "+salary[i]+" Designation is "+desg[i]);
		}
	}

}
