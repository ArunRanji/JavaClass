package stringPackage;

public class ReverseA_String {

	public static void main(String[] args) {

		String s = "oranium";
		String str = "";

		for(int i=s.length()-1;i>=0; i--){ 
			
			str = str + s.charAt(i);    
		}

		System.out.println(str);
	}

}
