package p1219;

import javax.swing.JLabel;

public class TimerThread extends Thread {
	private JLabel timerLabel;	//타이머 값이 출력되는 레이블
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;	//타이머 카운트를 출력할 레이블
	}
	//스레드 코드, run()이 종료하면 스레드 종료
	@Override
	public void run() {	//run()은 스레드 코드로서 start()메소드가 호출된 후 스레드가 실행을 시작하는 메소드이다.
		super.run();
		setPriority(1);	//스레드 우선순위
		System.out.println("현재 스레드 이름 : " + currentThread().getName());
		System.out.println("현재 스레드 상태 : " + currentThread().getState());
		System.out.println("현재 스레드 우선순위 : " + currentThread().getPriority());
		int n = 0;	//타이머 카운트 값
		while(true) {	//무한루프
			timerLabel.setText(Integer.toString(n));	//레이블에 카운트 값 출력
			n++;	//카운트 증가
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}
