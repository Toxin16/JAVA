package ctrl;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학년을 입력하세요 : ");
		int year = sc.nextInt();
		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if (year == 4) {
			if(score >= 70)
				System.out.println("합격");
			else 
				System.out.println("불합격");
		} 
		else {
			if(score >= 60)
				System.out.println("합격");
			else {
				System.out.println("불합격");
			}
		}
		
	}
}