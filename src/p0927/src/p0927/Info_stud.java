package p0927;

import java.util.Scanner;

public class Info_stud {
	public static void main(String[] args) {
		Information[] info = new Information[1];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<info.length; i++) {
			System.out.print("이름>>");
			String name = sc.nextLine();
			
			System.out.print("전공>>");
			String major = sc.nextLine();
			
			System.out.print("나이>>");
			int age = sc.nextInt(); 
			
			info[i] = new Information(name, major, age);
		}
		
		for(int i=0; i<info.length; i++)
			System.out.print("(" + info[i].name + "," + info[i].major + "," + info[i].age + ")");
		sc.close();
	}
}
