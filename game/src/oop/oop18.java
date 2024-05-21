package oop;

import java.util.Scanner;

// 반복적으로 사용자에게 질문을 던지는 코드 (반복문 + Scanner)
public class oop18 {

	public static void main(String[] args) {
		oop18_box ob = new oop18_box();
		ob.abc();
	}

}

class oop18_box {
	public void abc() {
		/*
		 * 해당 코드에서 추가작업이 필요
		 * 사용자가 입력한 금액 모두 합계가 출력되는 코드로 수정
		 * 
		 */
		Scanner sc = new Scanner(System.in); // 사용자 입력값
		int w = 1;
		int money;// 사용자 입력
		int sum = 0;
		
		while(w <= 4) {
			System.out.println("상품금액을 입력하세요 : ");
			money = sc.nextInt(); 
			sum+=money;
			w++;
		}
		
		System.out.println("총 합계 : " + sum);
		sc.close();
	}
}