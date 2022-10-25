package p1025;

import java.awt.*;
import javax.swing.*;

public class P533_Ex7 extends JFrame {
	public P533_Ex7() {	//생성자
		Container c = getContentPane();	//투명한 유리판
		JPanel p1 = new JPanel();	//패널(컨테이너의 구역을 패널로 나눔)생성
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.setBackground(Color.cyan);	//p1의 색상
		p3.setBackground(Color.yellow);
		
		p1.add(new JLabel("수식 입력"));	//패널1에 라벨추가
		p1.add(new JTextField(20));	//TextFile의 colum값을 20으로 지정해서 추가
		p2.setLayout(new GridLayout(4,4));	//패널2의 배치관리자를 GridLayout로 설정)
		p2.add(new JButton("0"));	//패널2에 버튼생성
		p2.add(new JButton("1"));
		p2.add(new JButton("2"));
		p2.add(new JButton("3"));
		p2.add(new JButton("4"));
		p2.add(new JButton("5"));
		p2.add(new JButton("6"));
		p2.add(new JButton("7"));
		p2.add(new JButton("8"));
		p2.add(new JButton("9"));
		p2.add(new JButton("CE"));
		p2.add(new JButton("계산"));
		p2.add(new JButton("+"));
		p2.add(new JButton("-"));
		p2.add(new JButton("X"));
		p2.add(new JButton("/"));
		p3.add(new JLabel("계산 결과"));
		p3.add(new JTextField(20));	
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.CENTER);
		c.add(p3,BorderLayout.SOUTH);
		
		setSize(400, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new P533_Ex7();
	}
}

//JFrame의 default 배치관리자는 BorderLayout
//JPanel의 default 배치관리자는 