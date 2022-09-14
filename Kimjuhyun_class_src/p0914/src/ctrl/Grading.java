package ctrl;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println(score + "점의 학점은 " + grade + "입니다.");
		sc.close();
	}
}