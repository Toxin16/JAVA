package p0926;

public class MyClass {
	double x;
	
	public double getX() {
		return this.x;
	}

	public void setX(int x) {	//return값이 없으므로 double가 아님.
		this.x = x;
	}

	public MyClass() {	//14~20 생성자오버로딩=메소드오버로딩
//		this(100.0);	//매개변수 1개 생성자(18번줄) 호출, 매개변수는 100.0
		System.out.println("매개변수 없는 생성자");
	}
	public MyClass(double x) {
		this();	//매개변수 없는 생성자(14번줄) 호출, 반드시 클래스 내 맨 윗줄에
		this.x = x;
		System.out.println("매개변수 1개 생성자");
	}
}
