package Init;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class InitLabel extends InitPanels {
	protected JLabel SecondLogo = new JLabel();
	protected JLabel FirstLogo = new JLabel();
	protected JLabel OrderHistory = new JLabel("주문 내역");
	protected JLabel TotalPrice = new JLabel("총 주문 금액");
	protected JLabel EatIn = new JLabel("Eat In");
	protected JLabel TakeOut = new JLabel("Take Out");

	protected String OrderArr[] = { "상품", "핫/아이스", "개수", "주문 금액" };
	protected JLabel OrderLabel[] = new JLabel[OrderArr.length];
	protected JLabel Advertising = new JLabel();
	protected JLabel WearingMask = new JLabel();

	public InitLabel() {									//라벨들을 초기화 하는 클래스 생성자
		ImageIcon ImageSetSize0 = new ImageIcon("src/image/마스크 착용.jpg");
		Image img0 = ImageSetSize0.getImage();
		Image img1 = img0.getScaledInstance(480, 300, Image.SCALE_SMOOTH);
		WearingMask.setIcon(new ImageIcon(img1));			//마스크 착용 이미지를 
		WearingMask.setOpaque(true);
		panels[4].add(WearingMask);							//panels[4]에 붙임
		WearingMask.setBounds(0, 0, 450, 150);

		Advertising.setHorizontalAlignment(JLabel.CENTER);	//광고판을 생성
		Advertising.setBackground(Color.WHITE);				//이미지 삽입은 Execution 클래스에서 함
		Advertising.setBorder(new LineBorder(Color.white, 1));
		Advertising.setOpaque(true);
		panels[12].add(Advertising);						//첫번째 화면을 나타내는 panels[12]에 붙임
		Advertising.setBounds(850, 10, 300, 300);

		EatIn.setHorizontalAlignment(JLabel.CENTER);		//첫번째 화면에 들어갈 Eat in 레이블 
		EatIn.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		EatIn.setOpaque(true);
		EatIn.setBackground(Color.WHITE);
		EatIn.setForeground(Color.BLACK);
		panels[12].add(EatIn);
		EatIn.setBounds(150, 350, 400, 50);

		TakeOut.setHorizontalAlignment(JLabel.CENTER);		//첫번째 화면에 들어갈 TakeOut 레이블
		TakeOut.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 40));
		TakeOut.setOpaque(true);
		TakeOut.setBackground(Color.WHITE);
		TakeOut.setForeground(Color.BLACK);
		panels[12].add(TakeOut);
		TakeOut.setBounds(650, 350, 400, 50);

		ImageIcon ImageSetSize1 = new ImageIcon("src/image/Twosome.jpg");	//첫번째 화면에 들어갈 투썸 로고
		Image img3 = ImageSetSize1.getImage();
		Image img4 = img3.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		FirstLogo.setIcon(new ImageIcon(img4));
		panels[12].add(FirstLogo);
		FirstLogo.setBounds(470, 20, 250, 250);

		ImageIcon ImageSetSize2 = new ImageIcon("src/image/TLogo.png");		//두번째 화면에 상단에 들어갈 투썸 로고
		Image img5 = ImageSetSize2.getImage();
		Image img6 = img5.getScaledInstance(500, 450, Image.SCALE_SMOOTH);
		SecondLogo.setIcon(new ImageIcon(img6));
		panels[1].add(SecondLogo);
		SecondLogo.setBounds(100, -160, 500, 450);
		
		
		OrderHistory.setHorizontalAlignment(JLabel.CENTER);					//주문 내역 레이블 
		OrderHistory.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 20));
		OrderHistory.setOpaque(true);
		OrderHistory.setBackground(Color.WHITE);
		OrderHistory.setForeground(Color.BLACK);
		panels[9].add(OrderHistory);
		OrderHistory.setBounds(0, 0, 480, 42);

		TotalPrice.setHorizontalAlignment(JLabel.CENTER);					//총 주문금액 레이블
		TotalPrice.setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 17));
		TotalPrice.setOpaque(true);
		TotalPrice.setBackground(Color.WHITE);
		TotalPrice.setForeground(Color.BLACK);
		panels[11].add(TotalPrice);
		TotalPrice.setBounds(0, 0, 240, 40);

		for (int i = 0; i < OrderArr.length; i++) {							//상품 ,핫/아이스, 개수, 주문 내역 레이블
			OrderLabel[i] = new JLabel(OrderArr[i]);
			OrderLabel[i].setHorizontalAlignment(JLabel.CENTER);
			OrderLabel[i].setFont(new Font("한컴 윤고딕 250", Font.PLAIN, 15));
			OrderLabel[i].setBorder(new LineBorder(Color.WHITE, 1));
			panels[10].add(OrderLabel[i]);
			OrderLabel[i].setBounds(0 + i * 120, 0, 120, 40);
		}
	}

}
