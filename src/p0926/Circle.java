package p0926;

public class Circle {
	int radius;
	final double PI = 3.14;
	
	public Circle(int radius) {
		super();	//상속받은 필드나 메소드를 자식클래스에서 참조
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}