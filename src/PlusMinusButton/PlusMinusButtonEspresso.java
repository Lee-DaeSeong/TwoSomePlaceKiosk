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
				public void actionPerformed(ActionEvent e) { // - ��ư ������ �� ActionListner ����
					if (EspressoOrderCount[temp] > 0) {
						EspressoOrderCount[temp] = EspressoOrderCount[temp] - 1;
						EspressoOrderCountTF[temp].setText(EspressoOrderCount[temp] + "");
						EspressoOrderPrice[temp] -= EspressoPrice[temp];
						EspressoOrderPriceTF[temp].setText(EspressoOrderPrice[temp] + "��");
						TotalPrice -= EspressoPrice[temp];
						TotalPriceTF.setText(TotalPrice + "��");
						EspressoPlus[temp].setEnabled(true);
						OrderCount--;
					} else if (EspressoOrderCount[temp] == 0) { // Count�� 0�� �� - ��ư ������ ��
						JButton jb = (JButton) e.getSource();
						panels[2].remove(jb.getParent()); // �ش� �޴� �ֹ� �������� ����
						EspressoBtn[temp].setEnabled(true);
						Interval = (jb.getParent().getY()) / 40;
						CheckNull[Interval] = 0;
						EspressoOrderCount[temp]++;
						EspressoOrderCountTF[temp].setText(EspressoOrderCount[temp] + "");
						EspressoOrderPrice[temp] += EspressoPrice[temp];
						EspressoOrderPriceTF[temp].setText(EspressoOrderPrice[temp] + "��");
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
			EspressoPlus[temp].addActionListener(new ActionListener() { // + ��ư ������ �� ActionListener ����
				public void actionPerformed(ActionEvent e) {
					if (EspressoOrderCount[temp] < 100) { // Count 100�� ���� ����
						EspressoOrderCount[temp] = EspressoOrderCount[temp] + 1;
						EspressoOrderCountTF[temp].setText(EspressoOrderCount[temp] + "");
						EspressoOrderPrice[temp] += EspressoPrice[temp];
						EspressoOrderPriceTF[temp].setText(EspressoOrderPrice[temp] + "��");
						TotalPrice += EspressoPrice[temp];
						TotalPriceTF.setText(TotalPrice + "��");
						EspressoMinus[temp].setEnabled(true);
					}
				}
			});
		}
	}
}