package oop2;

import java.util.Scanner;

// inter3,4 연계작업
public class bank {
	public static void main(String[] args) {
		allbank ab = new allbank();

		Scanner sc = new Scanner(System.in);
		System.out.println("1. 국민은행, 2. 신한은행 은행을 선택해 주세요 : ");
		Integer bankno = sc.nextInt();
		switch(bankno) {
			case 1:	// 국민
				ab.KB_bank();
				break;
				
			case 2: // 신한
				ab.SH_bank();
				break;
		
			default:
				System.out.println("해당 은행 코드는 존재하지 않습니다.");
				break;
		}
		
		
		sc.close();
	}

}

// 동일한 이름을 가진 변수명이라고 하더라도 interface의 이름에 따라 다른값을 가져올 수 있음.(this 사용불가)
// 그 외에는 this 사용가능

class allbank implements inter3, inter4{
	Scanner sc2 = new Scanner(System.in);
	String userpass = ""; // 사용자가 입력한 패스워드 받는 변수
	String part = ""; // 입금출금을 구분하는 변수
	Integer usermoney = 0; // 입금, 출금 사용자가 입력한 금액 저장 변수
	static Integer money = 0; // 은행제 최종 남은 금액
	
	public allbank() { // 즉시실행
		this.money = inter3.money;
	}
	
	@Override
	public void SH_bank() {	// inter4 신한 수수료 필요
		System.out.printf("%s은행 패스워드 입력 : %n", inter4.bankname);
		this.userpass = this.sc2.nextLine();
		if(this.userpass.equals(inter4.password)) {
			System.out.println("1.입금 2.출금 :");
			this.part = sc2.nextLine();
			// 출금만 사용
			if(this.part.equals("2")) {
				System.out.println("출금 금액을 입력해 주세요 : ");
				this.usermoney = this.sc2.nextInt();
				this.sc2.close();
				this.out_monety(true); // 출금시 수수료 적용
			}
		} else {
			System.out.println("계좌비밀번호가 틀립니다.");
		}
	}

	@Override
	public void KB_bank() { // inter3 국민 수수료 없음
		System.out.printf("%s은행 패스워드 입력 : %n", inter3.bankname);
		this.userpass = this.sc2.nextLine();
		if(this.userpass.equals(inter3.password)) {
			System.out.println("1.입금 2.출금 :");
			this.part = sc2.nextLine();
			// 출금만 사용
			if(this.part.equals("2")) {
				System.out.println("출금 금액을 입력해 주세요 : ");
				this.usermoney = this.sc2.nextInt();
				this.sc2.close();
				this.out_monety(false); // 출금시 수수료 미적용
			}
		} else {
			System.out.println("계좌비밀번호가 틀립니다.");
		}
	}	
	
// 입금, 출금 return method
	public Integer in_money() { // 입금
		return 0;
	}
	
//	@SuppressWarnings("all")
	public Integer out_monety(boolean z) { // 출금
		if(z == true) { // 수수료 발생 (신한은행 수수료 포함)
			this.money = this.money - (this.usermoney + inter4.cg);
			System.out.println("최종 금액은 : " + this.money);
		} else { // 수수료 x
			this.money = this.money - this.usermoney;
			System.out.println("최종 금액은 : " + this.money);
		}
		return 0;
	}
}


