package p1101;

import javax.swing.*;

public class MyHelp extends JDialog{
	JLabel lbl = new JLabel("작성일 : 2022년 11월 1일");
	public MyHelp(JFrame frame, String title) {	//생성자
		super(frame, title, true);	//모달
		add(lbl);
		setVisible(true);
	}
}
