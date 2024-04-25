package inheritanceDemo;

public class DaughterClass extends FatherClass {

	public void scootyPep() {

		this.jewels();
		System.out.println("This is daughters scooty pep");

	}

	public void jewels() {

		System.out.println("This is daughters 50 grams jewel ");

	}

	public static void main(String[] args) {

		DaughterClass dc = new DaughterClass();
		System.out.println(dc.cash);
		
		dc.scootyPep();
		//dc.jewels();
		
		

	}

}
