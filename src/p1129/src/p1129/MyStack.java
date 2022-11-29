package p1129;

import java.util.Iterator;

public class MyStack {
	public static void main(String[] args) {
		//String 타입의 GStack 생성
		GStack<String> stringStack = new GStack<>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n=0; n<3; n++)
			//stringStack 스택에 있는 3개의 문자열 팝
			System.out.println(stringStack.pop());
		
		
		//Integer 타입의 GStack 생성
		GStack<Integer> intStack = new GStack<>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int n=0; n<3; n++)
			//intStack스택에 있는 3개의 정수 팝
			System.out.println(intStack.pop());	
	}
}
