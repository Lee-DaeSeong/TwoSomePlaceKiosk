package Click;

import java.awt.*;	
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import Set.SetCake;

public class ClickEspresso extends SetCake {
	public int[] CheckNull = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };	//주문 내역에 해당 라인에 자리가 있는지 없는지 나타내는 배열
	public JPanel TempPanel = new JPanel();
	public JPanel tpanel = new JPanel();
	public int Interval = 0;
	public int TotalPrice = 0;
	public JPanel EspressoOrderPanel[] = new JPanel[9];
	public JLabel EspressoOrderMenuLabel[] = new JLabel[9];
	public JLabel EspressoOrderPriceLabel[] = new JLabel[9];
	public JLabel EspressoOrderTypeLabel[] = new JLabel[9];
	public JTextField EspressoOrderCountTF[] = new JTextField[9];
	public JTextField EspressoOrderPriceTF[] = new JTextField[9];
	public JTextField TotalPriceTF = new JTextField("0 원");
	public JButton EspressoPlus[] = new JButton[9];
	public JButton EspressoMinus[] = new JButton[9];
	public int EspressoOrderPrice[] = new int[9];
	public int EspressoOrderCount[] = new int[9];
	public int OrderCount=0;
	public ClickEspresso() {
		panels[11].add(TotalPriceTF);
		TotalPriceTF.setHorizontalAlignment(JButton.CENTER);
		TotalPriceTF.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
		TotalPriceTF.setBounds(240, 0, 240, 40);
		TotalPriceTF.setBorder(new LineBorder(Color.WHITE, 1));
		
		for (int i = 0; i < 9; i++) {						//주문 내역에 추가될 버튼 ,텍스트 필드, 레이블 등 선언
			EspressoOrderPanel[i] = new JPanel();
			EspressoOrderMenuLabel[i] = new JLabel(EspressoMenu[i]);
			EspressoOrderPriceLabel[i] = new JLabel(EspressoPrice[i]+"원");
			EspressoOrderTypeLabel[i] = new JLabel(EspressoType[i]);
			EspressoOrderCount[i] = 1;
			EspressoOrderCountTF[i] = new JTextField("1");
			EspressoOrderCountTF[i].setBorder(new LineBorder(Color.WHITE, 1));
			EspressoOrderPrice[i] = EspressoPrice[i];
			EspressoOrderPriceTF[i] = new JTextField(EspressoOrderPrice[i] + "원");
			EspressoOrderPriceTF[i].setBorder(new LineBorder(Color.WHITE, 1));
			EspressoPlus[i] = new JButton("+");
			EspressoMinus[i] = new JButton("-");
			EspressoPlus[i].setBackground(Color.WHITE);
			EspressoPlus[i].setForeground(Color.BLACK);
			EspressoMinus[i].setBackground(Color.WHITE);
			EspressoMinus[i].setForeground(Color.BLACK);
			EspressoPlus[i].setBorder(new LineBorder(Color.WHITE, 1));
			EspressoMinus[i].setBorder(new LineBorder(Color.WHITE, 1));
			EspressoOrderMenuLabel[i].setHorizontalAlignment(JButton.CENTER);
			EspressoOrderPriceLabel[i].setHorizontalAlignment(JButton.CENTER);
			EspressoOrderPriceTF[i].setHorizontalAlignment(JButton.CENTER);
			EspressoPlus[i].setHorizontalAlignment(JButton.CENTER);
			EspressoMinus[i].setHorizontalAlignment(JButton.CENTER);
			EspressoOrderCountTF[i].setHorizontalAlignment(JButton.CENTER);
			MenuClicked(EspressoBtn[i], EspressoOrderPanel[i], EspressoOrderMenuLabel[i], EspressoOrderPriceLabel[i],
					EspressoOrderTypeLabel[i],EspressoOrderPriceTF[i], EspressoOrderCountTF[i], EspressoPlus[i], EspressoMinus[i]);
		}
	}

	public void MenuClicked(JButton btn, JPanel OrderPanel, JLabel OrderMenuLabel, JLabel OrderPriceLabel, JLabel OrderTypeLabel,
			JTextField OrderPriceTF, JTextField OrderCountTF, JButton Plus, JButton Minus) {
		btn.addActionListener(new ActionListener() {			// 버튼마다  ActionListener 추가 
			public void actionPerformed(ActionEvent e) {
				if(OrderCount>=9) {								// 주문 개수가 9개 이상이면 9개 이상 선택 불가하다는 다이얼로그 띄움
					JOptionPane.showMessageDialog(null,"메뉴 9개 이상 선택 불가","Message",JOptionPane.ERROR_MESSAGE);
				}
				if (OrderCount<9){								//  주문개수가 9개 이하이면 주문내역에 추가 함		
					TotalPrice += Integer.parseInt(OrderPriceLabel.getText().replace("원", ""));
					TotalPriceTF.setText(TotalPrice + "원");
					OrderPanel.setLayout(null);
					OrderPanel.setBackground(Color.WHITE);
					OrderPanel.add(OrderMenuLabel);
					OrderPanel.add(OrderTypeLabel);
					OrderPanel.add(OrderPriceTF);
					OrderPanel.add(Plus);
					OrderPanel.add(Minus);
					OrderPanel.add(OrderCountTF);
					panels[2].add(OrderPanel);
					OrderMenuLabel.setBounds(0, 0, 116, 30);
					OrderTypeLabel.setBounds(165, 0, 116, 30);
					OrderPriceTF.setBounds(360, 0, 120, 30);
					Minus.setBounds(240, 0, 40, 30);
					OrderCountTF.setBounds(280, 0, 40, 30);
					Plus.setBounds(320, 0, 40, 30);
					OrderMenuLabel.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 15));
					OrderTypeLabel.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 15));
					Plus.setFont(new Font("한컴 윤고딕 250", Font.BOLD, 8));
					Minus.setFont(new Font("한컴 윤고딕 250", Font.BOLD, 8));
					OrderCountTF.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 15));
					OrderPriceTF.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 15));
					OrderPanel.setVisible(true);
				
					for (int i = 0; i < 9; i++) {			//주문 내역이 추가될 위치를 설정하는 과정
						if (CheckNull[i] == 0) {			//CheckNull 배열을 통하여 빈 자리에 추가함 
							OrderPanel.setBounds(4, i * 40, 480, 40);	//위치 설정
							CheckNull[i] = 1;				//CheckNull[i] 를 1로 설정 (0이면 빈자리, 1이면 빈자리 x)
							OrderPanel.setName(i+"");
							Interval = i;					
							panels[2].repaint();
							break;
						}
					}
					btn.setEnabled(false);					//해당 메뉴 선택되지 않게함
					OrderCount++;
				}
			}
		});
	}
}