package p0914;

import java.util.Scanner;

public class Bitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//클래스명 객체명 = new 클래스명
		int a, b, c;
		String str;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		b = sc.nextInt();
		
		//decimal:10진수, hexadecimal:16진수, octal:8진수
		System.out.printf("%d, %x, %o\n", a, a, a);
		System.out.printf("%d, %x, %o\n", b, b, b);
		
		c = a & b;
		System.out.println(c);
		c = a | b;
		System.out.println(c);
		a = a + b;
		System.out.println(a);
		a += b;
		System.out.println(a);
		
		a &= b;	// a = a & b;
		a |= b;	// a = a | b;
		System.out.println(a);
		sc.close();
	}
}
