package bean;

public class Manager extends Employee{

	public void disManager() {
		//System.out.println("id "+id); // private within a same class. 
		System.out.println("name "+name);
		System.out.println("salary "+salary);
		System.out.println("designation "+designation);
	}
}
