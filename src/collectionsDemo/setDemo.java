package collectionsDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class setDemo {

	public static  void main(String[] args) {

		TreeSet<Object> a = new TreeSet<>();

		a.add(90);
		a.add(45);
		a.add(55);
		a.add(566);
		a.add(345);
		

		System.out.println(a);
		
		
		boolean contains = a.contains("Oranium");
		System.out.println(contains);
		
		int size = a.size();
		System.out.println(size);
		
		
		System.out.println("*******Convert set into array***********");

		Object[] arr = a.toArray();
		
		for(int i = 0; i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println("*******enhanced for loop***********");
		
		for(Object k:a) {
			
			System.out.println(k);
		}
		
		System.out.println("*******Iterator method loop***********");
		
		Iterator<Object> iter = a.iterator();
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
		System.out.println("*******lamda expressions***********");
		
		a.forEach(j->System.out.println(j));
		
	}

}
