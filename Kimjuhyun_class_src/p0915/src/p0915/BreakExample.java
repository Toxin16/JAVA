package p0915;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.print(">>");
			String text = sc.nextLine(); //���ڿ� nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("�����մϴ�");
		sc.close();
	}
}
