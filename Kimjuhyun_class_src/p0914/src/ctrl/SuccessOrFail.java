package ctrl;

import java.util.Scanner;	//ctrl + shift + o

public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score >= 80)
			System.out.println("합격입니다.");
		else {
			System.out.println("불합격입니다.");
		}
		sc.close();
	}
}