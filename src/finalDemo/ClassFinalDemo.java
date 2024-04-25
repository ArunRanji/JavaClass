package finalDemo;

public class ClassFinalDemo {

	final int a = 10;

	public final void add() {

		System.out.println(a);
	}

	public static void main(String[] args) {
		
		ClassFinalDemo c = new ClassFinalDemo();
		c.add();
		
		
	}
}
