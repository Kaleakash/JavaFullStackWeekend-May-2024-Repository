package inheritance;

public class Developer extends Employee{
	private String projectName;
	public void readDev() {
		readEmp();
		System.out.println("Enter the prject name");
		projectName = obj.next();
	}
	public void disDev() {
		disEmp();
		System.out.println("Project name "+projectName);
	}
}
