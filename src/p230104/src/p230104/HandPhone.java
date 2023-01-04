package p230104;

import java.io.*;
import java.util.Scanner;

public class HandPhone {
	static String fname = "C:\\temp\\juso.txt";	//static 파일명을 변수에 고정
	
	static class address {
		String name;
		String age;	//기록목적. 숫자로 다루는 과정이 없음
		String phone;
		String major;
		String birth;
	
		public address(String name, String age, String phone, String major, String birth) {
			this.name = name;
			this.age = age;
			this.phone = phone;
			this.major = major;
			this.birth = birth;
		}
	}
	
	public static void main(String[] args) throws IOException {	//메뉴 출력
		Scanner sc = new Scanner(System.in);
		String select = "";
		System.out.printf(" \n 친구 연락처 관리 \n");
		
		while (select != "4") {
			print_menu();
			select = sc.next();
			
			switch (select) {
			case "1":
				view_juso(); 
				break;
			case "2":
				add_juso();
				break;
			case "3":
				delete_juso();
				break;
			case "4":
				return;
			default:
				System.out.printf(" \n 잘못 입력하셨습니다. 다시 선택해주세요.\n");
			}
			
		}
	}
	static void print_menu() {	//메뉴 출력
		System.out.printf("\n");
		System.out.printf("1. 연락처 출력\n");
		System.out.printf("2. 연락처 등록\n");
		System.out.printf("3. 연락처 삭제\n");
		System.out.printf("4. 끝내기\n");
	}
	
	//연락처 파일에서 기존 입력된 내용을 읽어서 출력
	static void view_juso() throws IOException {
		String str = "";
		//처음에 fname 파일이 없으면 빈 파일 생성
		File f = new File(fname);
		if(!f.exists()) {	//존재하지 않을 경우
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		int i;
		
		//기존의 연락처를 모두 읽어서 출력
		for(i = 1; ; i++) {	//조건식 없음. 무한반복
			if(!br.ready())	//파일을 읽을 수 없으면
				break;
			else {
				str = br.readLine();
				System.out.printf("%2d: %s\n", i, str);
			}
		}
		//i가 1이면 실제 파일에는 내용이 없음
		if(i == 1)
			System.out.printf("\n 연락처 파일에 전화번호가 하나도 없습니다. \n");
		br.close();
	}
	
	static void add_juso() throws IOException {	//친구 연락처 추가
		Scanner sc = new Scanner(System.in);
		address adr = new address("", "", "", "", "");
		
		String wstr = "";
		
		//파일을 추가 모드로 열기
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));
		
		System.out.printf("이름을 입력 ==> ");
		adr.name = sc.nextLine();
		System.out.printf("나이를 입력 ==> ");
		adr.age = sc.nextLine();
		System.out.printf("전화번호 입력 ==> ");
		adr.phone = sc.nextLine();
		System.out.printf("전공 입력 ==> ");
		adr.major = sc.nextLine();
		System.out.printf("생일 입력 ==> ");
		adr.birth = sc.nextLine();
		
		//입력된 3개의 값을 하나의 문자열로 만듦
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone + "\t" + adr.major + "\t" + adr.birth;
		
		bw.write(wstr);	//파일에 문자열 쓰기
		bw.newLine();
		
		bw.close();
	}
	
	//연락처 파일에서 선택한 연락처를 제거. 
	//기존 연락처를 juso.txt파일에서 문자열 배열에 읽어오되 삭제를 지정한 행은 빼놓고 읽어와서 배열을 juso.txt에 뒤집어씀
	static void delete_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		//연락처 파일의 내용 전체를 저장하기 위한 문자열 배열
		String[] read_str = new String[50];	//최대 연락처 개수를 50개로 가정
		String str = "";
		int del_line, i, count = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		//연락처 파일이 없으면 돌아간다.
		if(!br.ready()) {
			System.out.printf("\n 연락처 파일이 없습니다. \n");
			return;
		}
		
		System.out.printf("\n 삭제할 행 번호는? ");
		del_line = sc.nextInt();
		
		for(i = 0; i<50; i++) {	//파일에 있는 동안에 수행, 단 최대 50개
			if((str = br.readLine()) == null)
				break;
			
			if(i+1 != del_line) {	//삭제하는 행이 아니라면 추가
				read_str[count] = str;
				count++;
			} else {
				System.out.printf("%d 행이 삭제되었습니다. \n", del_line);
			}
			br.close();
			
			//파일을 쓰기 모드로 여로 새로운 내용을 쓴다
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			
			for(i=0; i<count; i++) {
				bw.write(read_str[i]);
				bw.newLine();
			}
			bw.close();
		}
	}
}
