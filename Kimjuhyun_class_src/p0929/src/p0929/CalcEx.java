package p0929;
class Calc {
	public static int abs(int a) {
		return a>0?a:-a;
	}
	public static int max(int a, int b) {
		return (a>b)?a:b;
	}
	public static int min(int a, int b) {
		return (a>b)?b:a;
	}
}
public class CalcEx {
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.abs(-1);
		System.out.println(Calc.abs(-6));
		System.out.println(Calc.max(1, 3));
		System.out.println(Calc.min(1, 3));
	}
}
