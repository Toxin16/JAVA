package ctrl;

import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		switch (score/10) {
		case 10:
		case 9:
			grade = 'A';	break;
		case 8:
			grade = 'B';	break;
		case 7:
			grade = 'C';	break;
		case 6:
			grade = 'D';	break;
		default:
			grade = 'F';	break;
		}
		System.out.println("학점은 " + grade + "입니다.");
	}
}

//case문에서 실수 리터럴은 허용되지 않는다.