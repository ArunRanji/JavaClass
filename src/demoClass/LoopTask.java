package demoClass;

public class LoopTask {

	public void checkMark() {

		for (int row = 1; row <=3 ; row++) { // 2<=5

			for (int col = 1; col <= 5; col++) { // 2<=5

				if (row == 1 || row == 5 || col == 1 || col == 5) { // * * * * *
																	// * *
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}

	}

	public void enhancedLoop() {
		
		

	}

	public static void main(String[] args) {

		LoopTask lt = new LoopTask();
		lt.checkMark();

	}

}
