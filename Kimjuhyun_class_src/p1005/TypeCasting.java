package p1005;

class Person {
	String name, id;
	public Person() {
	}
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person {
	String department, gradeString;
	public Student() {
	}
	public Student(String name) {
		super(name);
	}
}
public class TypeCasting {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");

		//이때까지 a = b; 이면 a와 b가 같은 클래스로 만든 객체여야 했지만 같은 클래스의 참조변수가 아니어도 됨
		//왼쪽이 조상이고 오른쪽이 자손이면 묵시적 형변환이 이루어짐
		p = s;
		//하지만 p가 접근할 수 있는 필드와 메소드는 Person에 있는 것만 가능
		System.out.println(p.name);
		//System.out.println(p.grade);	//error
		Person p1 = new Student("이순신"); //객체생성시 자식클래스의 생성자 사용가능
		System.out.println(p1.name);
		
		Student s1 = (Student)p1;
		System.out.println(s1.name);
		System.out.println(s1.department);
	}
}
