package Init;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import java.util.*;

public class InitDrink extends InitEspresso {
	protected String DrinkMenu[] = new String[9];
	protected int DrinkPrice[] = new int[9];
	protected String DrinkType[] = new String[9];
	protected JLabel DrinkMenuLabel[] = new JLabel[ArrSize];
	protected JLabel DrinkPriceLabel[] = new JLabel[ArrSize];
	protected JLabel DrinkTypeLabel[] = new JLabel[ArrSize];

	public InitDrink() {										//드링크 카테고리의 메뉴들의 메뉴 이름, 가격, 타입을
		try {													//src/Txt에서 가져오는 과정
			String path1 = "src/Txt/DrinkMenu.txt";				//BufferedReader를 통해 구현, EUC-KR로 인코딩
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "EUC-KR"));
			String path2 = "src/Txt/DrinkPrice.txt";
			BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(path2), "EUC-KR"));
			String path3 = "src/Txt/DrinkType.txt";
			BufferedReader reader3 = new BufferedReader(new InputStreamReader(new FileInputStream(path3), "EUC-KR"));
			String line1 = "";
			String line2 = "";
			String line3 = "";
			for (int i = 0; i < 9; i++) {
				line1 = reader1.readLine();
				line2 = reader2.readLine();
				line3 = reader3.readLine();
				DrinkMenu[i] = line1;
				DrinkPrice[i] = Integer.parseInt(line2);
				DrinkType[i] = line3;
				DrinkMenuLabel[i] = new JLabel(DrinkMenu[i]);
				DrinkPriceLabel[i] = new JLabel(DrinkPrice[i] + "원");
				DrinkTypeLabel[i] = new JLabel(DrinkType[i]);
			}
			reader1.close();
			reader2.close();
			reader3.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		DrinkMenuLabel[0].setBounds(60, 130, 170, 20);
		DrinkMenuLabel[1].setBounds(270, 130, 170, 20);
		DrinkMenuLabel[2].setBounds(480, 130, 170, 20);
		DrinkMenuLabel[3].setBounds(60, 300, 170, 20);
		DrinkMenuLabel[4].setBounds(270, 300, 170, 20);
		DrinkMenuLabel[5].setBounds(480, 300, 170, 20);
		DrinkMenuLabel[6].setBounds(60, 470, 170, 20);
		DrinkMenuLabel[7].setBounds(270, 470, 170, 20);
		DrinkMenuLabel[8].setBounds(480, 470, 170, 20);
		DrinkPriceLabel[0].setBounds(60, 150, 170, 20);
		DrinkPriceLabel[1].setBounds(270, 150, 170, 20);
		DrinkPriceLabel[2].setBounds(480, 150, 170, 20);
		DrinkPriceLabel[3].setBounds(60, 320, 170, 20);
		DrinkPriceLabel[4].setBounds(270, 320, 170, 20);
		DrinkPriceLabel[5].setBounds(480, 320, 170, 20);
		DrinkPriceLabel[6].setBounds(60, 490, 170, 20);
		DrinkPriceLabel[7].setBounds(270, 490, 170, 20);
		DrinkPriceLabel[8].setBounds(480, 490, 170, 20);
		LabelSetting(DrinkMenuLabel, panels[6]);			//InitEspresso의 LabelSetting()메소드 이용
		LabelSetting(DrinkPriceLabel, panels[6]);

	}
}