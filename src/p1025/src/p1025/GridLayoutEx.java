package p1025;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//4*2격자의 GridLayout배치관리자
		GridLayout grid = new GridLayout(4, 3, 10, 10); //행을 우선으로 
		grid.setVgap(5);	//격자 사이의 수직간격
		
		Container c = getContentPane();	//투명한 유리판
		c.setLayout(grid);
		c.add(new JLabel("이름"));
		c.add(new TextField(""));
		c.add(new JLabel("학번"));
		c.add(new TextField(""));
		c.add(new JLabel("학과"));
		c.add(new TextField(""));
		c.add(new JLabel("과목"));
		c.add(new TextField(""));
		c.add(new JButton("확인"));
		
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
