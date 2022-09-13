package p0913;

public class TernaryOperator {
	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.println((a>b) ? (a-b) : (b-a));	//삼항연산자
		//조건문
		if(a>b) {
			System.out.println("a가 큰 값 " + (a-b));
		} else {
			System.out.println("b가 큰 값 " + (b-a));
		}
	}
}
