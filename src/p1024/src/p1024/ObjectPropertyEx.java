package p1024;

class Point {	//Object클래스를 상속받고 있음
	private int x, y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;	//22Line의 p와 다름.
		if(x == p.x && y == p.y) //4Line(this.x)와 29Line에서 넘겨받은p.x)
			return true;
		else
			return false;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		//obj의(=객체 p))의 클래스의 이름 출력 = Point가 출력됨
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println();
	}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
//		print(p);
		Point p1 = new Point(2, 3);
//		print(p1);
		if(p==p1)	//객체를 비교(객체가 같은지)
			System.out.println("p와 p1은 같다.");	
		else
			System.out.println("p와 p1은 같지않다.");
		if(p.equals(p1))	//두 레퍼런스가 가리키는 객체의 내용 비교(
			System.out.println("p와 p1은 같다.");
		else
			System.out.println("p와 p1은 같지않다.");
	}
}

//객체==객체, 객체의값.equals(객체의 값)