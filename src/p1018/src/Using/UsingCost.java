package Using;

import Book.Cost;

public class UsingCost {
	public static void main(String[] args) {
		Cost c = new Cost(); 
		System.out.println(c.sum(1, 2));	//서로 다른 패키지에 접근 가능
	}
}
