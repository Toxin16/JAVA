package ctrl;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�г��� �Է��ϼ��� : ");
		int year = sc.nextInt();
		System.out.println("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		if (year == 4) {
			if(score >= 70)
				System.out.println("�հ�");
			else 
				System.out.println("���հ�");
		} 
		else {
			if(score >= 60)
				System.out.println("�հ�");
			else {
				System.out.println("���հ�");
			}
		}
		
	}
}