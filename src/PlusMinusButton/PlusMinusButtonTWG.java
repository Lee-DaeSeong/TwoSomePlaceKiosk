package PlusMinusButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class PlusMinusButtonTWG extends PlusMinusButtonDrink {
	public PlusMinusButtonTWG() {
		for (int i = 0; i < ArrSize; i++) {
			final int temp = i;
			TwgMinus[temp].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {		// - 버튼 눌렀을 때 ActionListner 구현
					if (TwgOrderCount[temp] > 0) {
						TwgOrderCount[temp] = TwgOrderCount[temp] - 1;
						TwgOrderCountTF[temp].setText(TwgOrderCount[temp] + "");
						TwgOrderPrice[temp] -= TwgPrice[temp];
						TwgOrderPriceTF[temp].setText(TwgOrderPrice[temp] + "원");
						TotalPrice -= TwgPrice[temp];
						TotalPriceTF.setText(TotalPrice + "원");
						TwgPlus[temp].setEnabled(true);
						OrderCount--;
					} else if (TwgOrderCount[temp] == 0) {			// Count가 0일 때 - 버튼 눌렀을 때
						JButton jb = (JButton) e.getSource();
						panels[2].remove(jb.getParent());			// 해당 메뉴 주문 내역에서 지움
						Interval=(jb.getParent().getY()) / 40;
						CheckNull[Interval] = 0;
						TwgBtn[temp].setEnabled(true);
						TwgOrderCount[temp]++;
						TwgOrderCountTF[temp].setText(TwgOrderCount[temp] + "");
						TwgOrderPrice[temp] += TwgPrice[temp];
						TwgOrderPriceTF[temp].setText(TwgOrderPrice[temp] + "원");
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
			TwgPlus[temp].addActionListener(new ActionListener() {		// + 버튼 눌렀을 때 ActionListener 구현
				public void actionPerformed(ActionEvent e) {
					if (TwgOrderCount[temp] < 100) {					// Count 100개 까지 제한
						TwgOrderCount[temp] = TwgOrderCount[temp] + 1;
						TwgOrderCountTF[temp].setText(TwgOrderCount[temp] + "");
						TwgOrderPrice[temp] += TwgPrice[temp];
						TwgOrderPriceTF[temp].setText(TwgOrderPrice[temp] + "원");
						TotalPrice += TwgPrice[temp];
						TotalPriceTF.setText(TotalPrice + "원");
						TwgMinus[temp].setEnabled(true);
					}
				}
			});
		}
	}
}
