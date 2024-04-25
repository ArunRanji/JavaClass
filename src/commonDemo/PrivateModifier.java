package commonDemo;



public class PrivateModifier{
	
	private int b=500;
	
	private void travel() {
		
		System.out.println("I am travelling on train");
	}
	
	public static void main(String[] args) {
		
		PrivateModifier p = new PrivateModifier();
		p.travel();
		
	}
	

}
