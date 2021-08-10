package Click;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class ClickCake extends ClickTWG {
	protected JPanel CakeOrderPanel[] = new JPanel[9];
	protected JLabel CakeOrderMenuLabel[] = new JLabel[9];
	protected JLabel CakeOrderPriceLabel[] = new JLabel[9];
	protected JLabel CakeOrderTypeLabel[] = new JLabel[9];
	protected JTextField CakeOrderCountTF[] = new JTextField[9];
	protected JTextField CakeOrderPriceTF[] = new JTextField[9];
	protected JButton CakePlus[] = new JButton[9];
	protected JButton CakeMinus[] = new JButton[9];
	public int CakeOrderPrice[] = new int[9];
	public int CakeOrderCount[] = new int[9];

	public ClickCake() {
		for (int i = 0; i < 9; i++) {				//주문 내역에 추가될 버튼 ,텍스트 필드, 레이블 등 선언
			CakeOrderPanel[i] = new JPanel();
			CakeOrderMenuLabel[i] = new JLabel(CakeMenu[i]);
			CakeOrderPriceLabel[i] = new JLabel(CakePrice[i] + "원");
			CakeOrderTypeLabel[i] = new JLabel(CakeType[i]);
			CakeOrderCountTF[i] = new JTextField("1");
			CakeOrderCountTF[i].setBorder(new LineBorder(Color.WHITE, 1));
			CakeOrderPrice[i] = CakePrice[i];
			CakeOrderPriceTF[i] = new JTextField(CakeOrderPrice[i] + "원");
			CakeOrderPriceTF[i].setBorder(new LineBorder(Color.WHITE, 1));
			CakeOrderCount[i] = 1;
			CakePlus[i] = new JButton("+");
			CakeMinus[i] = new JButton("-");
			CakePlus[i].setBackground(Color.WHITE);
			CakePlus[i].setForeground(Color.BLACK);
			CakeMinus[i].setBackground(Color.WHITE);
			CakeMinus[i].setForeground(Color.BLACK);
			CakePlus[i].setBorder(new LineBorder(Color.WHITE, 1));
			CakeMinus[i].setBorder(new LineBorder(Color.WHITE, 1));
			CakeOrderMenuLabel[i].setHorizontalAlignment(JButton.CENTER);
			CakeOrderPriceLabel[i].setHorizontalAlignment(JButton.CENTER);
			CakeOrderPriceTF[i].setHorizontalAlignment(JButton.CENTER);
			CakePlus[i].setHorizontalAlignment(JButton.CENTER);
			CakeMinus[i].setHorizontalAlignment(JButton.CENTER);
			CakeOrderCountTF[i].setHorizontalAlignment(JButton.CENTER);
			MenuClicked(CakeBtn[i], CakeOrderPanel[i], CakeOrderMenuLabel[i], CakeOrderPriceLabel[i],
					CakeOrderTypeLabel[i],CakeOrderPriceTF[i], CakeOrderCountTF[i], CakePlus[i], CakeMinus[i]);
		}
	}
}
