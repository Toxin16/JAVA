package p1107;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuAndColorChooserEx extends JFrame {
//생성자 위에 선언하는 이유 : 생성자에 만들면 현재창에서만 사용가능, 전역으로 만들어야함
		JLabel label = new JLabel("Hello");
	public MenuAndColorChooserEx() {
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	private void createMenu() {	//메뉴바, 메뉴 만들기
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("Text");
		JMenuItem colorMenuItem = new JMenuItem("Color");
		
		colorMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { //익명클래스 사용
				String cmd = e.getActionCommand();
				if(cmd.equals("Color")) {
					Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW);
					
					if(selectedColor != null)
						label.setForeground(selectedColor);
				}
			}
		});	
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
		
	}
	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}
}
