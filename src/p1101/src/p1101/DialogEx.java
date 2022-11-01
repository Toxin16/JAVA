package p1101;

import java.awt.event.*;
import javax.swing.*;

public class DialogEx extends JFrame{	//main만 public
	//레퍼런스 변수, 생성자 위에 선언 같은 패키지의 다른 파일 클래스
	private MyDialog dialog;	
	public DialogEx() {		//생성자
		super("예제 프레임");
		JButton btn = new JButton("Show Diaglog");
		
		dialog = new MyDialog(this, "Test Dialog");	//다이얼로그 객체생성
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		getContentPane().add(btn);	//투명한 유리판
		setSize(250,200);	//화면 크기
		setVisible(true);	//화면 보임
	}

	public static void main(String[] args) {
		new DialogEx();
	}
}

//모달리스 : 서로 다른 창이 독립적으로 작동
//모달 : 사용자 입력을 독점, 닫기전까지 다른 창 작업 불가