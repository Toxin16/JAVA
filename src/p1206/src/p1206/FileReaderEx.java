package p1206;

import java.io.*;
import java.util.Scanner;

public class FileReaderEx {
	public static void main(String[] args) {
		
		FileReader fin = null;
		int c;
		try {
			//문자 입력스트림 생성, "C:/windows/system.ini"도 가능
			fin = new FileReader("c:\\Temp\\test.txt");

			//BufferedOutputStream는 바이트 단위로 출력하므로 ANSI코드의 영문만 출력할 수 있다.
			//한글까지 출력하려면 수정 필요
//			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out),5);
				while( (c=fin.read()) != -1) {	//파일 데이터를 모두 스크린에 출력
					out.write(c);
				}
				//파일 데이터가 모두 출력된 상태
//				new Scanner(System.in).nextLine();	//Enter키 입력
//				out.flush();	//버퍼에 남아있던 문자 모두 출력
				fin.close();
				out.close();
			} catch(IOException e) {
				System.out.println("입출력 오류");
			  }
	}
}

//Buffer의 자료를 프로그램으로 보냄