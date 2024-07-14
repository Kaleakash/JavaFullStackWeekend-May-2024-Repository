package inheritance;

public class Developer extends Employee{
	private String projectName;
	public void readDev() {
		System.out.println("Enter the prject name");
		projectName = obj.next();
	}
	public void disDev() {
		System.out.println("Project name "+projectName);
	}
}
