package p0927;

import p0927.Circle;

public class CircleArray {
	public static void main(String[] args) {
		
		Circle[] c = new Circle[10];	//객체배열
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(0);
			System.out.println(c[i].getArea()+'\t');
		}
		
	}
}