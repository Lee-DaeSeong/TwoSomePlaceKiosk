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
	
		ToolTipManager m = ToolTipManager.sharedInstance();		//�����Ŵ��� ����
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		EspressoBtn[0].setToolTipText(				//���� �ۼ�
				"[���������� �̱�] ī��� ��� ���Ҿ� ���޽Խθ��� ���� ���� �� �ִ� ��� ���� ǳ���� ���������� ���� �� ī�����Է�: �� �׶��� 72.45mg�Ʒθ���Ʈ 84.3mg ī�����Է��� ���庰�� ���ݾ� �ٸ� �� �ֽ��ϴ�");
		EspressoBtn[1].setToolTipText(
				"[ī�� �Ƹ޸�ī��] ���ϰ� �ν����� Ŀ�� ���ο��� ���������Ҹ� �����Ͽ� ���� ������ ���� ǳ�̸� ���� �� �ִ� ���������� ���� �� ī�����Է�: �� �׶��� 144.9mg/ �Ʒθ� ��Ʈ 168.6mg ī�����Է��� ���庰�� ���ݾ� �ٸ� �� �ֽ��ϴ�");
		EspressoBtn[2].setToolTipText(
				"[���̽� ī�� �Ƹ޸�ī��] ���ϰ� �ν����� Ŀ�� ���ο��� ���������Ҹ� �����Ͽ� �ÿ��� ������ ��� ����ϰ� ��� �� �ִ� ����� ��Ÿ���� ���������� ���� �� ī�����Է�: �� �׶��� 144.9mg/ �Ʒθ� ��Ʈ 168.6mg ī�����Է��� ���庰�� ���ݾ� �ٸ� �� �ֽ��ϴ�");
		EspressoBtn[3].setToolTipText(
				"[�ݵ���] Ŀ�� ������ ���� ǳ�̿� �ܸ��� �������� �ε巴�� ����� �ݵ��� Ŀ��  �� ī�����Է�: 196mg ī�����Է��� ���庰�� ���ݾ� �ٸ� �� �ֽ��ϴ� ");
		EspressoBtn[4].setToolTipText("[�ݵ��� ��] �ݵ���� ������ ��췯�� ���� �ε巴�� ��� �� �ִ� �ݵ��� ��");
		EspressoBtn[5]
				.setToolTipText("[���̽� ī��� ��Ű�ƶ�] �� ��췯�� �ٴҶ� ��� ����, ���������� �� ���� ī��� �ҽ��� �ѷ� �ÿ��ϸ鼭�� �����ϰ� ��� �� �ִ� ���������� ����");
		EspressoBtn[6].setToolTipText("[ī���] ǳ���ϰ� ���� ���� ���������ҿ� ������ũ ���� �ε巯�� ���� ��ǰ�� ��¦ �÷��� ���������� ����");
		EspressoBtn[7].setToolTipText("[���̽� ī���] ǳ���ϰ� ���� ���� ���������ҿ� �ÿ��� ������ ��췯�� �ε巯�� ���������� ����");
		EspressoBtn[8].setToolTipText("[īǪġ��] ǳ���ϰ� ���� ���� ���������� ���� ������ũ�� �ε巴�� ǳ���� ���� ������ǰ�� �ø� ���������� ����");
		EspressoBtn[0].setBounds(60, 30, 170, 100);				//�޴� ��ư ��ġ ����
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