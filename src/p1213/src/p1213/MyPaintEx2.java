package p1213;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class MyPaintEx2 extends JFrame{
	Container c = getContentPane();
	JPanel panel1 = new JPanel();
	MyPanel panel2 = new MyPanel();
	JButton btn = new JButton("버튼");
	
	public MyPaintEx2() {
		panel1.add(btn);
		c.add(panel1, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.CENTER);
		setSize(350, 500);
		setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel1.setBackground(Color.red);	//버튼을 누르면 Panel1의 색이 빨강으로 바뀜
			}
		});
		
	}
	
	class MyPanel extends JPanel {
		int x1, x2, y1, y2;
		int x3, y3;
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				
				@Override
				public void mousePressed(MouseEvent e) {
					x1 = e.getX(); 
					y1 = e.getY();
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					x2 = e.getX(); 
					y2 = e.getY();
					
					repaint();
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					x3 = e.getX(); 
					y3 = e.getY();
					repaint();
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
//			g.drawRect(50, 50, 50, 100);
			g.setColor(Color.magenta);
//			g.drawLine(x1, y1, x2, y2);
			g.drawOval(10, 10, this.getWidth()-1, this.getHeight()-1);
//			g.drawRoundRect(20, 20, 30, 70, 30, 30);
		}
	}
	
	public static void main(String[] args) {
		new MyPaintEx2();
	}

}
