package oop;

import java.util.Scanner;
// Scanner 사용 시 next, nexLine 오류발생 원인
public class oop15 {

	public static void main(String[] args) {
		// 임의 사용자 입력 받는 라이브러리
		Scanner sc = new Scanner(System.in);
		String a,b; // 사용자 입력값을 받는 변수를 선언
		System.out.print("고객명을 입력하세요 : ");
		a = sc.next();
//		System.out.println(a);
		System.out.print("이메일을 입력하세요 : ");
		b = sc.nextLine();
//		System.out.println(b);
		System.out.println(a + "/" + b);	

		Scanner sc2 = new Scanner(System.in);
		System.out.println("연락처를 입력하세요 :");
		String tel = sc2.next();
		System.out.println(tel);
		
		// 모든 라이브러리는 close시 역순으로 닫아 줘야함
		sc2.close();
		sc.close();
		
	}

}
