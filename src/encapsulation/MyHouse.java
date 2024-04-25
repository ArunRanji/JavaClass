package encapsulation;

public class MyHouse {

	public static void main(String[] args) {

		FriendHouse f = new FriendHouse();

		int amount = f.getLockerAmt();
		System.out.println(amount);

		f.setLockerAmt(2000);

	}

}
