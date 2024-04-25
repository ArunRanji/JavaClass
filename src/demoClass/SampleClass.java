package demoClass;

public class SampleClass {

	int a = 64;

	public void incDecOps() {
		
		if (a%5==0) {
			
			System.out.println(a + "divisible by 5");
			if (a%3==0) {
				System.out.println(a + "divisible by 3");
				
				if (a%6==0) {
					System.out.println(a + "divisible by 6");
				}
				else {
					System.out.println(a + " is not divisible by 6");
				}
			}else {
				System.out.println(a + " is not divisible by 3");
			}
			
			
		}else {
			System.out.println(a + " is not divisible by 5");
		}
	}
	
		public static void main(String[] args) {
	
			SampleClass s = new SampleClass(); // instance
			s.incDecOps();
		}

}
