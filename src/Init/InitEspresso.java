
package Init;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.util.*;

public class InitEspresso extends InitLabel {
	protected String EspressoMenu[] = new String[9];
	protected int EspressoPrice[] = new int[9];
	protected String EspressoType[] = new String[9];
	protected JLabel EspressoMenuLabel[] = new JLabel[ArrSize];
	protected JLabel EspressoPriceLabel[] = new JLabel[ArrSize];
	protected JLabel EspressoTypeLabel[] = new JLabel[ArrSize];
	public InitEspresso() {								//���������� ī�װ��� �޴����� �޴� �̸�, ����, Ÿ���� 
		try {											//src/Txt�������� �������� ���� 
			String path1 = "src/Txt/EspressoMenu.txt";	//BufferedReader�� ���� ����, EUC-KR�� ���ڵ�
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "EUC-KR"));
			String path2 = "src/Txt/EspressoPrice.txt";
			BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(path2), "EUC-KR"));
			String path3 = "src/Txt/EspressoType.txt";
			BufferedReader reader3 = new BufferedReader(new InputStreamReader(new FileInputStream(path3), "EUC-KR"));
			String line1 = "";
			String line2 = "";
				String line3 = "";
				for (int i = 0; i<9; i++) {
				line1 = reader1.readLine();				//�� txt���ϵ��� ���ٿ� �� �޴��� ������ ����Ǿ� �����Ƿ� readLine ���
				line2 = reader2.readLine();
				line3 = reader3.readLine();
				EspressoMenu[i] = line1;
				EspressoPrice[i] = Integer.parseInt(line2);	 //String�� int������ �ٲ���
				EspressoType[i] = line3;
 				EspressoMenuLabel[i] = new JLabel(EspressoMenu[i]);
				EspressoPriceLabel[i] = new JLabel(EspressoPrice[i] + "��");
				EspressoTypeLabel[i] = new JLabel(EspressoType[i]);
			}
			reader1.close();
			reader2.close();
			reader3.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	
		EspressoMenuLabel[0].setBounds(60, 130, 170, 20);
		EspressoMenuLabel[1].setBounds(270, 130, 170, 20);
		EspressoMenuLabel[2].setBounds(480, 130, 170, 20);
		EspressoMenuLabel[3].setBounds(60, 300, 170, 20);
		EspressoMenuLabel[4].setBounds(270, 300, 170, 20);
		EspressoMenuLabel[5].setBounds(480, 300, 170, 20);
		EspressoMenuLabel[6].setBounds(60, 470, 170, 20);
		EspressoMenuLabel[7].setBounds(270, 470, 170, 20);
		EspressoMenuLabel[8].setBounds(480, 470, 170, 20);
		EspressoPriceLabel[0].setBounds(60, 150, 170, 20);
		EspressoPriceLabel[1].setBounds(270, 150, 170, 20);
		EspressoPriceLabel[2].setBounds(480, 150, 170, 20);
		EspressoPriceLabel[3].setBounds(60, 320, 170, 20);
		EspressoPriceLabel[4].setBounds(270, 320, 170, 20);
		EspressoPriceLabel[5].setBounds(480, 320, 170, 20);
		EspressoPriceLabel[6].setBounds(60, 490, 170, 20);
		EspressoPriceLabel[7].setBounds(270, 490, 170, 20);
		EspressoPriceLabel[8].setBounds(480, 490, 170, 20);
		LabelSetting(EspressoMenuLabel, panels[5]);
		LabelSetting(EspressoPriceLabel, panels[5]);
	}

	public void LabelSetting(JLabel[] label, JPanel panel) {			//�޴� �̸�, ���� ���̺��� �����ϴ� �޼ҵ�
		for (int i = 0; i < 9; i++) {									//�ٸ� InitXXXX Ŭ���������� ���
			panel.add(label[i]);
			label[i].setHorizontalAlignment(JLabel.CENTER);
			label[i].setFont(new Font("���� ����� 250", Font.PLAIN, 15));
		}
	}
}