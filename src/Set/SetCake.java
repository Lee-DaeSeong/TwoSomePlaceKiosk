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
    		 String path ="src/Txt/CakeImgPath.txt";		//�̹����� ����Ǿ� �ִ� ��θ� txt���Ͽ��� �о��		 
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
		CakeBtn[0].setBounds(60, 30, 170, 100);				//�޴� ��ư ��ġ ����
		CakeBtn[1].setBounds(270, 30, 170, 100);
		CakeBtn[2].setBounds(480, 30, 170, 100);
		CakeBtn[3].setBounds(60, 200, 170, 100);
		CakeBtn[4].setBounds(270, 200, 170, 100);
		CakeBtn[5].setBounds(480, 200, 170, 100);
		CakeBtn[6].setBounds(60, 370, 170, 100);
		CakeBtn[7].setBounds(270, 370, 170, 100);
		CakeBtn[8].setBounds(480, 370, 170, 100);

		CakeBtn[0].setToolTipText(				//���� �ۼ�
				"[Ƽ��̼�] ����ī���� ġ��� ���������� �÷����� ���� �� ������ ��Ʈ ���� ���ھ� �Ŀ���� �ø� ��Ż���� ��ǥ ���� ����ũ  *���,����,���,��,������� ����");
		CakeBtn[1].setToolTipText(
				"[���̽��ڽ�] ����ī���� ũ�� ���̻��� ����Ű�� ������ �װ�  �����ϰ� ������ ���̵Ǿ� �ε巴�� ��� �� �ִ�  �Ƹ޸�ĭ ��Ÿ���� ����ũ  *���,����,���,�� ����");
		CakeBtn[2].setToolTipText("[���� ġ��] �ε巴�� ������ �İ��� ���� ġ�� ���� ���� �� �ִ�  ���彺Ÿ���� ���� ġ������ũ  *���,����,���,��,���� ����");
		CakeBtn[3].setToolTipText(
				"[��Ʈ�κ��� ���ݸ� ��ũ��] �Ѱ��� �ø� ��ŭ�� ����, ũ��ġ ���ں��� �˾��� ������  ���� ���ݸ� ��ũ�� ��Ʈ�� ��ȭ�� �̷�� ����Ʈ  �ظ��� ���� ���� �� ��ü ���� ���ڷ��̼����� � �� �� �ֽ��ϴ�.  *���,����,���,�� ����");
		CakeBtn[4].setToolTipText(
				"[���� ĳ��] ����� ��ٰ� ��ŭ�� ������ �ʷ� �İ��� �츰 ������  ĳ�� ��Ʈ�� ������ ũ��ġ� ǳ���ϰ� ���̾���  ������ Ƽ ����ũ  *���,����,���,��,ȣ��, ���� ����");
		CakeBtn[5].setToolTipText(
				"[���� ����] ���� �÷��� ���座�� 4�� ��Ʈ�� ���� ���ڷ��̼�����  ��ŭ���� ���ϰ�, ���� ũ��ġ��� ���̽��� ����ũ  *���,����,���,��,��Ȳ���,���� ����");
		CakeBtn[6].setToolTipText(
				"[Ʈ���� ���ݸ� ����] ��ũ, ��ũ, ȭ��Ʈ �� ���� ���ݸ��� �� ����  ��� �� �ִ�  Triple Chocolate Layer ��������ũ  *���,����,���,��,������� ����");
		CakeBtn[7].setToolTipText(
				"[������� ����ī���� ġ��] ����� ����ġ�� ����ũ ����  ���� ǳ���� ������� �������� ���̾� �ϰ�, �������&#38;����ī���� ġ�� ��ũ���� ǳ���ϰ� �ø� ����ũ  *���,����,���,�� ����");
		CakeBtn[8].setToolTipText("[���� ����] �����Ŀ���� ���ڰ�ǰ���� ���� ���ڽ�Ʈ��  ��ũ������ ����ϰ� ���ڰ���� �������� ��ǰ  *���,����,���,��,������ ����");
	}
}