package inheritanceDemo;

public class SonClass extends FatherClass {

	public void skodaCar() {
		
		System.out.println(super.cash);

		System.out.println("This is son skoda car");
	}

	public void superBike() {

		System.out.println("This is son kawasaki super bike");
	}
	
	public static void main(String[] args) {
		
		SonClass s =new SonClass();
		s.skodaCar();
	}

	
}
