package p1128;

import java.util.*;
import javax.print.event.PrintJobAttributeListener;

public class CollectionEx {
	public static void main(String[] args) {
		//빈 리스트 생성
		LinkedList<String> myList = new LinkedList<>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
			
		//요소 정렬, sort()는 static 메소드이므로 클래스 이름으로 바로 호출
		Collections.sort(myList);	
		printList(myList);	//정렬된 요소 출력
		
		Collections.reverse(myList);	//요소의 순서를 반대로 구성
		printList(myList);	//요소 출력
		
		private static void printList(LinkedList<String> myList ) {
			Iterator<String> it = myList.iterator();
			while(it.hasNext()) {
				String movie = it.next();
				System.out.println(movie + " ");
		}
		//binarySearch()를 이용하여 "아바타"의 인덱스 검색
		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소입니다.");
	}
}
