package ctrl;

import java.util.Scanner;	//ctrl + shift + o

public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();
		
		if(score >= 80)
			System.out.println("�հ��Դϴ�.");
		else {
			System.out.println("���հ��Դϴ�.");
		}
		sc.close();
	}
}