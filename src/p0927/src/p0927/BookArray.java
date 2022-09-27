package p0927;

import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		Book[] bk = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<bk.length; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine();
			
			System.out.print("저자>>");
			String author = sc.nextLine();
			
			bk[i] = new Book(title, author);
		}
		
		for(int i=0; i<bk.length; i++)
			System.out.print("(" + bk[i].title + "," + bk[i].author + ")");
		sc.close();
	}
}
