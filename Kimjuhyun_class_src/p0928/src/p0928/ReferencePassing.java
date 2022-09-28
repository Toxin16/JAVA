package p0928;
class Circle {	//Circle클래스
	int radius;	//필드
	public Circle(int radius) {	//생성자
		this.radius = radius;	//인자로 받아온 radius값을 필드radius에 대입
	}
	public double getArea() {	//면적 구하는 함수
		return 3.14 * radius * radius;
	}
}

public class ReferencePassing {
	public static void main(String[] args) {	//main함수
		Circle pizza = new Circle(5); 	//Circle클래스의 pizza객체생성, 생성자는 Circle, raidus인자는 5
		
		increase(pizza);
		
		System.out.println(pizza.radius);
	}
	
	static void increase(Circle m) {	//Circle타입의 매개변수 m
		m.radius++;
	}
}
