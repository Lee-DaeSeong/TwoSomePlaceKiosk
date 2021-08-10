package Set;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

import Init.InitCake;
public class SetButton extends InitCake {
	String OrderAndCancel[] = { "결제", "주문 취소" };
	protected JButton OrderAndCancelBtn[] = new JButton[OrderAndCancel.length];
	String Category[] = { "Espresso", "Drink", "TWG", "Cake" };
	protected JButton CategoryBtn[] = new JButton[Category.length];
	String InOutImg[] = { "src/image/JavaCoffee.jpg", "src/image/TakeOut.jpg" };
	protected JButton InOutBtn[] = new JButton[2];
	String GoBackImg = "src/image/back3.jpg";
	protected JButton GoBackBtn = new JButton();
	
	SetButton() {
		for (int i = 0; i < 2; i++) {				//Eat In, Take Out 버튼 세팅
			InOutBtn[i] = new JButton();		
			InOutBtn[i].setBackground(Color.WHITE);
			ImageIcon ImageSetSize = new ImageIcon(InOutImg[i]);
			Image img = ImageSetSize.getImage();
			Image img2 = img.getScaledInstance(400, 300, Image.SCALE_SMOOTH);	//이미지를 크기에 맞게 맞추는 과정
			InOutBtn[i].setIcon(new ImageIcon(img2));
			InOutBtn[i].setBorder(new LineBorder(Color.WHITE, 1));
			InOutBtn[i].setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
			panels[12].add(InOutBtn[i]);
		}
		InOutBtn[0].setBounds(150, 400, 400, 300);
		InOutBtn[1].setBounds(650, 400, 400, 300);
		for (int i = 0; i < 2; i++) {				//결제, 주문 취소 버튼 세팅
			OrderAndCancelBtn[i] = new JButton(OrderAndCancel[i]);
			OrderAndCancelBtn[i].setBackground(Color.WHITE);
			OrderAndCancelBtn[i].setForeground(Color.BLACK);
			OrderAndCancelBtn[i].setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
			OrderAndCancelBtn[i].setBorder(new LineBorder(Color.WHITE, 1));
			panels[3].add(OrderAndCancelBtn[i]);
		}
		OrderAndCancelBtn[0].setBounds(240, 0, 240, 60);
		OrderAndCancelBtn[1].setBounds(0, 0, 240, 60);
		
		GoBackBtn.setBackground(Color.WHITE);		//두번째 화면에서 뒤로가기 버튼
		ImageIcon ImageSetSize1 = new ImageIcon(GoBackImg);
		Image img1 = ImageSetSize1.getImage();
		Image img2 = img1.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		GoBackBtn.setIcon(new ImageIcon(img2));
		GoBackBtn.setBorder(new LineBorder(Color.WHITE, 1));
		GoBackBtn.setBounds(0,0,75,75);
		panels[1].add(GoBackBtn);
		
		for (int i = 0; i < 4; i++) {				//카테고리 버튼 세팅
			CategoryBtn[i] = new JButton(Category[i]);
			CategoryBtn[i].setBackground(Color.WHITE);
			CategoryBtn[i].setForeground(Color.BLACK);
			panels[1].add(CategoryBtn[i]);
			CategoryBtn[i].setBorder(new LineBorder(Color.WHITE, 1));
			CategoryBtn[i].setBounds(30 + 170 * i, 130, 140, 30);
		}
	}
}
