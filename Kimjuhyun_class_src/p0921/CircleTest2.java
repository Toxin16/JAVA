package p0921;
class Circle2 {
	int radius;
	String name;
	double pi = 3.14;
	
	public double getArea() {
		return pi*radius*radius;
	}
}

public class CircleTest2 {
	public static void main(String[] args) {
		Circle2 pizza = new Circle2();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area+"�Դϴ�.");
		
		Circle2 donut = new Circle2();
		donut.radius = 5;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name+"�� ������ "+area+"�Դϴ�.");

	}
}
