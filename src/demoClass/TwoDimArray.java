package demoClass;

public class TwoDimArray {

	int tarr[][] = { { 10, 20, 30 }, { 40, 50, 60, 65 }, { 70, 80, 90, 95, 96 } };

	public void checkTwoD() {

		System.out.println(tarr.length); // it will return no of rows
		System.out.println(tarr[2].length); // it will return number of columns in a row
		System.out.println(tarr[2][3]); // it will return the particular element or data in a row and column

		for (int row = 0; row < tarr.length; row++) { // row=1 1<3

			for (int col = 0; col < tarr[row].length; col++) { // 3<tarr[0]

				System.out.print(tarr[row][col] + " "); // [0][2] }
			}
			System.out.println();
		}
	}

	public void enhancedForLoop() {
		
		//datatype tempName : Arrayname
		for (int []i : tarr) {  // {10,20,30} {40,50,60,65}
			
			for (int j : i) { //50 : {40,50,60,65}
				
				System.out.print(j+ " "); // 10 20 30
			}							//   40 50
			System.out.println();
		}
		
	}
	
	String a ="oranium";
	

	public static void main(String[] args) {

		TwoDimArray t = new TwoDimArray();
		//t.checkTwoD();
		t.enhancedForLoop();
		

	}

}
