package p0914;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//클래스명 객체명 = new 클래스명
		int a, b;
		String str;
		
		System.out.print("첫 번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		b = sc.nextInt();
		
		//삼항 연산자 : 조건식이 참이면 :앞, 거짓이면 뒤
		str = (a>b)?"첫 번째 수가 커요":"두 번째 수가 커요";
		System.out.println(str);
		sc.close();
	}
}
