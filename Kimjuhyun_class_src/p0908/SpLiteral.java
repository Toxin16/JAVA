package p0908;

public class SpLiteral {

	public static void main(String[] args) {
		int i = 6;
		double d = 6.0;
		System.out.print("ȭ�鿡 ����ϴ� �޼ҵ�� print");
		System.out.println(", �� �ٲ㼭 ȭ�鿡 ����ϴ� �޼ҵ�� println");
		System.out.printf("���Ŀ� ���� ��� %d %f\n", 1, 1.0);
		System.out.printf("\t������ Ƚ����ŭ ��ĭ�� ���ϴ�.\n");
		System.out.printf("\t //�ڿ� ���� ���ڴ� Ư���� �ǹ̸� ����\n");
		System.out.printf("\t \" \n");
		System.out.println("i = " + i + ", d = " + d);
		System.out.printf("i = %d, d = %f\n", i, d);
		System.out.printf("%d %d %d %f %f\n", 1, 2, 3, 1.0, 2.0);
	}

}
