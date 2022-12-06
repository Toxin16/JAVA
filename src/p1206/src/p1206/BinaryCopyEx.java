package p1206;

import java.io.*;

public class BinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("c:\\temp\\test.png");	//읽어 올 파일
		File dest = new File("c:\\temp\\test1.png");	//저장 할 파일
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			while((c=fi.read()) != -1)
				fo.write((byte)c);	//바이트 단위로 읽어와야 함
			fi.close();
			fo.close();
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
			return;
		}
		System.out.println("파일 복사 성공");
	}
}