package array;

import java.util.jar.Attributes.Name;

public class foreachEx {
	enum Week {��, ȭ, ��, ��, ��, ��, ��}
	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		String[] names = {"���", "��", "�ٳ���", "����", "ü��", "����"};
		int sum = 0;
		
		for(int k : n) {
			System.out.println(k + "  ");
			sum += k;
		}
		System.out.println("���� " + sum + "�Դϴ�.");
		
		for (String s : names) {
			System.out.println(s + " ");
		}
		System.out.println();
		
		for (Week day : Week.values()) {
			System.out.println(day + "���� ");
		}
		System.out.println();
	}
}
