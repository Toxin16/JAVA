package p0908;

import java.util.Scanner;

public class InputData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		System.out.print("�̸� �Է� : ");
		name = scanner.next();//���ڿ� �Է¹���
		System.out.print("���� �Է� : ");
		age = scanner.nextInt();//���� �Է¹���
		System.out.println("����� �̸��� " + name + "�̰� ���̴� " + age +
				"�� �Դϴ�.");
		
		System.out.print("����� ������ �Է��ϼ��� : ");
		name = scanner.next();
		age = scanner.nextInt();
		System.out.println("����� �̸��� " + name + "�̰� ���̴� " + age +
				"�� �Դϴ�.");
		scanner.close(); //�� �̻� �Է¹��� ����
	}
}
