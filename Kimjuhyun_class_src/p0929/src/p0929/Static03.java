package p0929;

public class Static03 {
	int radius;
	public Static03() {	
	}
	public Static03(int radius) {
		this.radius = radius;
	}
	double getArea() {
		return Math.PI * radius * radius;	//Math�� ����Ʈ�� ���ǵ� Ŭ����
	}
	
	public static void main(String[] args) {
		Static03 st03 = new Static03(10);
		System.out.println(st03.getArea());
		//Java document ����Ʈ���� Math Ŭ���� ����
		System.out.println(Math.abs(-5));
	}
}
