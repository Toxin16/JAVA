package p0929;

public class Static01 {
	int a;
	//�� Ŭ������ ���� ��� ��ü�� ����
	static int n=0;
	//��ü�� ��������� ������ Ȯ���� �� �ִ� ������
	public Static01() {
		n++;
	}
	public static void main(String[] args) {
		Static01 sc1 = new Static01();
		System.out.println(Static01.n);
		Static01 sc2 = new Static01();
		Static01 sc3 = new Static01();
		sc1.a = 1;	//sc1.a�� sc.2�� a�� �޸𸮿��� ������ġ�� �ٸ�
		sc2.a = 2;
		sc3.a = 3;
//		StaticClass.n = 1;
		//static�� �������� �ٸ� ��ü���� ��� ���� n�� ����Ŵ
		//static �ʵ�� '��ü�̸�.�ʵ�'���ٴ� 'Ŭ�����̸�.�ʵ�'�� ����ϱ⸦ ����
		System.out.println(sc1.a + " " +sc1.n);
		System.out.println(sc2.a + " " +sc2.n);
		System.out.println(sc3.a + " " +sc3.n);
	}
}