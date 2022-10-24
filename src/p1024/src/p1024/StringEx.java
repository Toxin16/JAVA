package p1024;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(", C++");
		
		System.out.println(a.length());
		System.out.println(b.length());
		
		a = a.replace("C#", "Java");
		System.out.println(a);
		
		System.out.println("자바"+3.14+false+'a');
	}
}
