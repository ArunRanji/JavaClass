package abstractionDemo;

public class Son implements Father,Mother {

	public void kawasakkiBike() {

		System.out.println("This is sons own bike");

	}

	public void ambassdorCar() {

		System.out.println("This is sons car");
	}
	@Override
	public void jewels() {
		
		System.out.println("this is sons jewels");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.ambassdorCar();
		s.kawasakkiBike();
		System.out.println(s.a);
		s.jewels();
		
		
	}

	

}
