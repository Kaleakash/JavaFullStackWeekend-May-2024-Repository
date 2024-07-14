package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("Generic employee information");
		Employee emp = new Employee();
		emp.readEmp();
		emp.disEmp();
		
		
		
		System.out.println("---------------------------");
		System.out.println("Manager information");
		Manager mgr = new Manager();
		//mgr.readEmp();// id,name,salary
		mgr.readMgr();	// numberofemp
		
		//mgr.disEmp();		// id,name,salary
		mgr.disMgr();		// numberofemp
		
		System.out.println("---------------------------");
		System.out.println("Developer information");
		Developer dev = new Developer();
		//dev.readEmp();
		dev.readDev();
		
		//dev.disEmp();
		dev.disDev();
		
		System.out.println("---------------------------");
		System.out.println("Project Manager information");
		ProjectManager pmgr = new ProjectManager();
		//pmgr.readEmp();
		//pmgr.readMgr();
		pmgr.readPmgr();
		
		
		
		//pmgr.disEmp();
		//pmgr.disMgr();
		pmgr.disPmgr();
	}

}
