package Click;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import Click.ClickCake;

import java.util.*;
import Init.InitEspresso;
import PlusMinusButton.*;

public class ClickButton extends ClickCake {
	public static int In_Out = 0;
	protected ImageIcon CardPaymentIcon = new ImageIcon("src/image/����.gif");
	String[] Card_Cash_Cancel = { "ī�� ����", "���� ����", "���� ���" };
	String[] Yes_No = { "��", "�ƴϿ�" };

	public ClickButton() {
		GoBackBtn.addActionListener(new ActionListener() { // �ڷΰ��� ��ư ActionListener �ۼ�
			public void actionPerformed(ActionEvent e) {
				int confirm0 = JOptionPane.showConfirmDialog(null, "ó�� ȭ������ ���ðڽ��ϱ�?", "GoBack Message",
						JOptionPane.YES_NO_OPTION);
				if (confirm0 == 0) {
					for (int i = 1; i < panels.length - 1; i++)
						panels[i].setVisible(false);//�ι�° ȭ���� ������ �ʰ��ϰ�
					panels[12].setVisible(true);	//ù��° ȭ���� ���̰� ��
					Reset();				//�ֹ����� �ʱ�ȭ
				}
			}
		});
		CategoryBtn[0].addActionListener(new ActionListener() { // Espresso ��ư Ŭ��
			public void actionPerformed(ActionEvent e) {
				panels[5].setVisible(true);						// Espresso�гθ� ���̰� �ϰ�  
				panels[6].setVisible(false);					// ������ �г��� setVisible(false)
				panels[7].setVisible(false);
				panels[8].setVisible(false);
			}
		});
		CategoryBtn[1].addActionListener(new ActionListener() {	// Drink ��ư Ŭ��
			public void actionPerformed(ActionEvent e) {
				panels[6].setVisible(true);						// Drink �гθ� ���̰� �ϰ�
				panels[5].setVisible(false);					// ������ �г��� setVisible(false)
				panels[7].setVisible(false);
				panels[8].setVisible(false);
			}
		});
		CategoryBtn[2].addActionListener(new ActionListener() {	// TWG ��ư Ŭ��
			public void actionPerformed(ActionEvent e) {
				panels[7].setVisible(true);						// TWG �гθ� ���̰� �ϰ�
				panels[5].setVisible(false);					// ������ �г��� setVisible(false)
				panels[6].setVisible(false);
				panels[8].setVisible(false);
			}
		});
		CategoryBtn[3].addActionListener(new ActionListener() {	// Cake ��ư Ŭ��
			public void actionPerformed(ActionEvent e) {
				panels[8].setVisible(true);						// Cake �гθ� ���̰� �ϰ�
				panels[5].setVisible(false);					// ������ �г��� setVisible(false)
				panels[6].setVisible(false);
				panels[7].setVisible(false);
			}
		});

		InOutBtn[0].addActionListener(new ActionListener() {	// EatIn ��ư Ŭ��
			public void actionPerformed(ActionEvent e) {		// ���̾�α� �����
				int confirm1 = JOptionPane.showConfirmDialog(null, "���忡�� ��ð� ���ðڽ��ϱ�?", "Eat In Message",
						JOptionPane.YES_NO_OPTION);
				if (confirm1 == JOptionPane.YES_OPTION) {		// ����� Yes Ŭ���� 
					panels[12].setVisible(false);				// panels[12] (ù ��° ȭ��) ������ �ʰ��ϰ�
					Visible(panels);							// �ι�° ȭ������ ��ȯ�ϴ� Visible�޼ҵ� ���� 
					In_Out = 0;									// ����ũ �ƿ� �մ԰� �����ϱ� ���� In_Out ������ 0 ����
				}
			}
		});
		InOutBtn[1].addActionListener(new ActionListener() {	// Take Out ��ư Ŭ��
			public void actionPerformed(ActionEvent e) {		// ���̾�α� ��� ��
				int confirm2 = JOptionPane.showConfirmDialog(null, "Take Out �Ͻðڽ��ϱ�? \n<Take Out�� 10%����>",
						"TakeOut Message", JOptionPane.YES_NO_OPTION);
				if (confirm2 == JOptionPane.YES_OPTION) {		// ����� Yes Ŭ����
					panels[12].setVisible(false);				// panels[12] (ù ��° ȭ��) ������ �ʰ��ϰ�
					Visible(panels);							// �ι�° ȭ������ ��ȯ�ϴ� Visible�޼ҵ� ���� 
					In_Out = 1;									// In_Out ������ 1 ����
				}												// In_Out==0 �̸� Eat In, 
			}													// In_Out==1 �̸� Take Out
		});
		OrderAndCancelBtn[0].addActionListener(new ActionListener() {//���� ��ư Ŭ��
			public void actionPerformed(ActionEvent e) {
				if (TotalPrice != 0) {							//�� �ֹ� �ݾ��� 0�� �ƴϸ� ���� ����
					int Card_Cash_Cancel_Slected = JOptionPane.showOptionDialog(null, "���� ������ �������ּ���.",
							"Payment Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
							Card_Cash_Cancel, Card_Cash_Cancel[0]);	//���� ���� ���� ���̾�α� ���
					if (Card_Cash_Cancel_Slected == 2)
						JOptionPane.showMessageDialog(null, "������ ����մϴ�."); // ���� ��� ��ư�̶�� ���̾�α� ���
					else if (Card_Cash_Cancel_Slected == 0) {		// ī�� ���� ����
						if (In_Out == 0) {							// ī�� ���� + Eat In �մ� �̸� 
							int option1 = JOptionPane.showOptionDialog(null, TotalPrice + "���� ���� �Ͻðڽ��ϱ�?",
									"Payment Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
									Yes_No, Yes_No[0]);				// ���� Ȯ���ϴ� ���̾� �α� 
							if (option1 == 0) {						// Yes �ɼ� ���� 
								JOptionPane.showMessageDialog(null, "", "Card Payment", JOptionPane.INFORMATION_MESSAGE,
										CardPaymentIcon);			//ī�� ���� gif ����
								JOptionPane.showMessageDialog(null, TotalPrice + "���� �Ǿ����ϴ�", "Payment Finished",
										JOptionPane.INFORMATION_MESSAGE, null);	//���� �Ϸ� �Ǿ��ٴ� ���̾�α�
								System.exit(0);						//���α׷� ����
							}

						} 
						else if (In_Out == 1) {					// ī�� ���� + ����ũ �ƿ� �մ� �̶�� 
							int Sale_Total_Price = TotalPrice - (TotalPrice / 10);	//10% ����
							int option1 = JOptionPane.showOptionDialog(null,
									"\t           10% ������ ����\n" + Sale_Total_Price + "���� ���� �����Ͻðڽ��ϱ�?",
									"Payment Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
									Yes_No, Yes_No[0]);				//10% ���ε� ���ݿ� ���� �ϰڳĴ� ���̾�α�
							if (option1 == 0) {						//Yes �ɼ� ����
								JOptionPane.showMessageDialog(null, "", "Card Payment", JOptionPane.INFORMATION_MESSAGE,
										CardPaymentIcon);			//ī�� ���� gif ����
								JOptionPane.showMessageDialog(null, Sale_Total_Price + "���� �Ǿ����ϴ�", "Payment Finished",
										JOptionPane.INFORMATION_MESSAGE, null);	//���� �Ϸ� �Ǿ��ٴ� ���̾�α�
								System.exit(0);						//���α׷� ����

							}

						}
					} 
					else if (Card_Cash_Cancel_Slected == 1) {		// ���� ���� ����
						if (In_Out == 0) {							// ���� ���� + Eat In �մ�
							int option1 = JOptionPane.showOptionDialog(null, TotalPrice + "���� ���� �Ͻðڽ��ϱ�?",
									"Payment Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
									Yes_No, Yes_No[0]);				//���� Ȯ�� ���̾� �α�
							if (option1 == 0) {						//Yes�ɼ��̸� 
								JOptionPane.showInputDialog("���ݿ������� ���� �� ��ȣ�� �Է��ϼ���"); //���� ������ ��ȣ �Է� ����
								JOptionPane.showMessageDialog(null, TotalPrice + "���� �Ǿ����ϴ�", "Payment Finished",
										JOptionPane.INFORMATION_MESSAGE, null);	//���� �Ϸ� ���̾�α�
								System.exit(0);						//���α׷� ����
							}

						} else if (In_Out == 1) {					// ���ݰ��� + Take Out �մ�
							int Sale_Total_Price = TotalPrice - (TotalPrice / 10);	//10% ����
							int option1 = JOptionPane.showOptionDialog(null,		//10% ���ε� ���ݿ� ���� �ϰڳĴ� ���̾�α�
									"\t           10% ������ ����\n" + Sale_Total_Price + "���� ���� �Ͻðڽ��ϱ�?", "Payment Confirm",
									JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, Yes_No, Yes_No[0]);
							if (option1 == 0) {					 	//Yes �ɼ��̸�
								JOptionPane.showInputDialog("���ݿ������� ���� �� ��ȣ�� �Է��ϼ���");	//���� ������ ��ȣ �Է� ����
								JOptionPane.showMessageDialog(null, Sale_Total_Price + "���� �Ǿ����ϴ�", "Payment Finished",
										JOptionPane.INFORMATION_MESSAGE, null);	//���� �Ϸ� ���̾�α�
								System.exit(0);						//���α׷� ����
							}

						}
					}
				} 
				else {												//0���̸� ���� �Ұ� ���̾�α� 
					JOptionPane.showMessageDialog(null, "�޴��� �����ϼ���", "0�� ���� �Ұ�", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		OrderAndCancelBtn[1].addActionListener(new ActionListener() {// �ֹ� ��� ��ư Ŭ����
			public void actionPerformed(ActionEvent e) {			//���̾�α� ���
				int result = JOptionPane.showConfirmDialog(null, "��� �ֹ��� ����Ͻðڽ��ϱ�?", "Order Cancel Ckeck",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {				//Yes �ɼ��̸�
					Reset();										//�ֹ� ���� �ʱ�ȭ�ϴ� Reset�޼ҵ� ����
				}
			}

		});
	}

	public void Visible(JPanel[] panels) {			//ù��° ȭ�鿡�� �ι�° ȭ������ �Ѿ�� �޼ҵ�
		for (int i = 0; i < 6; i++) {
			panels[i].setVisible(true);				// panels[5](Espresso �г�) ���̰���
		}
		panels[6].setVisible(false);				// Drink, TWG, Cake �г��� ������ �ʰ���
		panels[7].setVisible(false);
		panels[8].setVisible(false);
		panels[9].setVisible(true);
		panels[10].setVisible(true);
		panels[11].setVisible(true);

	}

	public void Reset() {								//��� �ֹ����� �ʱ�ȭ�ϴ� �޼ҵ�
		panels[2].removeAll();
		TotalPrice = 0;
		TotalPriceTF.setText(TotalPrice + "��");
		Interval = 0;
		OrderCount = 0;
		for (int i = 0; i < 9; i++) {			
			CheckNull[i] = 0;
			EspressoBtn[i].setEnabled(true);
			DrinkBtn[i].setEnabled(true);
			TwgBtn[i].setEnabled(true);
			CakeBtn[i].setEnabled(true);
			EspressoOrderCount[i] = 1;
			EspressoOrderCountTF[i].setText(EspressoOrderCount[i] + "");
			EspressoOrderPrice[i] = 0;
			EspressoOrderPrice[i] += EspressoPrice[i];
			EspressoOrderPriceTF[i].setText(EspressoOrderPrice[i] + "��");
			DrinkOrderCount[i] = 1;
			DrinkOrderCountTF[i].setText(DrinkOrderCount[i] + "");
			DrinkOrderPrice[i] = 0;
			DrinkOrderPrice[i] += DrinkPrice[i];
			DrinkOrderPriceTF[i].setText(DrinkOrderPrice[i] + "��");
			TwgOrderCount[i] = 1;
			TwgOrderCountTF[i].setText(TwgOrderCount[i] + "");
			TwgOrderPrice[i] = 0;
			TwgOrderPrice[i] += TwgPrice[i];
			TwgOrderPriceTF[i].setText(TwgOrderPrice[i] + "��");
			CakeOrderCount[i] = 1;
			CakeOrderCountTF[i].setText(CakeOrderCount[i] + "");
			CakeOrderPrice[i] = 0;
			CakeOrderPrice[i] += CakePrice[i];
			CakeOrderPriceTF[i].setText(CakeOrderPrice[i] + "��");
		}
		panels[2].repaint();
	}

}