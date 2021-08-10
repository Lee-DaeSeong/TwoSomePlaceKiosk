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
   		 String path ="src/Txt/DrinkImgPath.txt";				//�̹����� ����Ǿ� �ִ� ��θ� txt���Ͽ��� �о��
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
		DrinkBtn[0].setBounds(60, 30, 170, 100);				//�޴� ��ư ��ġ ����
		DrinkBtn[1].setBounds(270, 30, 170, 100);
		DrinkBtn[2].setBounds(480, 30, 170, 100);
		DrinkBtn[3].setBounds(60, 200, 170, 100);
		DrinkBtn[4].setBounds(270, 200, 170, 100);
		DrinkBtn[5].setBounds(480, 200, 170, 100);
		DrinkBtn[6].setBounds(60, 370, 170, 100);
		DrinkBtn[7].setBounds(270, 370, 170, 100);
		DrinkBtn[8].setBounds(480, 370, 170, 100);
																//���� �ۼ�
		DrinkBtn[0].setToolTipText("[��纣�� ���Ʈ �帵ũ] ��� ���� ��纣�� ǳ�̿� ���Ʈ�� ��ȭ�� ���� �� �ִ� ����	");
		DrinkBtn[1].setToolTipText("[�÷��� ���Ʈ �帵ũ] ���Ʈ�� ���� ǳ�̸� ��� �� �ִ� ����");
		DrinkBtn[2].setToolTipText("[�ξ� ��ũƼ ����ũ] ������ ��׷��� ���� ������ ��Ƽ�� ���� ����Ʈ ���̽�ũ���� ��췯�� ���� ���̽�ũ�� ����Ʈ ����");
		DrinkBtn[3].setToolTipText("[��Ʈ�κ��� ��ġ ������] ����� �������� ��ŭ���� ��ȭ�Ӱ� ��췯�� ������ Ÿ�� ����");
		DrinkBtn[4].setToolTipText("[���� ���� ������] ���ֻ� ������ ���� ������ ��ȭ�ο� �����̾� ���� ������  �ؾ˷����� ����: ���� ����");
		DrinkBtn[5].setToolTipText(
				"[ī��� Ŀ�� ������] Ŀ�� �����信 ������ ī��� �÷��� �����ϰ�, �� ���� ����ũ���� ī��� �ҽ��� �����Ͽ� ǳ���� ī��� ���� ���� �� �ִ� ������");
		DrinkBtn[6].setToolTipText("[���� ��] ������ ��°�� ���Ƴ־� �������� ����ִ� ���� ��");
		DrinkBtn[7].setToolTipText("[����� �� ��] �� ���� �Ͼ� ���� �����Ű�� ���־��� ������ �� ����");
		DrinkBtn[8].setToolTipText("[���̽� �� ��] ����� ���� ǳ�̿� �ε巯�� ������ ��ȭ�Ӱ� ��췯���� �� ��");
	}
}