package p1220;

import javax.swing.JLabel;

public class TimerRunnable implements Runnable {
	private JLabel timerLabel;	//타이머 값이 출력된 레이블
	public TimerRunnable(JLabel timerLabel) {	//생성자, 매개변수
		this.timerLabel = timerLabel;	//초 카운트 출력
	}
	//스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {	//run()은 스레드 코드로서 start()메소드에 의해 스레드가 실행을 시작하는 코드
		int n = 0;	//타이머 카운트 값
		while(true) {	//무한루프
			timerLabel.setText(Integer.toString(n));	//레이블에 카운트 값 출력
			n++;	//카운트 증가
			try {
				Thread.sleep(1000);	//1초동안 잠을 잠
			} catch (InterruptedException e) {
				return;	//예외가 발생하면스레드 종료
			}
		}
	}
}
