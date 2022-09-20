package p0920;

public class P162 {
	public static void main(String[] args) {
		char[] alpha = {'a', 'b', 'c', 'd'};	//배열 선언
		
		for(int i=0; i<alpha.length; i++)	//for문으로 배열의 원소 출력
			System.out.println(i);
		
		for(char c : alpha)		//for-each문으로 배열의 원소 출력
			System.out.println(c);
	}
}
