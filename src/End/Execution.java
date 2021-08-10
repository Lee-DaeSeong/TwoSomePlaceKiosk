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
	protected String AdvertingPath[] = { "src/image/마스크 착용.jpg", "src/image/데일리키트.jpg", "src/image/겨울음료.jpg" };
	public int count = 0;
	
	public Execution() {
		while (true) {
			TimerTask tsk = new TimerTask() {			//첫번째 화면의 우측 상단, 3초마다 광고판 이미지를 바꾸기 위해 TimerTask 이용
				public void run() {
					if (count < 3) {					// count변수를 통해 3개의 이미지가 돌아가도록 함
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

			long time = System.currentTimeMillis();			// 첫번째 화면 좌측 상단의 현재 시간을 표시 하기위한 과정
			SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			String str = dayTime.format(new Date(time));
			JTextField currentTime = new JTextField(str);
			currentTime.setHorizontalAlignment(JTextField.CENTER);
			currentTime.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 17));
			currentTime.setBorder(new LineBorder(Color.WHITE, 1));
			panels[12].add(currentTime);
			currentTime.setBounds(5, 30, 200, 40);
			try {
				Thread.sleep(3000);							//3초마다 시간, 이미지를 교체하기 위해 sleep()이용 
				this.repaint();
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new Execution();
	}
}