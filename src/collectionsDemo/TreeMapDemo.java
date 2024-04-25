package collectionsDemo;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public void add() throws InterruptedException {
		
		Thread.sleep(3000);
	}

	public static void main(String[] args) {

		TreeMap<String, Integer> t = new TreeMap<>();
		

		t.put("apple", 200);
		t.put("mango", 150);
		t.put("Orange", 130);
		t.put("banana", 100);
		t.put("kiwi", 300);
		t.put("dragon fruit", 350);
		t.put("avacado", 400);

		System.out.println(t);

	}

}
