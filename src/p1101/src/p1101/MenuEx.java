package p1101;

import java.awt.*;
import java.awt.event.*;

import javax.management.loading.PrivateClassLoader;
import javax.print.attribute.standard.DialogOwner;
import javax.swing.*;
public class MenuEx extends JFrame{
	private MyHelp dialog;
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
		JMenuItem open = new JMenuItem("열기(O)");
		fileMenu.add(open);
		open.addActionListener(new OpenActionListener());

//		fileMenu.add(new JMenuItem("저장"));
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
		dialog = new MyHelp(this, "도움말창");
//		helpMenu.add(new JMenuItem("도움말 정보"));
		JMenuItem helpItem = new JMenuItem("도움말 정보");
		helpMenu.add(helpItem);
		helpItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		setJMenuBar(mb);
	}
	//Open 메뉴아이템이 선택되면 호출되는 Action 리스너 
	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;
		public OpenActionListener() {
			chooser = new JFileChooser();	//파일 다이얼로그 생성
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			int ret = chooser.showOpenDialog(null);	//파일 다이얼로그 출력
			//사용자가 창을 강제로 닫았거나 취소버튼을 누른경우
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다",
						"경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			String filePath = chooser.getSelectedFile().getPath();	//파일 경로명 리턴
			imgLabel.setIcon(new ImageIcon(filePath)); //이미지 출력
			pack(); 	//이미지의 크기에 맞추어 프레임크기 조절
		}
	}
	
	public static void main(String[] args) {
		new MenuEx();	//객체 생성(6번라인 생성자 호출)
	}
}
