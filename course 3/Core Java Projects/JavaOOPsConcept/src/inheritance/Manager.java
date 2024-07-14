package inheritance;

public class Manager extends Employee{
private int numberOfEmp;

public void readMgr() {
	System.out.println("Enter number of employee working under him/her");
	numberOfEmp = obj.nextInt();
}
public void disMgr() {
	System.out.println("Number of employee working under him/her "+numberOfEmp);
}
}
