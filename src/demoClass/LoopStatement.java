package demoClass;

public class LoopStatement {

	public void forLoopdemo() {
		
		int num = 10;
		
		while (num>=1) {
			System.out.println(num);
			num--;
		}

	}

	public static void main(String[] args) {

		LoopStatement l = new LoopStatement();
		l.forLoopdemo();
	}

}
