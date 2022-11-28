package p1128;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListEx {
	public static void main(String[] args) {
		//문자열만 삽입 가능한 ArrayList 생성
//		ArrayList<String> a = new ArrayList<>();
		Vector<String> a = new Vector<>();
		//키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름?");
			String s = sc.next();	//키보드로부터 이름 입력
			a.add(s);	//ArrayList 컬렉션에 삽입
		}
		
		//Iterator를 이용한 모든 이름 출력하기
		Iterator<String> it = a.iterator();	//Iterator 객체얻기
		while(it.hasNext()) {	//while문은 벡터v의 모든 정수 츨력
			String name = it.next();
			System.out.println(name + " ");
		}
		//ArrayList에 들어있는 모든이름 출력
//		for(int i=0; i<a.size(); i++) {
//			String name = a.get(i);	//ArrayList의 i번째 문자열 얻어오기
//			System.out.print(name + " ");
//		}
		
		//가장 긴 이름 출력
		int longestIndex = 0;	//현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
		for(int i=0; i<a.size(); i++) {
			if(a.get(longestIndex).length()<a.get(i).length())	//이름 길이 비교
				longestIndex = i;	//i번째 이름이 더 긴 이름임
		}
		System.out.println("\n 가장 긴 이름은 : " + a.get(longestIndex));
		sc.close();
	}
}
