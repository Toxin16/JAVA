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
		
		System.out.println("�簢���� �ʺ� �Է� : ");
		rect.width = sc.nextInt();
		System.out.println("�簢���� ���� �Է� : ");
		rect.height = sc.nextInt();
		
		System.out.println("�簢���� ������ " + rect.getArea()  + "�Դϴ�.");
		sc.close();
	}
}