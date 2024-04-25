package demoClass;

public class MethodsDemo {


	double methodNameWithOutParameter (double a, int b) {

		return a + b;

	}

	public static void main(String[] args) {

		MethodsDemo m = new MethodsDemo();
		double value = m.methodNameWithOutParameter(20.55, 30);
		System.out.println(value);

	}

}
