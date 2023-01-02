package p1220;

import java.awt.Color;

import javax.swing.JLabel;

public class FlickeringLabel extends JLabel implements Runnable {
	private long delay;
	
	public FlickeringLabel(String string, long delay) {
		super(string);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
//		th.interrupt();
	}
	
	@Override
	public void run() {
		int n = 0;	//타이머 카운트 값
		while(true) {	//무한루프
			if(n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n == 0) n = 1;
			else n = 0;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			  }
		}
	}
	
}
