package demoClass;


public class PatternDemo {

	public static void main(String[] args) {

		int rows = 5;

        	
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  "); 
            }
           
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
