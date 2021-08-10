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
			panels[i] = new JPanel();				//��� ����
		}

		c.add(panels[0]);	//���� ���
		panels[0].setBounds(0, 0, 1224, 800);
		panels[0].setPreferredSize(new Dimension(1224, 800));
		panels[0].setLayout(null);
		panels[0].setBackground(Color.WHITE);
		panels[0].setBorder(new LineBorder(Color.WHITE, 4));
		
		panels[1].setBounds(10, 10, 700, 180);	//(�ι�° ȭ�� �ΰ� + ī�װ�)
		panels[2].setBounds(720, 92, 480, 380);	//�ֹ����� �߰��Ǵ� ����
		panels[3].setBounds(720, 690, 480, 60);	//�ֹ��ּ� / ����
		panels[4].setBounds(720, 520, 480, 160);//����ũ ����� �̹���
		panels[5].setBounds(10, 200, 700, 550);	//����������
		panels[6].setBounds(10, 200, 700, 550);	//�帵ũ
		panels[7].setBounds(10, 200, 700, 550);	//Twg
		panels[8].setBounds(10, 200, 700, 550);	//����ũ
		panels[9].setBounds(720, 10, 480, 42);	//�ֹ�����
		panels[10].setBounds(720, 52, 480, 40);	//��ǰ��, ����, ����, �հ�
		panels[11].setBounds(720, 475, 480, 40);//�� �ֹ� �ݾ�
		panels[12].setBounds(10, 10, 1190, 740);//ù ȭ��
		
		
		for (int i = 1; i < panels.length - 1; i++)		//panels[12]�� ù ȭ�� �̹Ƿ�
			panels[i].setVisible(false);				//������ �гε��� ������ �ʰ�
		panels[12].setVisible(true);					//panels[12]�� ���̰�
		for (int i = 1; i < panels.length; i++) {		//�г� ���� ���� 
			panels[0].add(panels[i]);
			panels[i].setLayout(null);
			panels[i].setBackground(Color.WHITE);
			panels[i].setBorder(new LineBorder(Color.WHITE, 1));
		}
	}
	
}