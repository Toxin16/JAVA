package p0908;

public class SpLiteral {

	public static void main(String[] args) {
		int i = 6;
		double d = 6.0;
		System.out.print("화면에 출력하는 메소드는 print");
		System.out.println(", 줄 바꿔서 화면에 출력하는 메소드는 println");
		System.out.printf("형식에 맞춰 출력 %d %f\n", 1, 1.0);
		System.out.printf("\t지정된 횟수만큼 빈칸을 띄웁니다.\n");
		System.out.printf("\t //뒤에 오는 문자는 특별한 의미를 지님\n");
		System.out.printf("\t \" \n");
		System.out.println("i = " + i + ", d = " + d);
		System.out.printf("i = %d, d = %f\n", i, d);
		System.out.printf("%d %d %d %f %f\n", 1, 2, 3, 1.0, 2.0);
	}

}
