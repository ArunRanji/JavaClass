package stringPackage;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("welcome");

		System.out.println(sb.append(" guys"));

		System.out.println(sb);

		System.out.println(sb.insert(1, 'a'));
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		sb.replace(1, 3, "abc");
		System.out.println(sb);
		
		System.out.println(sb.delete(1, 3));
	}
	

}
