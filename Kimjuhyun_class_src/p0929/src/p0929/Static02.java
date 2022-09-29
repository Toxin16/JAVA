package p0929;
class Scm {
	int a;
	
	public Scm(int a) {
		this.a = a;
	}
	
	void prtVariable() {
		System.out.println(a);
	}
	
	static void prtMessage() {
		System.out.println("화이팅");
	}
}

public class Static02 {
	public static void main(String[] args) {
		Scm.prtMessage();	//객체를 만들지 않아도 static로 선언했으므로 바로 사용가능
		Scm scm = new Scm(6);
		System.out.println(scm.a);
	}
}
