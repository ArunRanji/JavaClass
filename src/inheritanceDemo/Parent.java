package inheritanceDemo;


import commonDemo.ProtectedDemo;

class Parent extends ProtectedDemo{
	
	int cash = 1000;

	void ambassidorCar() {

		System.out.println("this is grand father ambassidor car");

	}

	void land() {

		System.out.println("this is grand father 10 acre land");

	}
	public static void main(String[] args) {
		
		Parent pa = new Parent();
		pa.ambassidorCar();
		pa.land();
		pa.cycle();
		
		System.out.println(pa.mark);
		
		
	}

}
