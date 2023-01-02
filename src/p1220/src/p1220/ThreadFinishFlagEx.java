package p1220;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class ThreadFinishFlagEx extends JFrame {
	private RandomThread th;	//스레드 레퍼런스
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEX");
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {	//마우스 리스너 등록
		@Override
		public void mousePressed(MouseEvent e) {
			th.finish();	//RandomThread 스레드 종료 명령(컨텐트 팬에 마우스를 클릭하면 스레드를 종료시킨다.)
		}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);	//스레드 생성, 스레드에 컨텐트팬 전달
		th.start();	//스레드 시작
	}
	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}

}
