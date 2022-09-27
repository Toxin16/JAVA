package p0927;

public class Human {	//p.204 #1
	String name;
	private int age;
	double height, weight;
	
	public Human(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}