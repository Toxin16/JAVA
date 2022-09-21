package p0921;

public class CircleConst {
	int radius;
	String name;
	double pi = 3.14;
	
	public CircleConst() {	//생성자
		radius = 1;
		name = "피자";
	}
	public CircleConst(int radius) {
		this.radius = radius;
	}
//	public CircleConst(int r, String n) {
//		radius = r;
//		name = n;
//	}
	public CircleConst(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	public double getArea() {	//함수
		return pi*radius*radius;
	}
	public static void main(String[] args) {
		CircleConst pizza1 = new CircleConst();	//8번 실행
		CircleConst pizza2 = new CircleConst(5);	//12번 실행
		//radius = 10, name=자바피자
		//객체 생성시 필드 값을 초기화
		CircleConst pizza3 = new CircleConst(10, "자바피자");
		System.out.println(pizza1.radius);
		System.out.println(pizza2.radius);
		System.out.println(pizza3.radius);
	}
}
