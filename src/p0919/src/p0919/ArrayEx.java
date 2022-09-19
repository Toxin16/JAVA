package p0919;

public class ArrayEx {
	public static void main(String[] args) {
		int[] intArr = new int[5];
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = (i+1)*10;
		System.out.println(intArr[i]);
		}
			
		char[] chArr = new char[5];
		chArr[0] = 'a';
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = (char)(97 + i);	//97=='a'(ASCII)
			System.out.println(chArr[i]);
		}
		
	}
}