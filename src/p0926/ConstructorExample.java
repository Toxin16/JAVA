package p0926;

public class ConstructorExample { //p.199

	public static void main(String[] args) {
		MyClass a = new MyClass();
		System.out.println(a.getX());
		
		System.out.println(a.toString());	//객체를 설명해주는 문자열 리턴
	}

}