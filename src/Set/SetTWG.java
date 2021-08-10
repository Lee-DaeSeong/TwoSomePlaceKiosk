package Set;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class SetTWG extends SetDrink {
	protected JButton TwgBtn[] = new JButton[ArrSize];

	public SetTWG() {
		 try {
    		 String path ="src/Txt/TwgImgPath.txt";					//이미지가 저장되어 있는 경로를 txt파일에서 읽어옴
    		 BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"));
    		 String line="";
    		 
    		 for(int i=0;(line=reader.readLine())!=null;i++) {
    			 TwgBtn[i] = new JButton();
    				ImageIcon ImageSetSize = new ImageIcon(line);
    				Image img = ImageSetSize.getImage();
    				Image img2 = img.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
    				TwgBtn[i].setIcon(new ImageIcon(img2));
    				TwgBtn[i].setBackground(Color.WHITE);
    				TwgBtn[i].setBorder(new LineBorder(Color.WHITE, 1));
    				panels[7].add(TwgBtn[i]);
    		 }
    		 reader.close();
  	    } catch (Exception e) {
  		e.getStackTrace();
  	    }
		TwgBtn[0].setBounds(60, 30, 170, 100);
		TwgBtn[1].setBounds(270, 30, 170, 100);
		TwgBtn[2].setBounds(480, 30, 170, 100);
		TwgBtn[3].setBounds(60, 200, 170, 100);
		TwgBtn[4].setBounds(270, 200, 170, 100);
		TwgBtn[5].setBounds(480, 200, 170, 100);
		TwgBtn[6].setBounds(60, 370, 170, 100);
		TwgBtn[7].setBounds(270, 370, 170, 100);
		TwgBtn[8].setBounds(480, 370, 170, 100);

		TwgBtn[0].setToolTipText("[아이스 레몬그라스 진저 티] 은은한 생강의 향이 레몬청, 허브티백과 함께 블렌딩 된 티");
		TwgBtn[1].setToolTipText("[레몬그라스 진저 티] 은은한 생강의 향이 레몬청, 허브티백과 함께 블렌딩 된 티");
		TwgBtn[2].setToolTipText("[허니레몬티] 진한 TWG 프렌치 얼그레이 베이스에 달콤한 꿀과 상큼한 레몬이 더해진 티");
		TwgBtn[3].setToolTipText("[아이스 애플민트티] TWG 그나와 민트티와 애플이 어우러진 베리에이션 티");
		TwgBtn[4].setToolTipText("[애플민트티] TWG 그나와 민트티와 애플이 어우러진 베리에이션 티");
		TwgBtn[5].setToolTipText("[아이스 그나와 민트티] 홍차, 녹차, 민트가 블렌딩 된 청량한 타입의 TWG 티");
		TwgBtn[6].setToolTipText("[그나와 민트티] 홍차, 녹차, 민트가 블렌딩 된 청량한 타입의 TWG 티");
		TwgBtn[7].setToolTipText("[카모마일] 카페인이 없어 누구나 편안하게 즐길 수 있는 허브티로 풍부한 벌꿀향과 황금빛이 특징인 Tea");
		TwgBtn[8].setToolTipText("[크림 카라멜] 남아프리카 공화국의 루이보스 차에 달콤한 카라멜을 블렌딩하여 매력적이고 섬세함을 지닌 Tea");
	}
}