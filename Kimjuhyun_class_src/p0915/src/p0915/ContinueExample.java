package p0915;

import java.util.Scanner;
//양수만 출력하는 프로그램 작성
public class ContinueExample {
	public static void main(String[] args) {
		//Scanner 클래스 import 시키는 단축키 ctrl(^) + shift(~) + o
		//import java.util.Scanner; 라인이 자동으로 생성
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("5개의 정수를 입력하세요");
		for (int i=0; i<5; i++) {
			int n = sc.nextInt();
			if(n<=0) 
				continue;	//아래명령 실행하지 않고 다음을 반복함.
			sum += n;
		}
		System.out.println("양수의 합은 " + sum);
		sc.close();
	}
}
