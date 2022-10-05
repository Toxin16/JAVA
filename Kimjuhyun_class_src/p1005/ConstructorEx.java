package p1005;

class A {
	int a;
	public A() {
		super();	//object 호출(없으면 자동으로)
		System.out.println("생성자A");
	}
	public A(int a) {
		super();
		this.a = a;
		System.out.println("인자가 하나인 생성자A");
	}
}
class B extends A {
	int b;
	public B() {
		super();
		System.out.println("생성자B");
	}
	public B(int b) {
		super(b);
		this.b = b;
		System.out.println("인자가 하나인 생성자B");
	}
}
class C extends B {
	int c;
	public C() {
		super();
		System.out.println("생성자C");
	}
	public C(int c) {
		this.c = c;
		System.out.println("인자가 하나인 생성자C");
	}
}
public class ConstructorEx {
	public static void main(String[] args) {
		C c = new C();
		C c1 = new C();
		System.out.println(c.toString());	//toString는 Object에서 상속받기 때문에 모든 객체에서 사용가능 
		System.out.println(c1.toString());
	}
}
