package PlusMinusButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

import javax.swing.JButton;

public class PlusMinusButtonDrink extends PlusMinusButtonEspresso {
	public PlusMinusButtonDrink() {

		for (int i = 0; i < ArrSize; i++) {
			final int temp = i;
			DrinkMinus[temp].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {		// - ��ư ������ �� ActionListner ����
					if (DrinkOrderCount[temp] > 0) {
						DrinkOrderCount[temp] = DrinkOrderCount[temp] - 1;
						DrinkOrderCountTF[temp].setText(DrinkOrderCount[temp] + "");
						DrinkOrderPrice[temp] -= DrinkPrice[temp];
						DrinkOrderPriceTF[temp].setText(DrinkOrderPrice[temp] + "��");
						TotalPrice -= DrinkPrice[temp];
						TotalPriceTF.setText(TotalPrice + "��");
						DrinkPlus[temp].setEnabled(true);
						OrderCount--;
					} else if (DrinkOrderCount[temp] == 0) {		// Count�� 0�� �� - ��ư ������ ��
						JButton jb = (JButton) e.getSource();
						panels[2].remove(jb.getParent());			// �ش� �޴� �ֹ� �������� ����
						DrinkBtn[temp].setEnabled(true);
						Interval=(jb.getParent().getY()) / 40;
						CheckNull[Interval] = 0;
						DrinkOrderCount[temp]++;
						DrinkOrderCountTF[temp].setText(DrinkOrderCount[temp] + "");
						DrinkOrderPrice[temp] += DrinkPrice[temp];
						DrinkOrderPriceTF[temp].setText(DrinkOrderPrice[temp] + "��");
						int removeIdx = Interval;
						for (int i = 0; i < 9; i++) {
							if (EspressoOrderPanel[i].getName() != null) {
								int idx = Integer.valueOf(EspressoOrderPanel[i].getName()) - 1;
								if (removeIdx <= idx) {
									EspressoOrderPanel[i].setBounds(4, idx * 40, 480, 40); // ��ġ ����
									EspressoOrderPanel[i].setName(idx + "");
									panels[2].repaint();
								}
							}
							if (CakeOrderPanel[i].getName() != null) {
								int idx = Integer.valueOf(CakeOrderPanel[i].getName()) - 1;
								if (removeIdx <= idx) {
									CakeOrderPanel[i].setBounds(4, idx * 40, 480, 40); // ��ġ ����
									CakeOrderPanel[i].setName(idx + "");
									panels[2].repaint();
								}
							}
							if (DrinkOrderPanel[i].getName() != null) {
								int idx = Integer.valueOf(DrinkOrderPanel[i].getName()) - 1;
								if (removeIdx <= idx) {
									DrinkOrderPanel[i].setBounds(4, idx * 40, 480, 40); // ��ġ ����
									DrinkOrderPanel[i].setName(idx + "");
									panels[2].repaint();
								}
							}
							if (TwgOrderPanel[i].getName() != null) {
								int idx = Integer.valueOf(TwgOrderPanel[i].getName()) - 1;
								if (removeIdx <= idx) {
									TwgOrderPanel[i].setBounds(4, idx * 40, 480, 40); // ��ġ ����
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
			DrinkPlus[temp].addActionListener(new ActionListener() {	// + ��ư ������ �� ActionListener ����
				public void actionPerformed(ActionEvent e) {
					if (DrinkOrderCount[temp] < 100) {					// Count 100�� ���� ����
						DrinkOrderCount[temp] = DrinkOrderCount[temp] + 1;
						DrinkOrderCountTF[temp].setText(DrinkOrderCount[temp] + "");
						DrinkOrderPrice[temp] += DrinkPrice[temp];
						DrinkOrderPriceTF[temp].setText(DrinkOrderPrice[temp] + "��");
						TotalPrice += DrinkPrice[temp];
						TotalPriceTF.setText(TotalPrice + "��");
						DrinkMinus[temp].setEnabled(true);
					}
				}
			});
		}
	}
}
