package p0907;

public class Literal {

	public static void main(String[] args) {
		char a0 ='A';
		char a1 = '\u0041';
		char han0 = '��';
		char han1 = '\uae00';
		int i = 1;
		long l = 1l;
		float f = 3.14f;
		double pi0 = 3.14159;
		pi0 = 3.1415;
		final double PI1 =3.14159;
		//final�� ������ ��ȣ ����� ���� �� ����.
		//������ �ǹ̸� �� Ȯ���ϰ� ��ȣ�� �����ϱ� ���� ���
		//�� �������� ���̱� ���ؼ��� ���, �Ϲ������� �빮�ڷ� ����
		//pi1 = 3.1415; 
		System.out.println("char�� �� ���ڸ��� ����");
		System.out.println("�ڹٿ��� ���ڴ� 2����Ʈ �����ڵ�");
		System.out.println("a0 = " + a0 + " a1 = " + a1);
		System.out.println("han0 = " + han0 + " han1 = " + han1);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("���� literal�� int��");
		System.out.println("�Ǽ� literal�� double��");
		System.out.println("float �������� ���� �ڿ� f�� ����");
		System.out.println("float�������� ���� �ڿ� f�� ����");
		System.out.println("f = " + f + "pi0 = " + pi0);
		System.out.println("PI1 = " + PI1);
	}

}
