package p0921;

public class CircleConst {
	int radius;
	String name;
	double pi = 3.14;
	
	public CircleConst() {	//������
		radius = 1;
		name = "����";
	}
	public CircleConst(int radius) {
		this.radius = radius;
	}
//	public CircleConst(int r, String n) {
//		radius = r;
//		name = n;
//	}
	public CircleConst(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	public double getArea() {	//�Լ�
		return pi*radius*radius;
	}
	public static void main(String[] args) {
		CircleConst pizza1 = new CircleConst();	//8�� ����
		CircleConst pizza2 = new CircleConst(5);	//12�� ����
		//radius = 10, name=�ڹ�����
		//��ü ������ �ʵ� ���� �ʱ�ȭ
		CircleConst pizza3 = new CircleConst(10, "�ڹ�����");
		System.out.println(pizza1.radius);
		System.out.println(pizza2.radius);
		System.out.println(pizza3.radius);
	}
}
