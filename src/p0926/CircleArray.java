package p0926;

public class CircleArray {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		System.out.println(c1.getArea());
		
		Circle[] c;
		c = new Circle[5];
		
		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i);
	}
}
