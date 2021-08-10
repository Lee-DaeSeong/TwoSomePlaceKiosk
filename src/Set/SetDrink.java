package Set;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class SetDrink extends SetEspresso {

	protected JButton DrinkBtn[] = new JButton[ArrSize];

	public SetDrink() {
		try {
   		 String path ="src/Txt/DrinkImgPath.txt";				//이미지가 저장되어 있는 경로를 txt파일에서 읽어옴
   		 BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"));
   		 String line="";
   		 for(int i=0;(line=reader.readLine())!=null;i++) {
   			DrinkBtn[i] = new JButton();
   				ImageIcon ImageSetSize = new ImageIcon(line);
   				Image img = ImageSetSize.getImage();
   				Image img2 = img.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
   				DrinkBtn[i].setIcon(new ImageIcon(img2));
   				DrinkBtn[i].setBackground(Color.WHITE);
   				DrinkBtn[i].setBorder(new LineBorder(Color.WHITE, 1));
   				panels[6].add(DrinkBtn[i]);
   		 }
   		 reader.close();
 	    } catch (Exception e) {
 		e.getStackTrace();
 	    }
		DrinkBtn[0].setBounds(60, 30, 170, 100);				//메뉴 버튼 위치 설정
		DrinkBtn[1].setBounds(270, 30, 170, 100);
		DrinkBtn[2].setBounds(480, 30, 170, 100);
		DrinkBtn[3].setBounds(60, 200, 170, 100);
		DrinkBtn[4].setBounds(270, 200, 170, 100);
		DrinkBtn[5].setBounds(480, 200, 170, 100);
		DrinkBtn[6].setBounds(60, 370, 170, 100);
		DrinkBtn[7].setBounds(270, 370, 170, 100);
		DrinkBtn[8].setBounds(480, 370, 170, 100);
																//툴팁 작성
		DrinkBtn[0].setToolTipText("[블루베리 요거트 드링크] 깊고 진한 블루베리 풍미와 요거트의 조화를 느낄 수 있는 음료	");
		DrinkBtn[1].setToolTipText("[플레인 요거트 드링크] 요거트의 깊은 풍미를 즐길 수 있는 음료");
		DrinkBtn[2].setToolTipText("[로얄 밀크티 쉐이크] 은은한 얼그레이 향이 감도는 블랙티와 진한 소프트 아이스크림이 어우러진 투썸 아이스크림 디저트 음료");
		DrinkBtn[3].setToolTipText("[스트로베리 피치 프라페] 딸기와 복숭아의 상큼함이 조화롭게 어우러진 스무디 타입 음료");
		DrinkBtn[4].setToolTipText("[제주 말차 프라페] 제주산 말차와 연유 블렌딩이 조화로운 프리미엄 말차 프라페  ※알레르기 정보: 우유 함유");
		DrinkBtn[5].setToolTipText(
				"[카라멜 커피 프라페] 커피 프라페에 달콤한 카라멜 시럽을 가미하고, 그 위에 휘핑크림과 카라멜 소스로 토핑하여 풍부한 카라멜 향을 느낄 수 있는 프라페");
		DrinkBtn[6].setToolTipText("[고구마 라떼] 고구마를 통째로 갈아넣어 원물감이 살아있는 리얼 라떼");
		DrinkBtn[7].setToolTipText("[몽블랑 밤 라떼] 눈 덮인 하얀 산을 연상시키는 비주얼의 달콤한 밤 음료");
		DrinkBtn[8].setToolTipText("[아이스 쑥 라떼] 향긋한 쑥의 풍미와 부드러운 우유가 조화롭게 어우러지는 쑥 라떼");
	}
}