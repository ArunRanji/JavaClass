package polymorphism;

public class Father {

	int a;

	public Father() {
		this("arun");
		

		System.out.println(a);

	}

	public Father(String b) {
		this("Arun","Prabhakaran");
		System.out.println(b);

	}

	public Father(String c, String d) {

		System.out.println(c + d);

	}

	public static void main(String[] args) {
		Father f = new Father();

	}
}
