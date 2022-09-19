package p0919;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중 선택하시오: ");
		String in = sc.next();
		if(in.equals("가위"))		//in이 숫자인 경우 == 이지만 문자이므로 equals
			System.out.println(1);
		else if(in.equals("바위"))
			System.out.println(2);
		else if(in.equals("보"))
			System.out.println(3);
		else
			System.out.println(0);
		
		switch(in) {
			case "가위":
				System.out.println(1); break;
			case "바위":
				System.out.println(2); break;
			case "보":
				System.out.println(3); break;
			default:
				System.out.println(0);
				sc.close();
		}
	}
}