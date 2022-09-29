package p0929;

public class Static03 {
	int radius;
	public Static03() {	
	}
	public Static03(int radius) {
		this.radius = radius;
	}
	double getArea() {
		return Math.PI * radius * radius;	//Math는 디폴트로 정의된 클래스
	}
	
	public static void main(String[] args) {
		Static03 st03 = new Static03(10);
		System.out.println(st03.getArea());
		//Java document 사이트에서 Math 클래스 참조
		System.out.println(Math.abs(-5));
	}
}
