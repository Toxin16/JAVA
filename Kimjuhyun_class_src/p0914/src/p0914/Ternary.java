package p0914;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Ŭ������ ��ü�� = new Ŭ������
		int a, b;
		String str;
		
		System.out.print("ù ��° ���� : ");
		a = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		b = sc.nextInt();
		
		//���� ������ : ���ǽ��� ���̸� :��, �����̸� ��
		str = (a>b)?"ù ��° ���� Ŀ��":"�� ��° ���� Ŀ��";
		System.out.println(str);
		sc.close();
	}
}
