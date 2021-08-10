package Click;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class ClickDrink extends ClickEspresso {
	protected JPanel DrinkOrderPanel[] = new JPanel[9];
	protected JLabel DrinkOrderMenuLabel[] = new JLabel[9];
	protected JLabel DrinkOrderPriceLabel[] = new JLabel[9];
	protected JLabel DrinkOrderTypeLabel[] = new JLabel[9];
	protected JTextField DrinkOrderCountTF[] = new JTextField[9];
	protected JTextField DrinkOrderPriceTF[] = new JTextField[9];
	protected JButton DrinkPlus[] = new JButton[9];
	protected JButton DrinkMinus[] = new JButton[9];
	public int DrinkOrderPrice[] = new int[9];
	public int DrinkOrderCount[] = new int[9];

	public ClickDrink() {
		for (int i = 0; i < 9; i++) {							//주문 내역에 추가될 버튼 ,텍스트 필드, 레이블 등 선언
			DrinkOrderPanel[i] = new JPanel();
			DrinkOrderMenuLabel[i] = new JLabel(DrinkMenu[i]);
			DrinkOrderPriceLabel[i] = new JLabel(DrinkPrice[i] + "원");
			DrinkOrderTypeLabel[i] = new JLabel(DrinkType[i]);
			DrinkOrderCountTF[i] = new JTextField("1");
			DrinkOrderCountTF[i].setBorder(new LineBorder(Color.WHITE, 1));
			DrinkOrderPrice[i] = DrinkPrice[i];
			DrinkOrderPriceTF[i] = new JTextField(DrinkOrderPrice[i] + "원");
			DrinkOrderPriceTF[i].setBorder(new LineBorder(Color.WHITE, 1));
			DrinkOrderCount[i] = 1;
			DrinkPlus[i] = new JButton("+");
			DrinkMinus[i] = new JButton("-");
			DrinkPlus[i].setBackground(Color.WHITE);
			DrinkPlus[i].setForeground(Color.BLACK);
			DrinkMinus[i].setBackground(Color.WHITE);
			DrinkMinus[i].setForeground(Color.BLACK);
			DrinkPlus[i].setBorder(new LineBorder(Color.WHITE, 1));
			DrinkMinus[i].setBorder(new LineBorder(Color.WHITE, 1));
			DrinkOrderMenuLabel[i].setHorizontalAlignment(JButton.CENTER);
			DrinkOrderPriceLabel[i].setHorizontalAlignment(JButton.CENTER);
			DrinkOrderPriceTF[i].setHorizontalAlignment(JButton.CENTER);
			DrinkPlus[i].setHorizontalAlignment(JButton.CENTER);
			DrinkMinus[i].setHorizontalAlignment(JButton.CENTER);
			DrinkOrderCountTF[i].setHorizontalAlignment(JButton.CENTER);
			MenuClicked(DrinkBtn[i], DrinkOrderPanel[i], DrinkOrderMenuLabel[i], DrinkOrderPriceLabel[i],
					DrinkOrderTypeLabel[i],DrinkOrderPriceTF[i], DrinkOrderCountTF[i], DrinkPlus[i], DrinkMinus[i]);
		}
	}
}
