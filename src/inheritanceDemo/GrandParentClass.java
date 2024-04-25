package inheritanceDemo;

public class GrandParentClass {

	public void ambassidorCar() {

		System.out.println("this is grand father ambassidor car");

	}

	public void land() {

		System.out.println("this is grand father 10 acre land");

	}

	public static void main(String[] args) {

		SonClass s = new SonClass();

		s.biCycle(); // father property
		s.goldWatch(); // father property
		s.skodaCar(); // own
		s.superBike(); // own
		System.out.println(s.cash);
//		s.ambassidorCar(); // grandparent property
//		s.land(); // grand parent property

		System.out.println();

		FatherClass fc = new FatherClass();
		System.out.println(fc.cash);
		fc.biCycle();
		fc.goldWatch();
//		fc.ambassidorCar();
//		fc.land();
		System.out.println();

		GrandParentClass gpc = new GrandParentClass();
		gpc.ambassidorCar();
		gpc.land();

	}

}
