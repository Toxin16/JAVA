package p0921;

public class CircleTest3 {
	int radius;
	String name;
	double pi = 3.14;
	
	public double getArea() {
		return pi*radius*radius;
	}
	
	public static void main(String[] args) {
		CircleTest3 pizza = new CircleTest3();
		pizza.radius = 10;
		pizza.name = "자바피자";
		System.out.println(pizza.name+"의 면적은 "+pizza.getArea()+"입니다.");
		
		CircleTest3 donut = new CircleTest3();
		donut.radius = 5;
		donut.name = "자바도넛";
		System.out.println(donut.name+"의 면적은 "+donut.getArea()+"입니다.");
	}
}
