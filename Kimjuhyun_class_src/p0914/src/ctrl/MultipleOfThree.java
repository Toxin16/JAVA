package ctrl;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num % 3 == 0)
			System.out.println(num + "는 3의 배수");
		else {
			System.out.println(num + "는 3의 배수가 아닙니다.");
		}
		sc.close();
	}
}