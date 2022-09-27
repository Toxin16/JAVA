package p0927;

public class MethodEx {
	public static void main(String[] args) {
		MethodSample a = new MethodSample();
		int sum = a.getSum(2, 30);
		
		System.out.println(sum);
		System.out.println(a.getSum(4, 5));
		
		System.out.println(a.getSum(5));
	}
}
