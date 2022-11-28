package p1128;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {
	public static void main(String[] args) {
		//해시맵 생성
		HashMap<String, String> dic = new HashMap<String, String>();
			//var dic = new HashMap<String, String>();로도 작성가능
		
		//3개의 (key, value)쌍을 dic에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
//		//사용자로부터 영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("찾고 싶은 단어는?");
//			String eng = sc.next();
//			if(eng.equals("exit")) {	//"exit"가 입력되면 프로그램 종료
//				System.out.println("종료합니다...");
//				break;
//			}
//			//해시맵에서 '키' eng의 값 kor 검색
//			String kor = dic.get(eng);	//eng가 해시맵에 없으면 null 리턴
//			if(kor == null)
//				System.out.println(eng + "는 없는 단어입니다.");
//			else
//				System.out.println(kor);
//		}
//		sc.close();
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			String score = dic.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
