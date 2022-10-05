package p1005;

class A {
	int a;
	public A() {
		super();	//object ȣ��(������ �ڵ�����)
		System.out.println("������A");
	}
	public A(int a) {
		super();
		this.a = a;
		System.out.println("���ڰ� �ϳ��� ������A");
	}
}
class B extends A {
	int b;
	public B() {
		super();
		System.out.println("������B");
	}
	public B(int b) {
		super(b);
		this.b = b;
		System.out.println("���ڰ� �ϳ��� ������B");
	}
}
class C extends B {
	int c;
	public C() {
		super();
		System.out.println("������C");
	}
	public C(int c) {
		this.c = c;
		System.out.println("���ڰ� �ϳ��� ������C");
	}
}
public class ConstructorEx {
	public static void main(String[] args) {
		C c = new C();
		C c1 = new C();
		System.out.println(c.toString());	//toString�� Object���� ��ӹޱ� ������ ��� ��ü���� ��밡�� 
		System.out.println(c1.toString());
	}
}
