package oop;

import java.util.Scanner;

// 반복문 + 원시 1차배열 응용편(금융)
// 응용편 : 사용자가 최대 5번을 입금 할 수 있음
// 입금된 내용은 모두 배열에 추가되어야하며,
// 최종합계 입금 금액을 출력되도록 함
public class array3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int deposit[] = new int[5]; 
		
		int count = 0;
		int total = 0;
		while(count<deposit.length) {
			System.out.print("입금하실 금액을 입력하세요 : ");
			int userDepo = sc.nextInt();
			total+=userDepo;
			count++;
		}		
		sc.close();
		
		System.out.println("총 입금한 금액은 : " + total);
	}

}
