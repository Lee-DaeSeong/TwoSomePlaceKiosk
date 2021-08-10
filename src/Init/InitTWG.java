package Init;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import java.util.*;

public class InitTWG extends InitDrink {
	protected String TwgMenu[] = new String[9];
	protected int TwgPrice[] = new int[9];
	protected String TwgType[] = new String[9];
	protected JLabel TwgMenuLabel[] = new JLabel[ArrSize];
	protected JLabel TwgPriceLabel[] = new JLabel[ArrSize];
	protected JLabel TwgTypeLabel[] = new JLabel[ArrSize];
	public InitTWG() {											//TWG카테고리의 메뉴들의 메뉴 이름, 가격, 타입을 
		try {													//src/Txt폴더에서 가져오는 과정, 
			String path1 = "src/Txt/TwgMenu.txt";				//BufferedLeader 사용, EUC-KR로 인코딩
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "EUC-KR"));
			String path2 = "src/Txt/TwgPrice.txt";
			BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(path2), "EUC-KR"));
			String path3 = "src/Txt/TwgType.txt";
			BufferedReader reader3 = new BufferedReader(new InputStreamReader(new FileInputStream(path3), "EUC-KR"));
			String line1 = "";
			String line2 = "";
			String line3 = "";
			for(int i = 0 ;i<9;i++) {
				line1 = reader1.readLine();
				line2 = reader2.readLine();
				line3 = reader3.readLine();
				TwgMenu[i] = line1;
				TwgPrice[i] = Integer.parseInt(line2);
				TwgType[i] = line3;
				TwgMenuLabel[i] = new JLabel(TwgMenu[i]);
				TwgPriceLabel[i] = new JLabel(TwgPrice[i]+ "원");
				TwgTypeLabel[i] = new JLabel(TwgType[i]);
			}
			reader1.close();
			reader2.close();
			reader3.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		TwgMenuLabel[0].setBounds(60, 130, 170, 20);
		TwgMenuLabel[1].setBounds(270, 130, 170, 20);
		TwgMenuLabel[2].setBounds(480, 130, 170, 20);
		TwgMenuLabel[3].setBounds(60, 300, 170, 20);
		TwgMenuLabel[4].setBounds(270, 300, 170, 20);
		TwgMenuLabel[5].setBounds(480, 300, 170, 20);
		TwgMenuLabel[6].setBounds(60, 470, 170, 20);
		TwgMenuLabel[7].setBounds(270, 470, 170, 20);
		TwgMenuLabel[8].setBounds(480, 470, 170, 20);
		TwgPriceLabel[0].setBounds(60, 150, 170, 20);
		TwgPriceLabel[1].setBounds(270, 150, 170, 20);
		TwgPriceLabel[2].setBounds(480, 150, 170, 20);
		TwgPriceLabel[3].setBounds(60, 320, 170, 20);
		TwgPriceLabel[4].setBounds(270, 320, 170, 20);
		TwgPriceLabel[5].setBounds(480, 320, 170, 20);
		TwgPriceLabel[6].setBounds(60, 490, 170, 20);
		TwgPriceLabel[7].setBounds(270, 490, 170, 20);
		TwgPriceLabel[8].setBounds(480, 490, 170, 20);
		LabelSetting(TwgMenuLabel, panels[7]);
		LabelSetting(TwgPriceLabel, panels[7]);
	}
}