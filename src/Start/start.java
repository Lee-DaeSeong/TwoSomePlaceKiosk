package Start;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class start extends JFrame {					//������ �Ǵ� Ŭ����, JFrame ���
	protected Container c = getContentPane();
	public final int ArrSize = 9;
	public start() {
		c.setLayout(null);
		setSize(1224, 800);
		setBounds(0, 0, 1224, 800);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("A TwoSome Place");				//Ÿ��Ʋ ����
		ImageIcon img = new ImageIcon("src/image/twosome.jpg");	//���� ��� �ΰ�
		setIconImage(img.getImage());
		setLocationRelativeTo(null);
		setVisible(true);
	}
}