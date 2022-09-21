package p0921;

import java.util.Scanner;

public class Rectangle {
	int width, height;
	
	public double getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.println("사각형의 너비 입력 : ");
		rect.width = sc.nextInt();
		System.out.println("사각형의 높이 입력 : ");
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea()  + "입니다.");
		sc.close();
	}
}