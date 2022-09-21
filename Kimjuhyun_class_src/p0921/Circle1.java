package p0921;

public class Circle1 {
	//특성 state 
	//member variable, field, property
	double pi = 3.14;
	int radius;
	String name;
	//행동 behavior
	//method
	public double getArea() {
		return pi*radius*radius;
	}
}