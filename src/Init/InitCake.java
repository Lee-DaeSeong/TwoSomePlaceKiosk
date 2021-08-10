package Init;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import java.util.*;

public class InitCake extends InitTWG {
	protected String CakeMenu[] = new String[9];
	protected int CakePrice[] = new int[9];
	protected String CakeType[] = new String[9];
	protected JLabel CakeMenuLabel[] = new JLabel[ArrSize];
	protected JLabel CakePriceLabel[] = new JLabel[ArrSize];
	protected JLabel CakeTypeLabel[] = new JLabel[ArrSize];
	public InitCake() {												//케이크 카테고리의 메뉴들의 이름, 가격, 타입을
		try {														//src/Txt에서 가져오는 과정
			String path1 = "src/Txt/CakeMenu.txt";					//BufferedReader를 통해 구현, EUC-KR 사용
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "EUC-KR"));
			String path2 = "src/Txt/CakePrice.txt";
			BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(path2), "EUC-KR"));
			String path3 = "src/Txt/CakeType.txt";
			BufferedReader reader3 = new BufferedReader(new InputStreamReader(new FileInputStream(path3), "EUC-KR"));
			String line1 = "";
			String line2 = "";
			String line3 = "";
			for (int i = 0; i<9; i++) {
				line1 = reader1.readLine();
				line2 = reader2.readLine();
				line3 = reader3.readLine();
				CakeMenu[i] = line1;
				CakePrice[i] = Integer.parseInt(line2);
				CakeType[i] = line3;
				CakeMenuLabel[i] = new JLabel(CakeMenu[i]);
				CakePriceLabel[i] = new JLabel(CakePrice[i] + "원");
				CakeTypeLabel[i] = new JLabel(CakeType[i]);
			}
			reader1.close();
			reader2.close();
			reader3.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		CakeMenuLabel[0].setBounds(60, 130, 170, 20);
		CakeMenuLabel[1].setBounds(270, 130, 170, 20);
		CakeMenuLabel[2].setBounds(480, 130, 170, 20);
		CakeMenuLabel[3].setBounds(60, 300, 170, 20);
		CakeMenuLabel[4].setBounds(270, 300, 170, 20);
		CakeMenuLabel[5].setBounds(480, 300, 170, 20);
		CakeMenuLabel[6].setBounds(60, 470, 170, 20);
		CakeMenuLabel[7].setBounds(270, 470, 170, 20);
		CakeMenuLabel[8].setBounds(480, 470, 170, 20);
		CakePriceLabel[0].setBounds(60, 150, 170, 20);
		CakePriceLabel[1].setBounds(270, 150, 170, 20);
		CakePriceLabel[2].setBounds(480, 150, 170, 20);
		CakePriceLabel[3].setBounds(60, 320, 170, 20);
		CakePriceLabel[4].setBounds(270, 320, 170, 20);
		CakePriceLabel[5].setBounds(480, 320, 170, 20);
		CakePriceLabel[6].setBounds(60, 490, 170, 20);
		CakePriceLabel[7].setBounds(270, 490, 170, 20);
		CakePriceLabel[8].setBounds(480, 490, 170, 20);
		LabelSetting(CakeMenuLabel, panels[8]);
		LabelSetting(CakePriceLabel, panels[8]);
	}
}