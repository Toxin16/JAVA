package p1213;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPaintEx extends JFrame {
	Container c = getContentPane();
	MyButton btn = new MyButton("버튼");
	JButton btn2 = new JButton("버튼2");
	JLabel lbl = new JLabel("버튼을 클릭하면 변경됨");
	
	public MyPaintEx() {
		setLayout(new FlowLayout());
		
		btn.addActionListener(new ActionListener() {	//익명 클래스를 이용한 이벤트 처리
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lbl.setText("자바는 재미이다");	//버튼을 누르면 바뀜
			}
		});
		
		c.add(btn);
		c.add(lbl);
		c.add(btn2);
		setSize(500, 300);
		setVisible(true);
	}
	
	class MyButton extends JButton {
		public MyButton(String s) {
			super(s);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			//this.버튼의 길이
//			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
			g.fillOval(0, 0, getWidth()-1, this.getHeight()-1);
		}
		
	}
	public static void main(String[] args) {
		new MyPaintEx();
	}
}
