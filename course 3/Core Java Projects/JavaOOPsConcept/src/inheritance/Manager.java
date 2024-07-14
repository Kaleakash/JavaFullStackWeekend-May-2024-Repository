package inheritance;

public class Manager extends Employee{
private int numberOfEmp;
private Address add = new Address();
public void readMgr() {
	readEmp();    // id,name,salary
	System.out.println("Enter number of employee working under him/her");
	numberOfEmp = obj.nextInt();		// number of emp 
	add.readAdd();					// city and state 
}
public void disMgr() {
	disEmp();// display id,name,salary
	System.out.println("Number of employee working under him/her "+numberOfEmp);
	add.disAdd();  // display city and state 
}
}
