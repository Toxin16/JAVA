package p1212;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintJPanelEx extends JFrame{
	MyPanel panel = new MyPanel();
	public PaintJPanelEx() {	//생성자
		setSize(250, 250);
		setContentPane(panel);
		setVisible(true);
	}
	class MyPanel extends JPanel {
	
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			ImageIcon icon = new ImageIcon("images/ky.jpg");
			Image img = icon.getImage();
			g.drawImage(img, getWidth()/2, 0, getWidth()/2, getHeight()/2, this);
//			g.drawImage(img, 0, 0, 250, 230, this);
//			int [] x = {40, 20, 20, 40, 60, 60};
//			int [] y = {40, 60, 100, 120, 100, 60};
//			g.setColor(Color.red);
//			g.fillPolygon(x, y, 6);
//			g.drawPolygon(x, y, 6);
//			
//			g.setFont(new Font("궁서체", Font.ITALIC, 30));
//			g.drawString("자바는 재밌다", 30, 30);	//시작위치30,30(좌측하단)
			
		}
	}
	
	public static void main(String[] args) {
		new PaintJPanelEx();	//생성자가 있으므로 메인에서 객체생성가능
	}
}
