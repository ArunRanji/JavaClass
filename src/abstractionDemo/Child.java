package abstractionDemo;

public class Child extends Parent{

	
	public void toyCars() {
		
		
		System.out.println("this is childs toy cars");
	}

	@Override
	public void goldWatch() {
		// TODO Auto-generated method stub
		System.out.println("this is child gold watch");
		
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.toyCars();
		c.goldWatch();
	
	}
}
