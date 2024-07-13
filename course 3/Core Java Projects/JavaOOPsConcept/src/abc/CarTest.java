package abc;

public class CarTest {

	public static void main(String[] args) {
		//start();
//		Car innova = new Car();		// heap memory 
//		innova.start();
//		innova.appliedGear();
//		innova.moving();
//		innova.stop();
		
		Car innova = new Car();
		//innova.carInfo("Innova Car");
		innova.colour="White";
		innova.price=2600000;
		innova.wheel=4;
		innova.carInfo("Innova Car");
		System.out.println("-----------------------");
		Car ertiga = new Car();
		//ertiga.carInfo("Ertiga Car");
		ertiga.colour="Gray";
		ertiga.price=1500000;
		ertiga.wheel=4;
		ertiga.carInfo("Ertiga Car");
	}

}
