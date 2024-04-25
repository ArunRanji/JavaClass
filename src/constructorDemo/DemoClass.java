package constructorDemo;

public class DemoClass extends Parent {

	int a; // variable declaration
	

	public DemoClass() {
		
		
		a = 20;
		System.out.println(a);
	}

	public DemoClass(int b) {
		this("Oranium","tech");
		System.out.println(b);
	
		
	}

	public DemoClass(String a, String b) {

		super();
		System.out.println(a + b);

	}

	public void defaultConstructor() {

		System.out.println(a);
	}

	public static void main(String[] args) {

		DemoClass d = new DemoClass();

//		d.defaultConstructor();
//		DemoClass dc = new DemoClass(55);
//		DemoClass dc1 = new DemoClass("Arun", "Oranium");

	}

}
