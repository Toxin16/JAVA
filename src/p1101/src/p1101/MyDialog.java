package p1101;

import java.awt.*;
import javax.swing.*;

class MyDialog extends JDialog{	//main이 되는 class만 public로 지정
	private JTextField tf = new JTextField(10);	//다이얼로그에 삽입할 텍스트 필드
	private JButton okButton = new JButton("OK");
	public MyDialog(JFrame frame, String title) {	//생성자
		super(frame, title, true);	//세번째 값 true:모달, false:모달리스
		setLayout(new FlowLayout());	//디폴트가 BorderLayout이므로 FlowLayout로 지정함
		add(tf);
		add(okButton);
		setSize(200,100);
	}
}
