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
		Student s = new Student("ȫ�浿");

		//�̶����� a = b; �̸� a�� b�� ���� Ŭ������ ���� ��ü���� ������ ���� Ŭ������ ���������� �ƴϾ ��
		//������ �����̰� �������� �ڼ��̸� ������ ����ȯ�� �̷����
		p = s;
		//������ p�� ������ �� �ִ� �ʵ�� �޼ҵ�� Person�� �ִ� �͸� ����
		System.out.println(p.name);
		//System.out.println(p.grade);	//error
		Person p1 = new Student("�̼���"); //��ü������ �ڽ�Ŭ������ ������ ��밡��
		System.out.println(p1.name);
		
		Student s1 = (Student)p1;
		System.out.println(s1.name);
		System.out.println(s1.department);
	}
}
