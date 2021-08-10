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
    		 String path ="src/Txt/TwgImgPath.txt";					//�̹����� ����Ǿ� �ִ� ��θ� txt���Ͽ��� �о��
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

		TwgBtn[0].setToolTipText("[���̽� ����׶� ���� Ƽ] ������ ������ ���� ����û, ���Ƽ��� �Բ� ���� �� Ƽ");
		TwgBtn[1].setToolTipText("[����׶� ���� Ƽ] ������ ������ ���� ����û, ���Ƽ��� �Բ� ���� �� Ƽ");
		TwgBtn[2].setToolTipText("[��Ϸ���Ƽ] ���� TWG ����ġ ��׷��� ���̽��� ������ �ܰ� ��ŭ�� ������ ������ Ƽ");
		TwgBtn[3].setToolTipText("[���̽� ���ù�ƮƼ] TWG �׳��� ��ƮƼ�� ������ ��췯�� �������̼� Ƽ");
		TwgBtn[4].setToolTipText("[���ù�ƮƼ] TWG �׳��� ��ƮƼ�� ������ ��췯�� �������̼� Ƽ");
		TwgBtn[5].setToolTipText("[���̽� �׳��� ��ƮƼ] ȫ��, ����, ��Ʈ�� ���� �� û���� Ÿ���� TWG Ƽ");
		TwgBtn[6].setToolTipText("[�׳��� ��ƮƼ] ȫ��, ����, ��Ʈ�� ���� �� û���� Ÿ���� TWG Ƽ");
		TwgBtn[7].setToolTipText("[ī����] ī������ ���� ������ ����ϰ� ��� �� �ִ� ���Ƽ�� ǳ���� ������� Ȳ�ݺ��� Ư¡�� Tea");
		TwgBtn[8].setToolTipText("[ũ�� ī���] ��������ī ��ȭ���� ���̺��� ���� ������ ī����� �����Ͽ� �ŷ����̰� �������� ���� Tea");
	}
}