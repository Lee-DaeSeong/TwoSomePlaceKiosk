package End;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.management.timer.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.util.Timer;

import PlusMinusButton.PlusMinusButtonCake;

public class Execution extends PlusMinusButtonCake {
	protected String AdvertingPath[] = { "src/image/����ũ ����.jpg", "src/image/���ϸ�ŰƮ.jpg", "src/image/�ܿ�����.jpg" };
	public int count = 0;
	
	public Execution() {
		while (true) {
			TimerTask tsk = new TimerTask() {			//ù��° ȭ���� ���� ���, 3�ʸ��� ������ �̹����� �ٲٱ� ���� TimerTask �̿�
				public void run() {
					if (count < 3) {					// count������ ���� 3���� �̹����� ���ư����� ��
						ImageIcon ImageSetSize = new ImageIcon(AdvertingPath[count]);
						Image img = ImageSetSize.getImage();
						Image img2 = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
						Advertising.setIcon(new ImageIcon(img2));
						count++;
					} else {
						count = 0;
						ImageIcon ImageSetSize = new ImageIcon(AdvertingPath[count]);
						Image img = ImageSetSize.getImage();
						Image img2 = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
						Advertising.setIcon(new ImageIcon(img2));
						count++;
					}
				}
			};
			Timer timer = new Timer();
			timer.scheduleAtFixedRate(tsk, 0, 10000000);

			long time = System.currentTimeMillis();			// ù��° ȭ�� ���� ����� ���� �ð��� ǥ�� �ϱ����� ����
			SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			String str = dayTime.format(new Date(time));
			JTextField currentTime = new JTextField(str);
			currentTime.setHorizontalAlignment(JTextField.CENTER);
			currentTime.setFont(new Font("���� ����� 250", Font.PLAIN, 17));
			currentTime.setBorder(new LineBorder(Color.WHITE, 1));
			panels[12].add(currentTime);
			currentTime.setBounds(5, 30, 200, 40);
			try {
				Thread.sleep(3000);							//3�ʸ��� �ð�, �̹����� ��ü�ϱ� ���� sleep()�̿� 
				this.repaint();
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new Execution();
	}
}