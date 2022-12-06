package p1206;

import java.io.*;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("c:\\temp\\test.png");	//읽어 올 파일
		File dest = new File("c:\\temp\\test1.png");	//저장 할 파일
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);	//파일 입력 바이트 스트림
			FileOutputStream fo = new FileOutputStream(dest);	//파일 출력 바이트 스트림
			byte [] buf = new byte[1024*10];	//10KB 버퍼

			//한번에 10KB씩 블록 단위로 고속복사
			while(true) {
				int n = fi.read(buf);	//버퍼 크기만큼 읽기. n은 실제 읽은 바이트
				fo.write(buf, 0, n);	//buf[0]부터 n바이트 쓰기
				if(n < buf.length)
					break;	//버퍼 크기보다 작게 읽었기 때문에 파일 끝에 도달. 복사 종료
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + 
					"로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}