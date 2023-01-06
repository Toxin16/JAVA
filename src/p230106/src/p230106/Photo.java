package p230106;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Photo extends JFrame{
	//입력과 출력 배열을 원본사진과 동일한 512*512로 설정. 각 이미지 픽셀은 0~255의 값을 가지므로 데이터 형식을 int로 지정(short도 가능)
	static int[][] inImage = new int[512][512];
	static int[][] outImage = new int[512][512];
	
	Container contentPane;	//윈도우 창을 출력할 컨테이너 변수를 준비한다.
	
	//메인 함수로 이미지 파일을 메모리로 불러오고 Photo()생성자를 실행한다.
	public static void main(String[] args) throws Exception {
		loadImage();
		new Photo();
	}
	
	static public void loadImage() throws Exception {
		int i, k;
		
		File inFp;	//파일 핸들
		FileInputStream inFs;	//파일 스트림 핸들
		inFp = new File("C:\\temp\\prince.raw");	//이미지 파일을 메모리로 불러온다. 파일 경로를 고정한다.
		
		//읽어올 파일 스트림
		inFs = new FileInputStream(inFp.getPath());
		
		//파일->메모리
		for(i=0; i<512; i++) {	//이미지 크기인 512*512번을 반복하여 inImage 메모리로 파일 내용을 불러온다. 
			for(k=0; k<512; k++) {
				inImage[i][k] = inFs.read();
				outImage[i][k] = inImage[i][k];
			}
		}
		inFs.close();
	}
	
	//생성자-메뉴 추가, 패널 부착
	Photo() {
		setTitle("사진 처리 프로그램");	//윈도 창의 타이틀 표시
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 추가
		
		contentPane = getContentPane();
		
		//메뉴 추가
		addMenu();
		
		//패널 추가
		DrawImage panel = new DrawImage();	//DrawImage타입의 panel인스턴스 생성
		contentPane.add(panel, BorderLayout.CENTER);	//윈도 창에 패널 부착
		
		//윈도 창의 위아래 틀의 폭, 메뉴나 제목의 크기까지 고려해서 크기조절
		setSize(8 + 515 + 8, 25 + 31 + 512 + 8);
		setVisible(true);	//화면에 나타나게 함
		
		displayImage();	//윈도 창을 새로고침하여 다시 화면에 출력하는 효과
	}
	
	//패널->입,출력 이미지 출력. 63~66Line:outImage의 내용을 화면에 출력
	class DrawImage extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int R, G, B;
			int i, k;
			for(i=0; i<512; i++) {	//68~74행에서 outImage의 픽셀 하나하나를 화면에 반복해서 출력.
				for(k=0; k<512; k++) {
					R = G = B = (int) outImage[i][k];	//R, G, B를 모두 같은 값으로 하면 그레이 색상이 됨.
					g.setColor(new Color(R, G, B));	//화면에 출력할 색상을 설정
					g.drawRect(k, i, 1, 1);	//화면에 픽셀을 출력하는 기능
				}
			}
		}
	}
	
	void displayImage() {	//outImage의 내용이 변경될 때마다 이 메소드를 호출하여 변경내용 출력.
		Graphics g = contentPane.getGraphics();
		contentPane.paintAll(g);
	}
	
	//메뉴를 추가하고, 각 메뉴를 선택했을 때 실행할 리스너를 생성
	public void addMenu() {	//사진을 처리할 메뉴 및 메뉴선택시 발생하는 이벤트 처리할 리스너를 만듦.
		JMenuBar menuBar = new JMenuBar();	//86~89: '사진처리'라는 상위 메뉴를 만듦
		setJMenuBar(menuBar);
		JMenu photoMenu = new JMenu("사진 처리");
		menuBar.add(photoMenu);
		
		JMenuItem equalAction = new JMenuItem("동일한 사진");	//91~96: 6개의 메뉴를 준비
		JMenuItem negativeAction = new JMenuItem("반전된 사진");
		JMenuItem mirror1Action = new JMenuItem("좌우 대칭 사진");
		JMenuItem mirror2Action = new JMenuItem("상하 대칭 사진");
		JMenuItem saveAction = new JMenuItem("저장");
		JMenuItem exitAction = new JMenuItem("Exit");
		
		photoMenu.add(equalAction);	//98~104 : 6개의 메뉴를 상위 메뉴인 '사진 처리' 메뉴에 부착
		photoMenu.add(negativeAction);
		photoMenu.add(mirror1Action);
		photoMenu.add(mirror2Action);
		photoMenu.addSeparator();
		photoMenu.add(saveAction);
		photoMenu.add(exitAction);

		//동일 이미지 처리
		equalAction.addActionListener(new ActionListener() {	//메뉴 선택시 처리할 이벤트 리스너
			@Override
			public void actionPerformed(ActionEvent e) {	//실제 사진을 처리할 메소드
				int i, k;
				for(i=0; i<512; i++) {	//512*512번 반복하여 모든 픽셀을 하나씩 처리.
					for(k=0; k<512; k++)
						outImage[i][k] = inImage[i][k];	//outImage에 inImage의 동일한 값을 대입
				}
				displayImage();	//변경된 outImage를 다시 화면에 출력
			}
		});
		
		//반전 영상 처리
		negativeAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i, k;
				for(i=0; i<512; i++) {
					for(k=0; k<512; k++)
						outImage[i][k] = 255 - inImage[i][k];	//이미지를 반전시키기 위해 픽셀 값을 '255-원본 색상 값'으로 처리 
				}
				displayImage();
			}
		});
		
		//좌우 대칭 처리
		mirror1Action.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i, k;
				for(i=0; i<512; i++) {
					for(k=0; k<512; k++)
						outImage[i][k] = inImage[i][511-k];	//행은 원래의 행과 동일하고 열만 '전체크기-1-현재열'로 계산(index는 0부터 시작)
				}
				displayImage();
			}
		});
		
		//상하 대칭 처리
		mirror2Action.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i, k;
				for(i=0; i<512; i++) {	
					for(k=0; k<512; k++)
						outImage[i][k] = 255 - inImage[511-i][k];	//행은 '전체크기-1-현재행;으로 계산하고 열은 그대로
				}
				displayImage();
			}
		});
		
		//파일 저장
		saveAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i, k;
				String newFname = "C:\\temp\\result.raw";	//파일 경로 고정
				File outFp;	//파일 핸들
				FileOutputStream outFs;	//파일 스트림 핸들
				
				outFp = new File(newFname);
				
				//저장할 파일 스트림
				try {
					outFs = new FileOutputStream(outFp.getPath());
					
					//메모리->파일
					for(i=0; i<512; i++) {	//173~177 : 메모리의 내용을 512*512번 파일에 쓴다. 결국 메모리의 내용이 모두 파일로 저장된다.
						for(k=0; k<512; k++) {
							outFs.write(outImage[i][k]);
						}
					}
					outFs.close();	//파일을 닫음
					JOptionPane.showMessageDialog(null, "파일 저장 성공", "파일 저장", JOptionPane.INFORMATION_MESSAGE);	//파일 저장 메시지 출력
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		exitAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	
}
