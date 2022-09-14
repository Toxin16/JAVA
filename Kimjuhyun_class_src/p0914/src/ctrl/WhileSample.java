package ctrl;

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, sum = 0;
		System.out.println("정수 입력 후 마지막에 -1을 입력하세요.");
		int n = sc.nextInt();
		while(n != -1) {
			cnt++;
			sum += n;
			n = sc.nextInt();
		}
		if(cnt == 0)
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.println("입력된 수의 개수는 " + cnt + "개 입니다.");
			System.out.println("입력된 수의 평균은 " + (double)sum/cnt + "입니다.");
		}
	}
}