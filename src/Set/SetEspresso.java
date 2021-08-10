package Set;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

import Init.InitCake;

public class SetEspresso extends SetButton {

	protected JButton EspressoBtn[] = new JButton[ArrSize];
	public SetEspresso() {
		try {
    		 String path ="src/Txt/EspressoImgPath.txt";
    		 BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"));
    		 String line="";
    		 
    		 for(int i=0;(line=reader.readLine())!=null;i++) {
    			 EspressoBtn[i] = new JButton();
    				ImageIcon ImageSetSize = new ImageIcon(line);
    				Image img = ImageSetSize.getImage();
    				Image img2 = img.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
    				EspressoBtn[i].setIcon(new ImageIcon(img2));
    				EspressoBtn[i].setBackground(Color.WHITE);
    				EspressoBtn[i].setBorder(new LineBorder(Color.WHITE, 1));
    				panels[5].add(EspressoBtn[i]);
    		 }
    		 reader.close();
  	    } catch (Exception e) {
  		e.getStackTrace();
  	    }
	
		ToolTipManager m = ToolTipManager.sharedInstance();		//툴팁매니저 설정
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		EspressoBtn[0].setToolTipText(				//툴팁 작성
				"[에스프레소 싱글] 카라멜 향과 더불어 달콤쌉싸름한 맛을 느낄 수 있는 깊고 진한 풍미의 에스프레소 음료 ※ 카페인함량: 블랙 그라운드 72.45mg아로마노트 84.3mg 카페인함량은 매장별로 조금씩 다를 수 있습니다");
		EspressoBtn[1].setToolTipText(
				"[카페 아메리카노] 진하게 로스팅한 커피 원두에서 에스프레소를 추출하여 투썸 고유의 원두 풍미를 느낄 수 있는 에스프레소 음료 ※ 카페인함량: 블랙 그라운드 144.9mg/ 아로마 노트 168.6mg 카페인함량은 매장별로 조금씩 다를 수 있습니다");
		EspressoBtn[2].setToolTipText(
				"[아이스 카페 아메리카노] 진하게 로스팅한 커피 원두에서 에스프레소를 추출하여 시원한 얼음을 담아 산뜻하게 즐길 수 있는 깔끔한 스타일의 에스프레소 음료 ※ 카페인함량: 블랙 그라운드 144.9mg/ 아로마 노트 168.6mg 카페인함량은 매장별로 조금씩 다를 수 있습니다");
		EspressoBtn[3].setToolTipText(
				"[콜드브루] 커피 본연의 깊은 풍미와 단맛이 느껴지는 부드럽고 깔끔한 콜드브루 커피  ※ 카페인함량: 196mg 카페인함량은 매장별로 조금씩 다를 수 있습니다 ");
		EspressoBtn[4].setToolTipText("[콜드브루 라떼] 콜드브루와 우유가 어우러져 더욱 부드럽게 즐길 수 있는 콜드브루 라떼");
		EspressoBtn[5]
				.setToolTipText("[아이스 카라멜 마키아또] 잘 어우러진 바닐라 향과 우유, 에스프레소 샷 위에 카라멜 소스를 뿌려 시원하면서도 달콤하게 즐길 수 있는 에스프레소 음료");
		EspressoBtn[6].setToolTipText("[카페라떼] 풍부하고 진한 농도의 에스프레소와 스팀밀크 위에 부드러운 우유 거품을 살짝 올려준 에스프레소 음료");
		EspressoBtn[7].setToolTipText("[아이스 카페라떼] 풍부하고 진한 농도의 에스프레소와 시원한 우유가 어우러진 부드러운 에스프레소 음료");
		EspressoBtn[8].setToolTipText("[카푸치노] 풍부하고 진한 농도의 에스프레소 위에 스팀밀크와 부드럽고 풍부한 양의 우유거품을 올린 에스프레소 음료");
		EspressoBtn[0].setBounds(60, 30, 170, 100);				//메뉴 버튼 위치 설정
		EspressoBtn[1].setBounds(270, 30, 170, 100);
		EspressoBtn[2].setBounds(480, 30, 170, 100);
		EspressoBtn[3].setBounds(60, 200, 170, 100);
		EspressoBtn[4].setBounds(270, 200, 170, 100);
		EspressoBtn[5].setBounds(480, 200, 170, 100);
		EspressoBtn[6].setBounds(60, 370, 170, 100);
		EspressoBtn[7].setBounds(270, 370, 170, 100);
		EspressoBtn[8].setBounds(480, 370, 170, 100);

	}
}