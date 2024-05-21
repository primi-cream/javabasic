package oop;

import java.util.Scanner;

// 선택문 switch ~ case
public class switch1 {

	public static void main(String[] args) {
		int ck = 2; // 선택한 값이며, 자료형에 따라 switch case의 자료형이 정해집니다.
		switch(ck) {
		// 멀티 case 사용법
			case 1:
			case 5:	
				System.out.println("1번을 선택하셨습니다.");
				break;
			
			case 2:
				System.out.println("2번을 선택하셨습니다.");
				break;
				
			default:  // case에 선택사항이 없을 경우 default가 작동
				System.out.println("기타를 선택하셨습니다.");
				break;
		}
		
		/*
		 * Scanner를 이용하여 다음과 같은 프로세서를 작성하시오.
		 * "상품을 결제하실 항목을 선택해 주세요 : "
		 *  1~3 선택
		 *  1 : "신용카드로 결제 합니다."
		 *  2 : "휴대폰으로 결제 합니다."
		 *  3 : "무통장입금 결제 합니다."
		 *  그 외 기타 : "결제를 취소합니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품을 결제하실 항목을 선택 : ");
		int ch = sc.nextInt();
		
		switch(ch) {
			case 1:
				System.out.println("신용카드로 결제합니다.");
				break;
			case 2:
				System.out.println("휴대폰으로 결제합니다.");
				break;
			case 3:
				System.out.println("무통장입금 결제합니다.");
				break;
			default:
				System.out.println("결제를 취소합니다.");
				break;
		}
		
		sc.close();
	}

}
