package polymorphism;

public class MethodOverLoadDemo {

	public void add() {
		
		int a=10, b=20;
		System.out.println(a+b);

	}
	public int add(int a, int b) {
		
		return a+b;
	}
	public int add(int a,int b,int c) {
		
		return a+b+c;
		
	}
	public double add(int a, double b){
		
		return a*b;
		
	}
	public double add(double a,int b) {
		
		return a+b;
	}
	

	public static void main(String[] args) {

		MethodOverLoadDemo m = new MethodOverLoadDemo();
		m.add();
		System.out.println(m.add(10, 30));
		System.out.println(m.add(10, 20, 30));
		System.out.println(m.add(5, 5.5));
		double num = m.add(10.5, 11);
		System.out.println(num);
		
	}

}
