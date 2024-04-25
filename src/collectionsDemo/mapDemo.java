package collectionsDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class mapDemo {
	
	public static void main(String [] args) {
		
		LinkedHashMap<String,Integer> h = new LinkedHashMap<>();
		
		h.put("English", 91);
		h.put("Tamil", 90);
		h.put("Maths", 89);
		h.put("Science", 70);
		h.put("Social", 80);
		h.put("CS", 90);
		h.put(null, 90);
		h.put("Tamil", null);
		h.put(null, null);
		h.put("socialscience", null);
		
		System.out.println(h);
		
		
		
		System.out.println("*********Iterating the keys**********");
		
		Set<String> keySet = h.keySet();
		for (String k : keySet) {
			System.out.println(k);
		}
		
		System.out.println("*********Iterating the values**********");
		Collection<Integer> values = h.values();
		
		for(Integer i : values) {
			System.out.println(i);
		}
		
		Set<Entry<String, Integer>> entrySet = h.entrySet();
		
		for(Entry<String, Integer> j:entrySet) {
			
			System.out.println(j.getKey() +"==" +j.getValue());
		}
		
		
		
	}

}
