package demoClass;

public class EvenOddNumbers {

	public static void main(String[] args) {

		System.out.println("Even numbers from 1 to 100:");
	

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else {
				System.out.println("Odd numbers from 1 to 100:");
				System.out.print(i + " ");
			}
		}
	}
}
