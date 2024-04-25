package demoClass;

public class StringDemo {

	public static void main(String[] args) {

	
		String s = "oranium";
		String s1 = "ORANIUM";
		String s2 = "     Welcome You     ";
		String s3 = "Welcome You all to Java Class";

		System.out.println(s.toUpperCase());

		System.out.println(s1.toLowerCase());
		
		// if i want to remove a space
		System.out.println(s2.trim()); // Remove the leading and trailing spaces
		
		System.out.println(s.indexOf("i")); // return the first occurence of character
		System.out.println(s.lastIndexOf("i")); // it return last occurence of character // 
		System.out.println(s.charAt(6)); // it return the character of an index
		
		
		System.out.println(s.startsWith("oran")); //true
		System.out.println(s.endsWith("umi"));  // true
		 
		System.out.println(s.contains("ani"));  //true
		
		System.out.println(s.concat(s1));  // it will combine or concat 2 different strings
		
		char[] c = s.toCharArray();  // {o,r,a,n,i,u,m} 
		
		for(char character : c) {
			
			System.out.println(character);
		}
	
		
		String[] split = s3.split(" "); //{welcome,you,all,to,java,class}
		
		for(String sp : split) {
			
			System.out.println(sp);
		}
		
		
		System.out.println(s.substring(1)); //it cuts from beginning index
		
		System.out.println(s.substring(1, 6)); // it trims prefix index and sufix index
		
		System.out.println(s.length());
		
	}

}
