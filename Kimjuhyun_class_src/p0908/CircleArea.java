package p0908;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.141592;	//��ȣ��� : ������ ���� �ʴ� ���� 
		double radius = 10.0;
		//���� ������ pi * r * r
		double circleArea = radius * radius * PI;
		System.out.println("���� ������ " + circleArea + "�Դϴ�.");
		System.out.printf("���� ������ %f �Դϴ�.\n", circleArea);

		//���� �ѷ��� 2 * pi * r
		double circlePerimeter = 2 * PI * radius;
		System.out.println("���� �ѷ��� " + circlePerimeter + "�Դϴ�.");
		System.out.printf("���� �ѷ��� %.2f �Դϴ�.\n", circlePerimeter);
	}
}
