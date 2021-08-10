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
	protected ImageIcon CardPaymentIcon = new ImageIcon("src/image/결제.gif");
	String[] Card_Cash_Cancel = { "카드 결제", "현금 결제", "결제 취소" };
	String[] Yes_No = { "예", "아니요" };

	public ClickButton() {
		GoBackBtn.addActionListener(new ActionListener() { // 뒤로가기 버튼 ActionListener 작성
			public void actionPerformed(ActionEvent e) {
				int confirm0 = JOptionPane.showConfirmDialog(null, "처음 화면으로 가시겠습니까?", "GoBack Message",
						JOptionPane.YES_NO_OPTION);
				if (confirm0 == 0) {
					for (int i = 1; i < panels.length - 1; i++)
						panels[i].setVisible(false);//두번째 화면을 보이지 않게하고
					panels[12].setVisible(true);	//첫번째 화면이 보이게 함
					Reset();				//주문내역 초기화
				}
			}
		});
		CategoryBtn[0].addActionListener(new ActionListener() { // Espresso 버튼 클릭
			public void actionPerformed(ActionEvent e) {
				panels[5].setVisible(true);						// Espresso패널만 보이게 하고  
				panels[6].setVisible(false);					// 나머지 패널은 setVisible(false)
				panels[7].setVisible(false);
				panels[8].setVisible(false);
			}
		});
		CategoryBtn[1].addActionListener(new ActionListener() {	// Drink 버튼 클릭
			public void actionPerformed(ActionEvent e) {
				panels[6].setVisible(true);						// Drink 패널만 보이게 하고
				panels[5].setVisible(false);					// 나머지 패널은 setVisible(false)
				panels[7].setVisible(false);
				panels[8].setVisible(false);
			}
		});
		CategoryBtn[2].addActionListener(new ActionListener() {	// TWG 버튼 클릭
			public void actionPerformed(ActionEvent e) {
				panels[7].setVisible(true);						// TWG 패널만 보이게 하고
				panels[5].setVisible(false);					// 나머지 패널은 setVisible(false)
				panels[6].setVisible(false);
				panels[8].setVisible(false);
			}
		});
		CategoryBtn[3].addActionListener(new ActionListener() {	// Cake 버튼 클릭
			public void actionPerformed(ActionEvent e) {
				panels[8].setVisible(true);						// Cake 패널만 보이게 하고
				panels[5].setVisible(false);					// 나머지 패널은 setVisible(false)
				panels[6].setVisible(false);
				panels[7].setVisible(false);
			}
		});

		InOutBtn[0].addActionListener(new ActionListener() {	// EatIn 버튼 클릭
			public void actionPerformed(ActionEvent e) {		// 다이얼로그 출력후
				int confirm1 = JOptionPane.showConfirmDialog(null, "매장에서 드시고 가시겠습니까?", "Eat In Message",
						JOptionPane.YES_NO_OPTION);
				if (confirm1 == JOptionPane.YES_OPTION) {		// 사용자 Yes 클릭시 
					panels[12].setVisible(false);				// panels[12] (첫 번째 화면) 보이지 않게하고
					Visible(panels);							// 두번째 화면으로 전환하는 Visible메소드 실행 
					In_Out = 0;									// 테이크 아웃 손님과 구별하기 위해 In_Out 변수에 0 저장
				}
			}
		});
		InOutBtn[1].addActionListener(new ActionListener() {	// Take Out 버튼 클릭
			public void actionPerformed(ActionEvent e) {		// 다이얼로그 출력 후
				int confirm2 = JOptionPane.showConfirmDialog(null, "Take Out 하시겠습니까? \n<Take Out시 10%할인>",
						"TakeOut Message", JOptionPane.YES_NO_OPTION);
				if (confirm2 == JOptionPane.YES_OPTION) {		// 사용자 Yes 클릭시
					panels[12].setVisible(false);				// panels[12] (첫 번째 화면) 보이지 않게하고
					Visible(panels);							// 두번째 화면으로 전환하는 Visible메소드 실행 
					In_Out = 1;									// In_Out 변수에 1 저장
				}												// In_Out==0 이면 Eat In, 
			}													// In_Out==1 이면 Take Out
		});
		OrderAndCancelBtn[0].addActionListener(new ActionListener() {//결제 버튼 클릭
			public void actionPerformed(ActionEvent e) {
				if (TotalPrice != 0) {							//총 주문 금액이 0이 아니면 결제 실행
					int Card_Cash_Cancel_Slected = JOptionPane.showOptionDialog(null, "결제 수단을 선택해주세요.",
							"Payment Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
							Card_Cash_Cancel, Card_Cash_Cancel[0]);	//결제 수단 선택 다이얼로그 띄움
					if (Card_Cash_Cancel_Slected == 2)
						JOptionPane.showMessageDialog(null, "결제를 취소합니다."); // 결제 취소 버튼이라면 다이얼로그 띄움
					else if (Card_Cash_Cancel_Slected == 0) {		// 카드 결제 선택
						if (In_Out == 0) {							// 카드 결제 + Eat In 손님 이면 
							int option1 = JOptionPane.showOptionDialog(null, TotalPrice + "원을 결제 하시겠습니까?",
									"Payment Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
									Yes_No, Yes_No[0]);				// 결제 확인하는 다이얼 로그 
							if (option1 == 0) {						// Yes 옵션 선택 
								JOptionPane.showMessageDialog(null, "", "Card Payment", JOptionPane.INFORMATION_MESSAGE,
										CardPaymentIcon);			//카드 결제 gif 띄우고
								JOptionPane.showMessageDialog(null, TotalPrice + "결제 되었습니다", "Payment Finished",
										JOptionPane.INFORMATION_MESSAGE, null);	//결제 완료 되었다는 다이얼로그
								System.exit(0);						//프로그램 종료
							}

						} 
						else if (In_Out == 1) {					// 카드 결제 + 테이크 아웃 손님 이라면 
							int Sale_Total_Price = TotalPrice - (TotalPrice / 10);	//10% 할인
							int option1 = JOptionPane.showOptionDialog(null,
									"\t           10% 할인을 받은\n" + Sale_Total_Price + "원에 결제 진행하시겠습니까?",
									"Payment Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
									Yes_No, Yes_No[0]);				//10% 할인된 가격에 결제 하겠냐는 다이얼로그
							if (option1 == 0) {						//Yes 옵션 선택
								JOptionPane.showMessageDialog(null, "", "Card Payment", JOptionPane.INFORMATION_MESSAGE,
										CardPaymentIcon);			//카드 결제 gif 띄우고
								JOptionPane.showMessageDialog(null, Sale_Total_Price + "결제 되었습니다", "Payment Finished",
										JOptionPane.INFORMATION_MESSAGE, null);	//결제 완료 되었다는 다이얼로그
								System.exit(0);						//프로그램 종료

							}

						}
					} 
					else if (Card_Cash_Cancel_Slected == 1) {		// 현금 결제 선택
						if (In_Out == 0) {							// 현금 결제 + Eat In 손님
							int option1 = JOptionPane.showOptionDialog(null, TotalPrice + "원을 결제 하시겠습니까?",
									"Payment Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
									Yes_No, Yes_No[0]);				//결제 확인 다이얼 로그
							if (option1 == 0) {						//Yes옵션이면 
								JOptionPane.showInputDialog("현금영수증을 발행 할 번호를 입력하세요"); //현금 영수증 번호 입력 받음
								JOptionPane.showMessageDialog(null, TotalPrice + "결제 되었습니다", "Payment Finished",
										JOptionPane.INFORMATION_MESSAGE, null);	//결제 완료 다이얼로그
								System.exit(0);						//프로그램 종료
							}

						} else if (In_Out == 1) {					// 현금결제 + Take Out 손님
							int Sale_Total_Price = TotalPrice - (TotalPrice / 10);	//10% 할인
							int option1 = JOptionPane.showOptionDialog(null,		//10% 할인된 가격에 결제 하겠냐는 다이얼로그
									"\t           10% 할인을 받은\n" + Sale_Total_Price + "원에 결제 하시겠습니까?", "Payment Confirm",
									JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, Yes_No, Yes_No[0]);
							if (option1 == 0) {					 	//Yes 옵션이면
								JOptionPane.showInputDialog("현금영수증을 발행 할 번호를 입력하세요");	//현금 영수증 번호 입력 받음
								JOptionPane.showMessageDialog(null, Sale_Total_Price + "결제 되었습니다", "Payment Finished",
										JOptionPane.INFORMATION_MESSAGE, null);	//결제 완료 다이얼로그
								System.exit(0);						//프로그램 종료
							}

						}
					}
				} 
				else {												//0원이면 결제 불가 다이얼로그 
					JOptionPane.showMessageDialog(null, "메뉴를 선택하세요", "0원 결제 불가", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		OrderAndCancelBtn[1].addActionListener(new ActionListener() {// 주문 취소 버튼 클릭시
			public void actionPerformed(ActionEvent e) {			//다이얼로그 띄움
				int result = JOptionPane.showConfirmDialog(null, "모든 주문을 취소하시겠습니까?", "Order Cancel Ckeck",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {				//Yes 옵션이면
					Reset();										//주문 내역 초기화하는 Reset메소드 실행
				}
			}

		});
	}

	public void Visible(JPanel[] panels) {			//첫번째 화면에서 두번째 화면으로 넘어가는 메소드
		for (int i = 0; i < 6; i++) {
			panels[i].setVisible(true);				// panels[5](Espresso 패널) 보이게함
		}
		panels[6].setVisible(false);				// Drink, TWG, Cake 패널은 보이지 않게함
		panels[7].setVisible(false);
		panels[8].setVisible(false);
		panels[9].setVisible(true);
		panels[10].setVisible(true);
		panels[11].setVisible(true);

	}

	public void Reset() {								//모든 주문내역 초기화하는 메소드
		panels[2].removeAll();
		TotalPrice = 0;
		TotalPriceTF.setText(TotalPrice + "원");
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
			EspressoOrderPriceTF[i].setText(EspressoOrderPrice[i] + "원");
			DrinkOrderCount[i] = 1;
			DrinkOrderCountTF[i].setText(DrinkOrderCount[i] + "");
			DrinkOrderPrice[i] = 0;
			DrinkOrderPrice[i] += DrinkPrice[i];
			DrinkOrderPriceTF[i].setText(DrinkOrderPrice[i] + "원");
			TwgOrderCount[i] = 1;
			TwgOrderCountTF[i].setText(TwgOrderCount[i] + "");
			TwgOrderPrice[i] = 0;
			TwgOrderPrice[i] += TwgPrice[i];
			TwgOrderPriceTF[i].setText(TwgOrderPrice[i] + "원");
			CakeOrderCount[i] = 1;
			CakeOrderCountTF[i].setText(CakeOrderCount[i] + "");
			CakeOrderPrice[i] = 0;
			CakeOrderPrice[i] += CakePrice[i];
			CakeOrderPriceTF[i].setText(CakeOrderPrice[i] + "원");
		}
		panels[2].repaint();
	}

}