package p0915;

import java.util.Scanner;
//����� ����ϴ� ���α׷� �ۼ�
public class ContinueExample {
	public static void main(String[] args) {
		//Scanner Ŭ���� import ��Ű�� ����Ű ctrl(^) + shift(~) + o
		//import java.util.Scanner; ������ �ڵ����� ����
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("5���� ������ �Է��ϼ���");
		for (int i=0; i<5; i++) {
			int n = sc.nextInt();
			if(n<=0) 
				continue;	//�Ʒ���� �������� �ʰ� ������ �ݺ���.
			sum += n;
		}
		System.out.println("����� ���� " + sum);
		sc.close();
	}
}
