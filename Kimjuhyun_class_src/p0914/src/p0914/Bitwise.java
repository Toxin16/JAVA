package p0914;

import java.util.Scanner;

public class Bitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Ŭ������ ��ü�� = new Ŭ������
		int a, b, c;
		String str;
		
		System.out.print("ù ��° ���� �Է� : ");
		a = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		b = sc.nextInt();
		
		//decimal:10����, hexadecimal:16����, octal:8����
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
