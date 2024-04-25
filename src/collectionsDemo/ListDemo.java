package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Object> a = new LinkedList<Object>();

		a.add("Oranium");
		a.add("tech");
		a.add(90);
		a.add(90.96);
		a.add(true);
		a.add(null);
		a.add('c');
		a.add("Oranium");

		System.out.println(a);

		int indexOf = a.indexOf("Oranium");
		System.out.println(indexOf);

		int value = a.lastIndexOf("Oranium");
		System.out.println(value);

		Object object = a.get(6);
		System.out.println(object);

		// to know how many elements inside the list

		int size = a.size();
		System.out.println(size);

		a.set(6, "chennai");

		System.out.println(a);

		a.remove(5);
		System.out.println(a);

		LinkedList<Object> b = new LinkedList<>();

		b = (LinkedList) a.clone();
		System.out.println(b);

		LinkedList<Object> c = new LinkedList<>();
		c.addAll(a);

		System.out.println(c);

		b.clear();
		c.clear();

		System.out.println(b);
		System.out.println(c);

		System.out.println("*****Normal forloop******");

		for (int i = 0; i < a.size(); i++) {

			System.out.println(a.get(i));
		}

		System.out.println("******Enhanced forLoop*******");

		for (Object p : a) { // [Oranium, tech, 90, 90.96, true, chennai, Oranium]

			System.out.println(p);
		}

		System.out.println("********Using Iterator method**********");

		Iterator<Object> iter = a.iterator();

		while (iter.hasNext()) {

			System.out.println(iter.next());

		}
		System.out.println("********Lamda Expression**********");

		a.forEach(k -> System.out.println(k));
		;

	}

}
