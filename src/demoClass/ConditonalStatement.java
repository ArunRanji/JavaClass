package demoClass;

public class ConditonalStatement {

	int weekNumber = 3;
	
	public void week() {
		
		if (weekNumber==1) {
			System.out.println("sunday");
			
		}else if (weekNumber==2) {
			
			System.out.println("monday");
		}else if (weekNumber==4) {
			
			System.out.println("monday");
		}
		else {
			System.out.println("saturday");
		}
		
	}

	public static void main(String[] args) {

		ConditonalStatement c = new ConditonalStatement();
		c.week();
		
	}

}
