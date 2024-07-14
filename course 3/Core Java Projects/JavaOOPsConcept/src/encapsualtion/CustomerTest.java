package encapsualtion;

public class CustomerTest {

	public static void main(String[] args) {
	Customer c1 = new Customer();
	c1.setCid(100);
	c1.setCname("Ravi");
	c1.setAge(21);
	
	
	Customer c2 = new Customer(101, "Lex", 25);
	
	System.out.println("Customer details");
	System.out.println("id is "+c1.getCid());
	System.out.println("name is "+c1.getCname());
	System.out.println("age is "+c1.getAge());
	
	System.out.println("Customer details");
	System.out.println("id is "+c2.getCid());
	System.out.println("name is "+c2.getCname());
	System.out.println("age is "+c2.getAge());
	
	}

}
