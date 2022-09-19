package p0919;

public class For {
	public static void main(String[] args) {
		//1부터 100까지 3의 배수의 합 출력
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0)
				sum += i;
		}
		System.out.println("1부터 100까지 3의 배수의 합은 " + sum + "입니다.");
	}
}
