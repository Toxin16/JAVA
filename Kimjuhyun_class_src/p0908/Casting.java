package p0908;

public class Casting {
	public static void main(String[] args) {
		byte b = (byte)1;		// -128 ~ 127
		short sh = (short)2;	// -32768 ~ 32767
		int i = 3;				// -2147483648 ~ 2147483647
		long l = 4l;			// -9223372036854775808 ~ 922...807 
		
		System.out.printf("%d %d %d %d\n", b, sh, i, l);
		
		int n = 123;
		b = (byte)n;	//casting : data type을 다른 data type으로 만드는 것 
	}
}
