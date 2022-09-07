package p0907;

public class Literal {

	public static void main(String[] args) {
		char a0 ='A';
		char a1 = '\u0041';
		char han0 = '글';
		char han1 = '\uae00';
		int i = 1;
		long l = 1l;
		float f = 3.14f;
		double pi0 = 3.14159;
		pi0 = 3.1415;
		final double PI1 =3.14159;
		//final을 적으면 기호 상수로 만들 수 있음.
		//숫자의 의미를 더 확실하게 기호로 전달하기 위해 사용
		//즉 가독성을 높이기 위해서도 사용, 일반적으로 대문자로 만듦
		//pi1 = 3.1415; 
		System.out.println("char은 한 문자만을 저장");
		System.out.println("자바에서 문자는 2바이트 유니코드");
		System.out.println("a0 = " + a0 + " a1 = " + a1);
		System.out.println("han0 = " + han0 + " han1 = " + han1);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("숫자 literal은 int형");
		System.out.println("실수 literal은 double형");
		System.out.println("float 변수에는 숫자 뒤에 f를 붙임");
		System.out.println("float변수에는 숫자 뒤에 f를 붙임");
		System.out.println("f = " + f + "pi0 = " + pi0);
		System.out.println("PI1 = " + PI1);
	}

}
