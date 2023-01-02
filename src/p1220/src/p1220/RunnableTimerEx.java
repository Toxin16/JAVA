package p1220;

import java.awt.*;
import javax.swing.*;

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		//임의의 클래스로 객체생성
		//타이버 스레드로 사용할 Runnable 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
		TimerRunnable runnable = new TimerRunnable(timerLabel);	//스레드 코드로 작동할 run()이 구현된 Runnable 객체를 만든다.
		Thread th = new Thread(runnable);	//스레드 객체 생성
		
		c.add(timerLabel);	//레이블을 컨텐츠팬에 부착
		setSize(250, 250);
		setVisible(true);
		th.start();	//타이머 스레드가 실행을 시작하게 한다. (스레드를 동작시킨다. 이 호출의 결과 TimerRunnabel의 run() 메소드가 실행을 시작한다.
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}
