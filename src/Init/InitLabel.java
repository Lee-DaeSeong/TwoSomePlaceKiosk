package Init;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class InitLabel extends InitPanels {
	protected JLabel SecondLogo = new JLabel();
	protected JLabel FirstLogo = new JLabel();
	protected JLabel OrderHistory = new JLabel("�ֹ� ����");
	protected JLabel TotalPrice = new JLabel("�� �ֹ� �ݾ�");
	protected JLabel EatIn = new JLabel("Eat In");
	protected JLabel TakeOut = new JLabel("Take Out");

	protected String OrderArr[] = { "��ǰ", "��/���̽�", "����", "�ֹ� �ݾ�" };
	protected JLabel OrderLabel[] = new JLabel[OrderArr.length];
	protected JLabel Advertising = new JLabel();
	protected JLabel WearingMask = new JLabel();

	public InitLabel() {									//�󺧵��� �ʱ�ȭ �ϴ� Ŭ���� ������
		ImageIcon ImageSetSize0 = new ImageIcon("src/image/����ũ ����.jpg");
		Image img0 = ImageSetSize0.getImage();
		Image img1 = img0.getScaledInstance(480, 300, Image.SCALE_SMOOTH);
		WearingMask.setIcon(new ImageIcon(img1));			//����ũ ���� �̹����� 
		WearingMask.setOpaque(true);
		panels[4].add(WearingMask);							//panels[4]�� ����
		WearingMask.setBounds(0, 0, 450, 150);

		Advertising.setHorizontalAlignment(JLabel.CENTER);	//�������� ����
		Advertising.setBackground(Color.WHITE);				//�̹��� ������ Execution Ŭ�������� ��
		Advertising.setBorder(new LineBorder(Color.white, 1));
		Advertising.setOpaque(true);
		panels[12].add(Advertising);						//ù��° ȭ���� ��Ÿ���� panels[12]�� ����
		Advertising.setBounds(850, 10, 300, 300);

		EatIn.setHorizontalAlignment(JLabel.CENTER);		//ù��° ȭ�鿡 �� Eat in ���̺� 
		EatIn.setFont(new Font("���� ����� 250", Font.PLAIN, 40));
		EatIn.setOpaque(true);
		EatIn.setBackground(Color.WHITE);
		EatIn.setForeground(Color.BLACK);
		panels[12].add(EatIn);
		EatIn.setBounds(150, 350, 400, 50);

		TakeOut.setHorizontalAlignment(JLabel.CENTER);		//ù��° ȭ�鿡 �� TakeOut ���̺�
		TakeOut.setFont(new Font("���� ����� 250", Font.PLAIN, 40));
		TakeOut.setOpaque(true);
		TakeOut.setBackground(Color.WHITE);
		TakeOut.setForeground(Color.BLACK);
		panels[12].add(TakeOut);
		TakeOut.setBounds(650, 350, 400, 50);

		ImageIcon ImageSetSize1 = new ImageIcon("src/image/Twosome.jpg");	//ù��° ȭ�鿡 �� ���� �ΰ�
		Image img3 = ImageSetSize1.getImage();
		Image img4 = img3.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		FirstLogo.setIcon(new ImageIcon(img4));
		panels[12].add(FirstLogo);
		FirstLogo.setBounds(470, 20, 250, 250);

		ImageIcon ImageSetSize2 = new ImageIcon("src/image/TLogo.png");		//�ι�° ȭ�鿡 ��ܿ� �� ���� �ΰ�
		Image img5 = ImageSetSize2.getImage();
		Image img6 = img5.getScaledInstance(500, 450, Image.SCALE_SMOOTH);
		SecondLogo.setIcon(new ImageIcon(img6));
		panels[1].add(SecondLogo);
		SecondLogo.setBounds(100, -160, 500, 450);
		
		
		OrderHistory.setHorizontalAlignment(JLabel.CENTER);					//�ֹ� ���� ���̺� 
		OrderHistory.setFont(new Font("���� ����� 250", Font.PLAIN, 20));
		OrderHistory.setOpaque(true);
		OrderHistory.setBackground(Color.WHITE);
		OrderHistory.setForeground(Color.BLACK);
		panels[9].add(OrderHistory);
		OrderHistory.setBounds(0, 0, 480, 42);

		TotalPrice.setHorizontalAlignment(JLabel.CENTER);					//�� �ֹ��ݾ� ���̺�
		TotalPrice.setFont(new Font("���� ����� 250", Font.PLAIN, 17));
		TotalPrice.setOpaque(true);
		TotalPrice.setBackground(Color.WHITE);
		TotalPrice.setForeground(Color.BLACK);
		panels[11].add(TotalPrice);
		TotalPrice.setBounds(0, 0, 240, 40);

		for (int i = 0; i < OrderArr.length; i++) {							//��ǰ ,��/���̽�, ����, �ֹ� ���� ���̺�
			OrderLabel[i] = new JLabel(OrderArr[i]);
			OrderLabel[i].setHorizontalAlignment(JLabel.CENTER);
			OrderLabel[i].setFont(new Font("���� ����� 250", Font.PLAIN, 15));
			OrderLabel[i].setBorder(new LineBorder(Color.WHITE, 1));
			panels[10].add(OrderLabel[i]);
			OrderLabel[i].setBounds(0 + i * 120, 0, 120, 40);
		}
	}

}
