package polymorphism;

public class Child  extends Father{
	
	public Child() {
		
		super();
	}
	
	public void biCycle() {
		
		System.out.println("This is child bicycle");
	}
	
	public void oldGypsy(){
		
		
		System.out.println("This is child modified Gypsy");
		
	}
	public static void main(String[] args) {
		
		Child c = new Child();  
		c.biCycle();
		c.oldGypsy();
		
		
		Father f = new Father();
	
		
		Father f1 = new Child();  //upcasting
		
		
	}
	

}
