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
		System.out.println("ȭ����");
	}
}

public class Static02 {
	public static void main(String[] args) {
		Scm.prtMessage();	//��ü�� ������ �ʾƵ� static�� ���������Ƿ� �ٷ� ��밡��
		Scm scm = new Scm(6);
		System.out.println(scm.a);
	}
}
