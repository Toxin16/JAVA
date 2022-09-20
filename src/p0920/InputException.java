package p0920;

import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력하시오.");
		int sum = 0, n = 0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("정수가 아닙니다. 다시 입력하세요.");
			sc.nextLine();	//현재 입력 스트림에 남아있는 토큰을 지운다.
			i--;	//인덱스가 증가하지 않도록 미리 감소
			continue;
		}
			sum += n;	
		}
		System.out.println("합은 " + sum);
		sc.close();
	}
}
