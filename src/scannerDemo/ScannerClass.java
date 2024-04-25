package scannerDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		System.out.println("Enter Your Numbers :  ");
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println(i==j);
	}

}
