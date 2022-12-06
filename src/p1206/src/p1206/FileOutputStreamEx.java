package p1206;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte[] b = {7, 51, 3, 4, -1, 24};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]);	//배열 b의 바이너리를 그대로 기록
			fout.close();
		} catch (IOException e) {
			System.out.println("c:\\Temp\\test.out에 저장할 수 없었습니다. 경로명을 확인해주세요");
			return;
		}
		System.out.println("c:\\Temp\\test.out을 저장하였습니다");
	}
}

//	for문을 사용한 코드라인 두 줄은 fout.write(b); 한 줄로 코딩할 수 있다.