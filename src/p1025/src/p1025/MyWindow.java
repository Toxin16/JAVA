package p1025;

import java.awt.*;
import javax.swing.*;

public class MyWindow extends JFrame{	//javax.swing의 클래스 JFrame를 상속
	public MyWindow() {	//생성자
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
//		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT,10,20));	//배치관리자, 우측정렬
		contentPane.setLayout(new GridLayout());
		
		contentPane.add(new JButton("OK"),BorderLayout.NORTH);
		contentPane.add(new JButton("Cancel"),BorderLayout.SOUTH);	//버튼이 겹쳐서 덮어쓰기
		contentPane.add(new JButton("Ignore"), BorderLayout.WEST);
		setSize(500, 500);
		setTitle("내 창");
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWindow my = new MyWindow();	//new MyWindow()로도 사용가능
	}
}
