package p1031;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.DialogOwner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class MenuEx extends JFrame{
	private JLabel imgLabel = new JLabel();	//반드시 생성자 위에 작성
	private Container contentPane = getContentPane();
	public MenuEx() {	//생성자
		
		createMenu();	//메소드
		createToolBar();
		contentPane.add(imgLabel, BorderLayout.CENTER);
		setSize(350, 350);
		setVisible(true);
	}
	
	private void createToolBar() {
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.pink);
		
//		toolBar.add(new JButton("New"));
		JButton new0 = new JButton("new");
		toolBar.add(new0);
		new0.setToolTipText("파일 불러오기");
		new0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imgLabel.setText("");
			}
		});
		
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("search"));
//		toolBar.add(new JTextField("  "));
		JTextField txt = new JTextField("   ");
		toolBar.add(txt);
		txt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imgLabel.setText(txt.getText());
			}
		});
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C++");
		toolBar.add(combo);
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();	//메뉴바 생성, 자동임포트(ctrl + shift + O)
		mb.setBackground(Color.yellow);
		
		JMenu fileMenu = new JMenu("파일(F)");
		mb.add(fileMenu);
//		fileMenu.add(new JMenuItem("Load"));
		JMenuItem load = new JMenuItem("Load");
		fileMenu.add(load);
		load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imgLabel.setIcon(new ImageIcon("images/logo.jpg"));
			}
		});
		
//		fileMenu.add(new JMenuItem("Hide"));
		JMenuItem hide = new JMenuItem("Hide");
		fileMenu.add(hide);
		hide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imgLabel.setVisible(false);
			}
		});
		
		fileMenu.addSeparator();
//		fileMenu.add(new JMenuItem("Exit"));
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(exit);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenu editMenu = new JMenu("편집(E)");
		mb.add(editMenu);
//		mb.add(new JMenu("편집(E)"));	//22~23을 한줄로 나타냄
		
		mb.add(new JMenu("서식(O)"));	
		mb.add(new JMenu("보기(V)"));
		
		JMenu helpMenu = new JMenu("도움말(H)");
		mb.add(helpMenu);
		helpMenu.add(new JMenuItem("도움말 보기"));
		helpMenu.add(new JMenuItem("피드백 보내기"));
		helpMenu.addSeparator();
		helpMenu.add(new JMenuItem("도움말 정보"));
		
		setJMenuBar(mb);
	}
	public static void main(String[] args) {
		new MenuEx();	//객체 생성(6번라인 생성자 호출)
	}
}
