package p1017;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자 입력 ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char op = sc.next().charAt(0);	//연산자를 문자로 변환
		Calc cal = null;	//추상클래스의 레퍼런스 변수
		switch (op) {
		case '+': 
			cal = new Add();	//up casting(동적바인딩). 부모가 자식을 가리킴
			break;
		case '-': 
			cal = new Sub();
			break;
		case '*': 
			cal = new Mul();
			break;
		case '/': 
			cal = new Div();
			break;
		}
		cal.setValue(a, b);
		System.out.println(cal.calculate());
		sc.close();
	}
}
