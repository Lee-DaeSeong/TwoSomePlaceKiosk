package Click;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class ClickTWG extends ClickDrink {
	protected JPanel TwgOrderPanel[] = new JPanel[9];
	protected JLabel TwgOrderMenuLabel[] = new JLabel[9];
	protected JLabel TwgOrderPriceLabel[] = new JLabel[9];
	protected JLabel TwgOrderTypeLabel [] = new JLabel[9];
	protected JTextField TwgOrderCountTF[] = new JTextField[9];
	protected JTextField TwgOrderPriceTF[] = new JTextField[9];
	protected JButton TwgPlus[] = new JButton[9];
	protected JButton TwgMinus[] = new JButton[9];
	public int TwgOrderPrice[] = new int[9];
	public int TwgOrderCount[] = new int[9];

	public ClickTWG() {
		for (int i = 0; i < 9; i++) {						//주문 내역에 추가될 버튼 ,텍스트 필드, 레이블 등 선언
			TwgOrderPanel[i] = new JPanel();
			TwgOrderMenuLabel[i] = new JLabel(TwgMenu[i]);
			TwgOrderPriceLabel[i] = new JLabel(TwgPrice[i] + "원");
			TwgOrderTypeLabel[i] = new JLabel(TwgType[i]);
			TwgOrderCountTF[i] = new JTextField("1");
			TwgOrderCountTF[i].setBorder(new LineBorder(Color.WHITE, 1));
			TwgOrderPrice[i] = TwgPrice[i];
			TwgOrderPriceTF[i] = new JTextField(TwgOrderPrice[i] + "원");
			TwgOrderPriceTF[i].setBorder(new LineBorder(Color.WHITE, 1));
			TwgOrderCount[i] = 1;
			TwgPlus[i] = new JButton("+");
			TwgMinus[i] = new JButton("-");
			TwgPlus[i].setBackground(Color.WHITE);
			TwgPlus[i].setForeground(Color.BLACK);
			TwgMinus[i].setBackground(Color.WHITE);
			TwgMinus[i].setForeground(Color.BLACK);
			TwgPlus[i].setBorder(new LineBorder(Color.WHITE, 1));
			TwgMinus[i].setBorder(new LineBorder(Color.WHITE, 1));
			TwgOrderMenuLabel[i].setHorizontalAlignment(JButton.CENTER);
			TwgOrderPriceLabel[i].setHorizontalAlignment(JButton.CENTER);
			TwgOrderPriceTF[i].setHorizontalAlignment(JButton.CENTER);
			TwgPlus[i].setHorizontalAlignment(JButton.CENTER);
			TwgMinus[i].setHorizontalAlignment(JButton.CENTER);
			TwgOrderCountTF[i].setHorizontalAlignment(JButton.CENTER);
			MenuClicked(TwgBtn[i], TwgOrderPanel[i], TwgOrderMenuLabel[i], TwgOrderPriceLabel[i], TwgOrderTypeLabel[i],TwgOrderPriceTF[i],
					TwgOrderCountTF[i], TwgPlus[i], TwgMinus[i]);
		}
	}
}
