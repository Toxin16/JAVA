package p0908;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b + i); //byte + int ����� int
		System.out.println(10/4);	//������ ���� ������ ����� ����
		//CPU�� ������ ���� operand 2���� �����Դµ� �� �� �����̸�
		//����� ���� ����(register)�� ���������� �غ���
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		System.out.printf("b = %d %x\n", b, b);	// %x: 16���� ���
		System.out.printf("i = %d %x\n", i, i);
		System.out.println((byte)(b+i));
		//b+i��� �߿� ���� 1����Ʈ�� ����
		//1����Ʈ �߿� ���� ���ʿ� �ִ� ��Ʈ�� 1�̸� ����
		//2�� ������ ���ϸ� ����� ���� �� ����
		System.out.println((int)2.9 + 1.9);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)(2.9) + (int)(1.8));
	}
}
