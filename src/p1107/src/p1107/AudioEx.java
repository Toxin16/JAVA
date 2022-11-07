package p1107;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class AudioEx extends JFrame{
	JButton btns[] = {new JButton("play"), new JButton("stop"),
			new JButton("play again")};
	Clip clip;	//audio를 지원하기 위해
	
	public AudioEx() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyActionListener al = new MyActionListener();
		for(int i=0; i<btns.length; i++) {
			c.add(btns[i]);	
			btns[i].addActionListener(al); //버튼에 Action 리스너 등록
		}
		setSize(250, 250);
		setVisible(true);
		loadAudio("audio/애국가1절.wav");
	}
	
	private void loadAudio(String pathName) {
		try {
			clip = AudioSystem.getClip();	//비어있는 오디오 클립 만들기
			File audioFile = new File(pathName);	//오디오 파일의 경로명
			AudioInputStream audioStream = 
				AudioSystem.getAudioInputStream(audioFile);	//오디오 파일로부터
			clip.open(audioStream);	//재생할 오디오 스트림 열기
		} catch (LineUnavailableException e) {e.printStackTrace();}
		catch(UnsupportedAudioFileException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
		
	}
	class MyActionListener implements ActionListener{	//내부클래스
		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
				case "play": clip.start(); break;//오디오 재생시작
				case "stop": clip.stop(); break;//오디오 재생중단
				case "paly again": 
					clip.setFramePosition(0);//재생위치를 첫프레임으로 변경
					clip.start();
					break;
			}
		}
	}

	public static void main(String[] args) {
		new AudioEx();
	}
}
