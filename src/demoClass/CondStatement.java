package demoClass;

public class CondStatement {

	String proof = "Pan card";

	public void switchmethod() {

		switch (proof) {
		case "aadharcard":

			System.out.println(proof + " is a valid proof to open the bank account");


			
		case "voter id":
			System.out.println(proof + " is a valid proof to open the bank account");
			break;

		case "Pan card":
			System.out.println(proof + " is a valid proof to open the bank account");
			break;

		case "passport":

			System.out.println(proof + " is a valid proof to open the bank account");
			break;

		default:
			System.out.println("provide valid proof");

		}
	}

	public static void main(String[] args) {

		CondStatement c = new CondStatement();
		c.switchmethod();
	}

}
