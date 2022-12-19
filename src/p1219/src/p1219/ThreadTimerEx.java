package p1219;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		Container c = getContentPane();	//컴포넌트를 배치하기위한 유리판
		c.setLayout(new FlowLayout());	//
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel("10");
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		JLabel timerLabel2 = new JLabel("10");
		timerLabel2.setFont(new Font("Gothic", Font.ITALIC, 20));
		
		JButton btn = new JButton("중지");
		
		c.add(timerLabel);	//레이블을 컨텐트팬에 부착
		c.add(timerLabel2);
		c.add(btn);
		
		//타이머 스레드 객체생성. 타이머 값을 출력할 레이블을 생성자에 전달
		TimerThread th = new TimerThread(timerLabel);	//스레드 객체를 만듦
		TimerThread2 th2 = new TimerThread2(timerLabel2);	//스레드 객체를 만듦
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
			}
		});
		
		setSize(200, 200);
		setVisible(true);
		th.start();	//타이머 스레드의 실행을 시작
		th2.start();
		//스레드를 동작(TimerThread의 run()메소드가 실행을 시작)
	}
	
	public static void main(String[] args) {
		System.out.println("현재 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("현재 스레드 상태 : " + Thread.currentThread().getState());
		System.out.println("현재 스레드 우선순위 : " + Thread.currentThread().getPriority());
		new ThreadTimerEx();
	}
}
