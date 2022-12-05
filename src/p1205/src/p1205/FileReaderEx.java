package p1205;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			//문자 입력스트림 생성, "C:/windows/system.ini"도 가능
			fin = new FileReader("C:\\test.txt");
			int c;
			try {
				while( (c=fin.read()) != -1) {	//한 문자씩 파일 끝까지 읽기
					System.out.print((char)c);
				}
				fin.close();
			} catch(IOException e) {
				System.out.println("입출력 오류");
			  }
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		  }
	}
}
