package ctrl;

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, sum = 0;
		System.out.println("���� �Է� �� �������� -1�� �Է��ϼ���.");
		int n = sc.nextInt();
		while(n != -1) {
			cnt++;
			sum += n;
			n = sc.nextInt();
		}
		if(cnt == 0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.println("�Էµ� ���� ������ " + cnt + "�� �Դϴ�.");
			System.out.println("�Էµ� ���� ����� " + (double)sum/cnt + "�Դϴ�.");
		}
	}
}