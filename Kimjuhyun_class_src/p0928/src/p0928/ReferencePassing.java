package p0928;
class Circle {	//CircleŬ����
	int radius;	//�ʵ�
	public Circle(int radius) {	//������
		this.radius = radius;	//���ڷ� �޾ƿ� radius���� �ʵ�radius�� ����
	}
	public double getArea() {	//���� ���ϴ� �Լ�
		return 3.14 * radius * radius;
	}
}

public class ReferencePassing {
	public static void main(String[] args) {	//main�Լ�
		Circle pizza = new Circle(5); 	//CircleŬ������ pizza��ü����, �����ڴ� Circle, raidus���ڴ� 5
		
		increase(pizza);
		
		System.out.println(pizza.radius);
	}
	
	static void increase(Circle m) {	//CircleŸ���� �Ű����� m
		m.radius++;
	}
}
