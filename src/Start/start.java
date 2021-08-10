package Start;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class start extends JFrame {					//시작이 되는 클래스, JFrame 상속
	protected Container c = getContentPane();
	public final int ArrSize = 9;
	public start() {
		c.setLayout(null);
		setSize(1224, 800);
		setBounds(0, 0, 1224, 800);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("A TwoSome Place");				//타이틀 설정
		ImageIcon img = new ImageIcon("src/image/twosome.jpg");	//왼쪽 상단 로고
		setIconImage(img.getImage());
		setLocationRelativeTo(null);
		setVisible(true);
	}
}