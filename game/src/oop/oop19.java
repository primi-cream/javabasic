package oop;

import java.util.Scanner;

// 반복적으로 사용자에게 질문을 던지는 코드 (반복문 + Scanner) 응용
// 금융관련 코드를 작성

// 총 입금 금액 10만
// 출금 총 3번 진행 출금 메세지 : "출금하실 금액을 입력하세요: "
// 해당 출금 후 잔액을 표시하는 코드를 작성
// 단, 총 입금 금액보다 클 경우 다음과 같이 메세지를 출력
// "잔액보다 큰 금액으로 출금되지 않습니다."
public class oop19 {

	public static void main(String[] args) {
		oop19_bank bank = new oop19_bank();
		bank.abc();

	}

}


class oop19_bank{

	public void abc() {
		Scanner sc = new Scanner(System.in);
		int deposit = 100000;
		for(int i=0; i<3; i++) {
			System.out.print("출금하실 금액을 입력 : ");
			int w = sc.nextInt();
			if(w>deposit) {
				System.out.println("잔액보다 큰 금액으로 출금되지 않습니다.");
			} else {
				deposit-=w;
				System.out.println(w + "원이 출금되었습니다. 잔액은 " + deposit + "원 입니다.");
			}
		}
		sc.close();
	}
	
}