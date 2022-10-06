package p1006;
class Shape {	
	public String data;
	public Shape next;
	public Shape() {
		next = null;
	}
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rectangle");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line l = new Line();
		l.draw();
		paint(new Rect());
		paint(new Circle());
	}
}
