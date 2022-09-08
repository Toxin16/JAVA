package p0908;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.141592;	//기호상수 : 변경을 하지 않는 변수 
		double radius = 10.0;
		//원의 면적은 pi * r * r
		double circleArea = radius * radius * PI;
		System.out.println("원의 면적은 " + circleArea + "입니다.");
		System.out.printf("원의 면적은 %f 입니다.\n", circleArea);

		//원의 둘레는 2 * pi * r
		double circlePerimeter = 2 * PI * radius;
		System.out.println("원의 둘레는 " + circlePerimeter + "입니다.");
		System.out.printf("원의 둘레는 %.2f 입니다.\n", circlePerimeter);
	}
}
