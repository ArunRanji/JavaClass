package inheritanceDemo;

public class FatherClass extends Parent {

	int cash = 100000;
	
	
	public void goldWatch() {

		System.out.println("This is fathers Gold watch");

			}
	
	

	public void biCycle() {

		System.out.println("This is fathers Yamaha RX100 Bike");

	}
	public static void main(String[] args) {
		FatherClass f = new FatherClass();
		f.ambassidorCar();
		f.land();
		System.out.println(f.cash);
		
	}

}
