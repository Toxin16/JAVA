package p0914;

public class Combine {
	public static void main(String[] args) {
		int a, b, c, d;
		
		//단항, 삼항, 할당 연산자는 오른쪽에서 왼쪽으로
		//제일 오른쪽에 있는 것이 먼저 실행되고 차츰 왼쪽으로
		a = b = c = d = 1;
		//나머지 연산자는 왼쪽에서 오른쪽으로
		d = a + b + c;
		
		System.out.printf("%d %d %d %d\n", a, b, c, d);
		
		//단항, 산술, 쉬프트, 관계, 비트, 논리, 삼항, 할당
	}
}

// >>> : 비트를 모두 0으로 채움, >> : 양수 음수에 따라서 0과 1로 채움
// ||, &&(논리) : 조건이 충족하면  검사를 끝냄, | :  식을 모두 검사 