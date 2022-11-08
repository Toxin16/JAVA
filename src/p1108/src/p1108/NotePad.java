package p1108;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class NotePad extends JFrame {
	private JTextPane _textPane;
	private ActionMap _actionMap;
	private boolean _isSaved = true;
	private JFileChooser _fc= new JFileChooser(".");	//확장자
	private File _file = null;
	public NotePad() {	//생성자
		super();//부모생성자 호출
		_textPane = new JTextPane();	//객체생성
		_textPane.getDocument().addDocumentListener (new DocumentListener(){
		   public void insertUpdate (DocumentEvent e)
		   {
		    _isSaved = false;
		   }
		   public void removeUpdate (DocumentEvent e){
		    _isSaved = false;
		   }
		   public void changedUpdate(DocumentEvent e) {
		    _isSaved = false;    
		   }
		  });
		JScrollPane p = new JScrollPane(_textPane);	//스크롤
		add(p);//p를 프레임에 추가
		 _actionMap = createActionMap();
		setJMenuBar(createMenuBar());//MenuBar 생성
		add(createToolBar(), BorderLayout.NORTH);//ToolBar()
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private ActionMap createActionMap() {
		ActionMap am = new ActionMap();
		am.put("정보", new AboutAction());
		am.put("도움말", new HelpAction());
		am.put("잘라내기", new CutAction());
		am.put("복사", new CopyAction());
		am.put("붙여넣기", new PasteAction());
		am.put("종료", new ExitAction());
		am.put("새파일", new NewAction());
		am.put("열기", new OpenAction());
		am.put("저장", new SaveAction());
		am.put("다른이름으로 저장", new SaveAsAction());
		return am;
	}
	private JMenuBar createMenuBar() {	//메뉴바를 생성하는 함수
		JMenuBar menubar = new JMenuBar();	//메뉴바 객체생성
		//File
		JMenu m = new JMenu("파일");	//메뉴 객체생성
		m.add(new JMenuItem(_actionMap.get("새파일")));	//메뉴에 원소추가
		m.add(new JMenuItem(_actionMap.get("열기")));
		m.add(new JMenuItem(_actionMap.get("저장")));
		m.add(new JMenuItem(_actionMap.get("다른이름으로 저장")));
		m.addSeparator();	//가로줄
		m.add(new JMenuItem(_actionMap.get("종료")));
		menubar.add(m);		//메뉴바에 메뉴 추가
		
		//Edit
		m = new JMenu("편집");
		m.add(new JMenuItem(_actionMap.get("잘라내기")));
		m.add(new JMenuItem(_actionMap.get("복사")));
		m.add(new JMenuItem(_actionMap.get("붙여넣기")));
		menubar.add(m);
		
		//Help
		m = new JMenu("도움말");
		m.add(new JMenuItem(_actionMap.get("도움말")));
		m.add(new JMenuItem(_actionMap.get("정보")));
		menubar.add(m);
		
		return menubar;
	}
	
	private JToolBar createToolBar() {	//툴바를 생성하는 함수
		JToolBar toolbar = new JToolBar();	//툴바 객체생성
		toolbar.add(new JButton(_actionMap.get("새파일")));	//툴바에 원소추가
		toolbar.add(new JButton(_actionMap.get("열기")));
		toolbar.add(new JButton(_actionMap.get("저장")));
		toolbar.add(new JButton(_actionMap.get("다른이름으로 저장")));
		toolbar.addSeparator();
		
		toolbar.add(new JButton(_actionMap.get("복사")));
		toolbar.add(new JButton(_actionMap.get("잘라내기")));
		toolbar.add(new JButton(_actionMap.get("붙여넣기")));
		toolbar.addSeparator();
		
		toolbar.add(new JButton(_actionMap.get("도움말")));
		toolbar.add(new JButton(_actionMap.get("정보")));
		
		Component[] comps = toolbar.getComponents();	//배열선언
		  for (Component c : comps) 
		  {
		   if(c instanceof JButton)
		    c.setFocusable(false);
		  }
		  
		return toolbar;
	}

	private void start() {	//원래 생성자에 들어가는 기본 요소를 따로 생성함
		setSize(600,400);
		setLocation(100,100);
		setVisible(true);
	}
	
	private class AboutAction extends AbstractAction {	//34Line
		public AboutAction() {
			super("정보");
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String[] mesg= {"텍스트 에디터", "제작자: 경성대"};
			JOptionPane.showMessageDialog(NotePad.this, mesg,
				"텍스트 에디터 정보", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private class HelpAction extends AbstractAction {	//35Line
		public HelpAction() {
			super("도움말");
			putValue(Action.ACCELERATOR_KEY, 
					KeyStroke.getKeyStroke("Ctrl+H"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_H);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String[] mesg= {"아직 지원하지 않습니다."};
			JOptionPane.showMessageDialog(NotePad.this, mesg,
				"텍스트 에디터", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private class OpenAction extends AbstractAction {
		public OpenAction() {
		super("열기");
		putValue(Action.ACCELERATOR_KEY, 
				KeyStroke.getKeyStroke("Ctrl+O"));
		putValue(Action.MNEMONIC_KEY, KeyEvent.VK_O);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(getValue(Action.NAME));
			if(!confirmSave())
				return;
			//oepn();
			_isSaved = open();
		}
	}
	
	private class CutAction extends AbstractAction
	 {
	  public CutAction()
	  {
	   super("잘라내기");
	   putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("Ctrl+X"));
	   putValue(Action.MNEMONIC_KEY, KeyEvent.VK_X);
	  }
	  @Override
	  public void actionPerformed(ActionEvent e)
	  {
	   System.out.println(getValue(Action.NAME));
	   _textPane.cut();
	  }
	 }
	 
	 private class CopyAction extends AbstractAction
	 {
	  public CopyAction()
	  {
	   super("복사하기");
	   putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("Ctrl+C"));
	   putValue(Action.MNEMONIC_KEY, KeyEvent.VK_C);
	  }
	  @Override
	  public void actionPerformed(ActionEvent e)
	  {
	   System.out.println(getValue(Action.NAME));
	   _textPane.copy();
	  }
	 }
	 
	 private class PasteAction extends AbstractAction
	 {
	  public PasteAction()
	  {
	   super("붙여넣기");
	   putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("Ctrl+O"));
	   putValue(Action.MNEMONIC_KEY, KeyEvent.VK_O);
	  }
	  @Override
	  public void actionPerformed(ActionEvent e)
	  {
	   System.out.println(getValue(Action.NAME));
	   _textPane.paste();
	  }
	 }
	 
	 private class ExitAction extends AbstractAction
	 {
	  public ExitAction()
	  {
	   super("종료");
	   putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("Ctrl+E"));
	   putValue(Action.MNEMONIC_KEY, KeyEvent.VK_E);
	  }
	  public void actionPerformed(ActionEvent e)
	  {
	   System.out.println(getValue(Action.NAME));
	   if(!confirmSave())
	    return;
	   System.exit(0);
	  }
	 }
	 
	 private class NewAction extends AbstractAction
	 {
	  public NewAction()
	  {
	   super("새파일");
	   putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("Ctrl+N"));
	   putValue(Action.MNEMONIC_KEY, KeyEvent.VK_N);
	  }
	  public void actionPerformed(ActionEvent e)
	  {
	   System.out.println(getValue(Action.NAME));
	   _textPane.setText("");
	   _isSaved = true;
	  }
	 }
	 
	 private class SaveAction extends AbstractAction
	 {
	  public SaveAction() {
	   super("저장");
	   putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("Ctrl+S"));
	   putValue(Action.MNEMONIC_KEY, KeyEvent.VK_S);
	  }
	  public void actionPerformed(ActionEvent e)
	  {
	   System.out.println(getValue(Action.NAME));
	   //save();
	   _isSaved = save();
	  }
	 }
	 
	 private class SaveAsAction extends AbstractAction
	 {
	  public SaveAsAction()
	  {
	   super("다른이름으로 저장");
	   putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("Ctrl+A"));
	   putValue(Action.MNEMONIC_KEY, KeyEvent.VK_A);
	  }
	  public void actionPerformed(ActionEvent e)
	  {
	   System.out.println(getValue(Action.NAME));
	   saveAs();
	   _isSaved = saveAs();
	  }
	 }
	 
	 private boolean save()
	 {
	  if(_file==null)
	   return saveAs();
	  else
	   try {
	    save(_file);
	    return true;
	   } catch (IOException e) {
	    showSaveErrorMessage(e);
	    
	   }
	   return false;
	 }
	 
		private boolean open() {
			if(_fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION);
			{
				File file = _fc.getSelectedFile();
				try {
					open(file);
					_file = file;
					setTitle(file.getName()+"-NotePad");
					return true;	
				} catch (IOException e) {
					JOptionPane.showMessageDialog(this, "파일을 열 수 없습니다" +
				file, "텍스트 에디터", JOptionPane.ERROR_MESSAGE);
					return false;
				}
			}
		}
		private boolean confirmSave() {
			if(_isSaved) return true;
			int ret = JOptionPane.showConfirmDialog(this, "내용이 수정되었습니다. 저장하시겠습니까?",
					"텍스트 에디터", JOptionPane.YES_NO_CANCEL_OPTION);
			switch(ret) {
			case JOptionPane.YES_NO_OPTION: save(); return true;
			case JOptionPane.NO_OPTION: return true;
			default: return false;
			}
		}
		
		private void showSaveErrorMessage(IOException e) {
			  e.printStackTrace();
			  String[] mesg = {
			    "저장 할 수 없습니다." + _file,
			    "접근불가"
			  };
			  JOptionPane.showMessageDialog(
			    this,
			    mesg,
			    "텍스트 에디터",
			    JOptionPane.ERROR_MESSAGE);
			 }
			 
		private void save(File file) throws IOException {
			BufferedWriter w = new BufferedWriter(new FileWriter(file));
			w.write(_textPane.getText());
			w.close();
		}
			 
		public boolean saveAs() {
			if (_fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
			{
				File file = _fc.getSelectedFile();
				try {
					save(file);//open(file);
					_file = file;
					setTitle(file.getName() + " - 텍스트 에디터");
					return true;
				}catch (IOException e){
					showSaveErrorMessage(e);
					return false;
				}
			}
			return false;
	 }
			 
	public static void main(String[] args) {
		//생성자를 먼저 실행, start()함수를 이용해서 객체를 생성.
		new NotePad().start();	
	}
}
