package p0929;

public class Static01 {
	int a;
	//이 클래스로 만든 모든 객체가 공유
	static int n=0;
	//객체가 만들어지는 개수를 확인할 수 있는 생성자
	public Static01() {
		n++;
	}
	public static void main(String[] args) {
		Static01 sc1 = new Static01();
		System.out.println(Static01.n);
		Static01 sc2 = new Static01();
		Static01 sc3 = new Static01();
		sc1.a = 1;	//sc1.a와 sc.2의 a는 메모리에서 저장위치가 다름
		sc2.a = 2;
		sc3.a = 3;
//		StaticClass.n = 1;
		//static의 영향으로 다른 객체더라도 모두 같은 n을 가리킴
		//static 필드는 '객체이름.필드'보다는 '클래스이름.필드'로 기술하기를 권장
		System.out.println(sc1.a + " " +sc1.n);
		System.out.println(sc2.a + " " +sc2.n);
		System.out.println(sc3.a + " " +sc3.n);
	}
}