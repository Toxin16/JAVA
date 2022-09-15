package p0915;

public class DoWhileSample {
	public static void main(String[] args) {
		// 'a'의 ASCII code 값은 0x61 = 97
		char ch01 = 'a';
		char ch02 = 'A';
		
		do {
			System.out.print(ch01);
			// ch는 char type, 1은 int type
			// ch + 1은 int type이므로 char type로 casting
			ch01 = (char)(ch01+1);
		} while (ch01<='z');
		
		System.out.println();
		do {
			System.out.print(ch02);
			// ch는 char type, 1은 int type
			// ch + 1은 int type이므로 char type로 casting
			ch02 = (char)(ch02+1);
		} while (ch02<='Z');
	}
}
