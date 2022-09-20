package p0920;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend, divisor;
		System.out.println("나뉨수를 입력하시오:");
		dividend = sc.nextInt();
		System.out.println("나눗수를 입력하시오:");
		divisor = sc.nextInt();
		
		try {
			System.out.println(dividend+"를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		} catch (Exception e) {
			System.out.println("0으로 나누기 오류");
			System.out.println("프로그램 종료");
			e.printStackTrace();
		}
		finally {
			System.out.println("수업중");
		}
		sc.close();
	}
}
