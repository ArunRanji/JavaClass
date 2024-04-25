package staticDemo;

public class StaticDemoClass {

	int id;
	String name;
	static String cname = "SRM";   //Static Variable

//	static {
//
//		cname = "SRM";      //Static block
//	}

	public void studentDetails(int id, String name, String cname) {

		this.id = id;
		this.name = name;
		this.cname = cname;

		System.out.println("Student name is :" + name);
		System.out.println("Student id is :" + id);
		System.out.println("Student College name is :" + cname);
		System.out.println("******************************");
	}

	public static void main(String[] args) {

		StaticDemoClass s = new StaticDemoClass();
		s.studentDetails(10, "Vijay", "SRM"); // 4 , 10, 10
		s.studentDetails(11, "Arun", "SRM"); // 4 , 10, 10
		s.studentDetails(12, "kumar", "SRM"); // 4 , 10, 10
		System.out.println(StaticDemoClass.cname);
	}

}
