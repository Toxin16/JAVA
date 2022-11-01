package p_770;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionPaneEx extends JFrame {	//JFrame를 상속받는 OptionPaneEx클래스 선언
	public OptionPaneEx() {		//생성자
		
		Container c = getContentPane();	//유리판
		setSize(250,200);	//창의 크기
		c.add(new MyPanel(), BorderLayout.NORTH);	//MyPanel 패널을 BorderLayout로 북쪽에 배치
		setVisible(true);	//창 보이기 여부
	}
	class MyPanel extends Panel {	//Panel을 상속받는 MyPanel클래스 선언
		private JButton inputBtn = new JButton("Input Name");
		private JTextField tf = new JTextField(10);
		private JButton confirmBtn = new JButton("Confirm");
		private JButton MessageBtn = new JButton("Message");
		
		public MyPanel() {	//생성자(패널에 사용)
			setBackground(Color.LIGHT_GRAY);	//패널의 배경색
			add(inputBtn);	//위에서 만든 것들을 생성자에 추가
			add(tf);
			add(confirmBtn);
			add(MessageBtn);
			inputBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//입력 다이얼로그 생성
					String name = JOptionPane.showInputDialog("이름을 입력하세요");
					if(name != null)	//이름이 null이 아니라면(입력받았다면)
						tf.setText(name);	//사용자가 입력한 문자열을 텍스트필드창에 출력
				}
			});
			
			confirmBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//확인 다이얼로그 생성
					int result = JOptionPane.showConfirmDialog(null,
						"계속 할 것입니까?", "Confirm", JOptionPane.YES_NO_OPTION);
					
					//사용자가 선택한 버튼에 따라 문자열을 텍스트필드 창에 출력
					if(result == JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("YES");
					else 
						tf.setText("NO");
				}
			});
			
			MessageBtn.addActionListener(new ActionListener() {	
				@Override
				public void actionPerformed(ActionEvent e) {
					//메시지 다이얼로그 생성
					JOptionPane.showMessageDialog(null, "조심하세요",
						"Message", JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}
	
	
	public static void main(String[] args) {
		new OptionPaneEx();	//생성자 호출, OptionPaneEx op = new OptionPaneEx();와 같음
		
	}
}
