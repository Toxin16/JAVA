package p0908;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b + i); //byte + int 결과는 int
		System.out.println(10/4);	//정수와 정수 연산은 결과가 정수
		//CPU가 연산을 위해 operand 2개를 가져왔는데 둘 다 정수이면
		//결과를 위한 공간(register)을 정수형으로 준비함
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		System.out.printf("b = %d %x\n", b, b);	// %x: 16진수 출력
		System.out.printf("i = %d %x\n", i, i);
		System.out.println((byte)(b+i));
		//b+i결과 중에 하위 1바이트를 취함
		//1바이트 중에 제일 왼쪽에 있는 비트가 1이면 음수
		//2의 보수를 취하면 양수를 얻을 수 있음
		System.out.println((int)2.9 + 1.9);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)(2.9) + (int)(1.8));
	}
}
