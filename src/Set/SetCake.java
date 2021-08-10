package Set;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class SetCake extends SetTWG {
	
	protected JButton CakeBtn[] = new JButton[ArrSize];

	public SetCake() {
		 try {											
    		 String path ="src/Txt/CakeImgPath.txt";		//이미지가 저장되어 있는 경로를 txt파일에서 읽어옴		 
    		 BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"));
    		 String line="";
    		 for(int i=0;(line=reader.readLine())!=null;i++) {
    			 CakeBtn[i] = new JButton();
    				ImageIcon ImageSetSize = new ImageIcon(line);
    				Image img = ImageSetSize.getImage();
    				Image img2 = img.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
    				CakeBtn[i].setIcon(new ImageIcon(img2));
    				CakeBtn[i].setBackground(Color.WHITE);
    				CakeBtn[i].setBorder(new LineBorder(Color.WHITE, 1));
    				panels[8].add(CakeBtn[i]);
    		 }
    		 reader.close();
  	    } catch (Exception e) {
  		e.getStackTrace();
  	    }
		CakeBtn[0].setBounds(60, 30, 170, 100);				//메뉴 버튼 위치 설정
		CakeBtn[1].setBounds(270, 30, 170, 100);
		CakeBtn[2].setBounds(480, 30, 170, 100);
		CakeBtn[3].setBounds(60, 200, 170, 100);
		CakeBtn[4].setBounds(270, 200, 170, 100);
		CakeBtn[5].setBounds(480, 200, 170, 100);
		CakeBtn[6].setBounds(60, 370, 170, 100);
		CakeBtn[7].setBounds(270, 370, 170, 100);
		CakeBtn[8].setBounds(480, 370, 170, 100);

		CakeBtn[0].setToolTipText(				//툴팁 작성
				"[티라미수] 마스카포네 치즈와 에스프레소 시럽으로 샌드 된 촉촉한 시트 위에 코코아 파우더를 올린 이탈리아 대표 무스 케이크  *계란,우유,대두,밀,돼지고기 함유");
		CakeBtn[1].setToolTipText(
				"[아이스박스] 마스카포네 크림 사이사이 블랙쿠키를 층층이 쌓고  촉촉하게 수분이 전이되어 부드럽게 즐길 수 있는  아메리칸 스타일의 케이크  *계란,우유,대두,밀 함유");
		CakeBtn[2].setToolTipText("[뉴욕 치즈] 부드럽고 촉촉한 식감과 진한 치즈 맛을 느낄 수 있는  뉴욕스타일의 구움 치즈케이크  *계란,우유,대두,밀,쇠고기 함유");
		CakeBtn[3].setToolTipText(
				"[스트로베리 초콜릿 생크림] 한가득 올린 상큼한 딸기, 크런치 초코볼이 알알이 씹히는  진한 초콜릿 생크림 시트가 조화를 이루는 디저트  ※매장 별로 딸기 외 대체 과일 데코레이션으로 운영 될 수 있습니다.  *계란,우유,대두,밀 함유");
		CakeBtn[4].setToolTipText(
				"[퀸즈 캐롯] 담백한 당근과 상큼한 오렌지 필로 식감을 살린 촉촉한  캐롯 시트와 묵직한 크림치즈를 풍성하게 레이어한  영국식 티 케이크  *계란,우유,대두,밀,호두, 쇠고기 함유");
		CakeBtn[5].setToolTipText(
				"[레드 벨벳] 붉은 컬러의 레드벨벳 4단 시트에 과일 데코레이션으로  상큼함을 더하고, 진한 크림치즈로 아이싱한 케이크  *계란,우유,대두,밀,아황산류,쇠고기 함유");
		CakeBtn[6].setToolTipText(
				"[트리플 초콜릿 무스] 다크, 밀크, 화이트 세 가지 초콜릿을 한 번에  즐길 수 있는  Triple Chocolate Layer 무스케이크  *계란,우유,대두,밀,돼지고기 함유");
		CakeBtn[7].setToolTipText(
				"[헤이즐넛 마스카포네 치즈] 담백한 뉴욕치즈 케이크 위에  진한 풍미의 헤이즐넛 가나슈를 레이어 하고, 헤이즐넛&#38;마스카포네 치즈 생크림을 풍성하게 올린 케이크  *계란,우유,대두,밀 함유");
		CakeBtn[8].setToolTipText("[초코 쉬폰] 초코파우더와 흰자거품으로 만든 초코시트에  생크림으로 장식하고 초코가루로 마무리한 제품  *계란,우유,대두,밀,복숭아 함유");
	}
}