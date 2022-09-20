package p0920;

public class Ex1 {
	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {	//행의 개수
			for(int j=1; j<=5; j++) {	//열의 개수
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1; i<=5; i++) {	//행의 개수
			for(int j=5; j>=i; j--) {	//열의 개수
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
