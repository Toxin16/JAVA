package p0921;

public class CircleTest1 {
	public static void main(String[] args) {
		Circle1 pizza = new Circle1();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area+"입니다.");
		
		Circle1 donut = new Circle1();
		donut.radius = 5;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area+"입니다.");
		
		Circle1 chocoball = new Circle1();
		chocoball.radius = 1;
		chocoball.name = "자바초코볼";
		area = chocoball.getArea();
		System.out.println(chocoball.name+"의 면적은 "+area+"입니다.");
		
		Circle1 chicken = new Circle1();
		chicken.radius = 3;
		chicken.name = "자바치킨";
		area = chicken.getArea();
		System.out.println(chicken.name+"의 면적은 "+area+"입니다.");
	}
}