package p0921;

public class CircleTest1 {
	public static void main(String[] args) {
		Circle1 pizza = new Circle1();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area+"�Դϴ�.");
		
		Circle1 donut = new Circle1();
		donut.radius = 5;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name+"�� ������ "+area+"�Դϴ�.");
		
		Circle1 chocoball = new Circle1();
		chocoball.radius = 1;
		chocoball.name = "�ڹ����ں�";
		area = chocoball.getArea();
		System.out.println(chocoball.name+"�� ������ "+area+"�Դϴ�.");
		
		Circle1 chicken = new Circle1();
		chicken.radius = 3;
		chicken.name = "�ڹ�ġŲ";
		area = chicken.getArea();
		System.out.println(chicken.name+"�� ������ "+area+"�Դϴ�.");
	}
}