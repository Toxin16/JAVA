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
		pizza.name = "�ڹ�����";
		System.out.println(pizza.name+"�� ������ "+pizza.getArea()+"�Դϴ�.");
		
		CircleTest3 donut = new CircleTest3();
		donut.radius = 5;
		donut.name = "�ڹٵ���";
		System.out.println(donut.name+"�� ������ "+donut.getArea()+"�Դϴ�.");
	}
}
