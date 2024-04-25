package demoClass;

public class ArrayDemo {

	// 0 ,1 , 2 , 3 , 4 , 5
	int arr[] = { 10, 20, 30, 40, 50, 60 };

	public void arrayConcept() {

		for (int i = arr.length - 1; i >= 0; i--) { // 6<=6

			System.out.println(arr[i]); // 10, 20, 30,40,50,60
		}

	}

	public void enhancedForLoop() {

		for (int k : arr) {

			System.out.println(k);

		}

	}

	public static void main(String[] args) {

		ArrayDemo ad = new ArrayDemo();
		//ad.arrayConcept();
		
		ad.enhancedForLoop();

	}

}
