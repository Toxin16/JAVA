package p0915;

public class DoWhileSample {
	public static void main(String[] args) {
		// 'a'�� ASCII code ���� 0x61 = 97
		char ch01 = 'a';
		char ch02 = 'A';
		
		do {
			System.out.print(ch01);
			// ch�� char type, 1�� int type
			// ch + 1�� int type�̹Ƿ� char type�� casting
			ch01 = (char)(ch01+1);
		} while (ch01<='z');
		
		System.out.println();
		do {
			System.out.print(ch02);
			// ch�� char type, 1�� int type
			// ch + 1�� int type�̹Ƿ� char type�� casting
			ch02 = (char)(ch02+1);
		} while (ch02<='Z');
	}
}
