package Init;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import Start.start;

public class InitPanels extends start {
	protected static JPanel panels[] = new JPanel[13];

	public InitPanels() {
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();				//페널 생성
		}

		c.add(panels[0]);	//메인 페널
		panels[0].setBounds(0, 0, 1224, 800);
		panels[0].setPreferredSize(new Dimension(1224, 800));
		panels[0].setLayout(null);
		panels[0].setBackground(Color.WHITE);
		panels[0].setBorder(new LineBorder(Color.WHITE, 4));
		
		panels[1].setBounds(10, 10, 700, 180);	//(두번째 화면 로고 + 카테고리)
		panels[2].setBounds(720, 92, 480, 380);	//주문내역 추가되는 공간
		panels[3].setBounds(720, 690, 480, 60);	//주문최소 / 결제
		panels[4].setBounds(720, 520, 480, 160);//마스크 쓰라는 이미지
		panels[5].setBounds(10, 200, 700, 550);	//에스프레소
		panels[6].setBounds(10, 200, 700, 550);	//드링크
		panels[7].setBounds(10, 200, 700, 550);	//Twg
		panels[8].setBounds(10, 200, 700, 550);	//케이크
		panels[9].setBounds(720, 10, 480, 42);	//주문내역
		panels[10].setBounds(720, 52, 480, 40);	//제품명, 가격, 개수, 합계
		panels[11].setBounds(720, 475, 480, 40);//총 주문 금액
		panels[12].setBounds(10, 10, 1190, 740);//첫 화면
		
		
		for (int i = 1; i < panels.length - 1; i++)		//panels[12]가 첫 화면 이므로
			panels[i].setVisible(false);				//나머지 패널들은 보이지 않게
		panels[12].setVisible(true);					//panels[12]는 보이게
		for (int i = 1; i < panels.length; i++) {		//패널 세팅 과정 
			panels[0].add(panels[i]);
			panels[i].setLayout(null);
			panels[i].setBackground(Color.WHITE);
			panels[i].setBorder(new LineBorder(Color.WHITE, 1));
		}
	}
	
}