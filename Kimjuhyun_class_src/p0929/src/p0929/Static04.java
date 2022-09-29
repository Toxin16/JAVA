package p0929;

public class Static04 {
	static int increase(int n) {
		return n++;
	}
	public static void main(String[] args) {
		int a;
		a = increase(5);
		System.out.println(a);
	}
}
