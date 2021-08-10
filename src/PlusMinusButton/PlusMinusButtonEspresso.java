package PlusMinusButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import Click.*;

public class PlusMinusButtonEspresso extends ClickButton {
	public static int Interval = 0;

	public PlusMinusButtonEspresso() {
		for (int i = 0; i < ArrSize; i++) {
			final int temp = i;
			EspressoMinus[temp].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // - 버튼 눌렀을 때 ActionListner 구현
					if (EspressoOrderCount[temp] > 0) {
						EspressoOrderCount[temp] = EspressoOrderCount[temp] - 1;
						EspressoOrderCountTF[temp].setText(EspressoOrderCount[temp] + "");
						EspressoOrderPrice[temp] -= EspressoPrice[temp];
						EspressoOrderPriceTF[temp].setText(EspressoOrderPrice[temp] + "원");
						TotalPrice -= EspressoPrice[temp];
						TotalPriceTF.setText(TotalPrice + "원");
						EspressoPlus[temp].setEnabled(true);
						OrderCount--;
					} else if (EspressoOrderCount[temp] == 0) { // Count가 0일 때 - 버튼 눌렀을 때
						JButton jb = (JButton) e.getSource();
						panels[2].remove(jb.getParent()); // 해당 메뉴 주문 내역에서 지움
						EspressoBtn[temp].setEnabled(true);
						Interval = (jb.getParent().getY()) / 40;
						CheckNull[Interval] = 0;
						EspressoOrderCount[temp]++;
						EspressoOrderCountTF[temp].setText(EspressoOrderCount[temp] + "");
						EspressoOrderPrice[temp] += EspressoPrice[temp];
						EspressoOrderPriceTF[temp].setText(EspressoOrderPrice[temp] + "원");
						int removeIdx = Interval;
						for (int i = 0; i < 9; i++) {
							if (EspressoOrderPanel[i].getName() != null) {
								int idx = Integer.valueOf(EspressoOrderPanel[i].getName()) - 1;
								if (removeIdx <= idx) {
									EspressoOrderPanel[i].setBounds(4, idx * 40, 480, 40); // 위치 설정
									EspressoOrderPanel[i].setName(idx + "");
									panels[2].repaint();
								}
							}
							if (CakeOrderPanel[i].getName() != null) {
								int idx = Integer.valueOf(CakeOrderPanel[i].getName()) - 1;
								if (removeIdx <= idx) {
									CakeOrderPanel[i].setBounds(4, idx * 40, 480, 40); // 위치 설정
									CakeOrderPanel[i].setName(idx + "");
									panels[2].repaint();
								}
							}
							if (DrinkOrderPanel[i].getName() != null) {
								int idx = Integer.valueOf(DrinkOrderPanel[i].getName()) - 1;
								if (removeIdx <= idx) {
									DrinkOrderPanel[i].setBounds(4, idx * 40, 480, 40); // 위치 설정
									DrinkOrderPanel[i].setName(idx + "");
									panels[2].repaint();
								}
							}
							if (TwgOrderPanel[i].getName() != null) {
								int idx = Integer.valueOf(TwgOrderPanel[i].getName()) - 1;
								if (removeIdx <= idx) {
									TwgOrderPanel[i].setBounds(4, idx * 40, 480, 40); // 위치 설정
									TwgOrderPanel[i].setName(idx + "");
									panels[2].repaint();
								}
							}
						}
						for (int i = Interval; i < 8; i++) {
							if (CheckNull[i + 1] == 1) {
								CheckNull[i] = 1;
								CheckNull[i + 1] = 0;
							}
						}

						panels[2].repaint();
					}
				}

			});
			EspressoPlus[temp].addActionListener(new ActionListener() { // + 버튼 눌렀을 때 ActionListener 구현
				public void actionPerformed(ActionEvent e) {
					if (EspressoOrderCount[temp] < 100) { // Count 100개 까지 제한
						EspressoOrderCount[temp] = EspressoOrderCount[temp] + 1;
						EspressoOrderCountTF[temp].setText(EspressoOrderCount[temp] + "");
						EspressoOrderPrice[temp] += EspressoPrice[temp];
						EspressoOrderPriceTF[temp].setText(EspressoOrderPrice[temp] + "원");
						TotalPrice += EspressoPrice[temp];
						TotalPriceTF.setText(TotalPrice + "원");
						EspressoMinus[temp].setEnabled(true);
					}
				}
			});
		}
	}
}