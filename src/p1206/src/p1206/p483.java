package p1206;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class p483 {
	public static void main(String[] args) {
		
		FileInputStream fin = null;
		try { 
			fin = new FileInputStream("c:\\temp\\test.txt");
			int c; 
			while(true) { 
				c = fin.read(); // 파일에서 한 바이트 읽기 
				if (c == -1) break; // 파일 끝까지 읽었음 
				System.out.print((char)c); 
			} 
			fin.close(); // 파일 입력 스트림 닫기 
		} catch (FileNotFoundException e1) { 
			System.out.println("파일을 찾을 수 없습니다."); 
		} catch (IOException e) { 
			System.out.println("입출력 오류가 발생했습니다."); 		
		}
	}
}
