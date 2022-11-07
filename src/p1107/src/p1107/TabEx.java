package p1107;

import java.awt.*;
import javax.swing.*;

public class TabEx extends JFrame{
	public TabEx() {
		
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();	//TabPane생성
		c.add(pane, BorderLayout.CENTER);	//탭팬을 컨텐트팬에 부착
		setSize(250, 250);
		setVisible(true);
	}
	//탭팬을 생성하고 3개의 탭을 생성하여 부착한다.
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();
		pane.add("tab1", new JLabel(new ImageIcon("images/sol.jpg")));
		pane.add("tab2", new JLabel(("탭2")));
		pane.add("tab3", new MyPanel());
		return pane;
	}

	public static void main(String[] args) {
		new TabEx();
	}
}

