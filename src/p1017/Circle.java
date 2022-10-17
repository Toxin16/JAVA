package p1017;

public class Circle implements Shape {
	private int r;	//반지름
	public Circle(int r) {	//생성자
		this.r = r;	//멤버변수(좌변), 매개변수(우변)
	}
/*	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
*/
	@Override
	public void draw() {
		System.out.println("반지름이 " + this.r + "인 원입니다.");
	}
	@Override
	public double getArea() {	//면적 계산
		return (this.r * this.r * PI);
	}

}
