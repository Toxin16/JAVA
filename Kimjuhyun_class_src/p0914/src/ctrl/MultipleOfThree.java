package ctrl;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num % 3 == 0)
			System.out.println(num + "�� 3�� ���");
		else {
			System.out.println(num + "�� 3�� ����� �ƴմϴ�.");
		}
		sc.close();
	}
}