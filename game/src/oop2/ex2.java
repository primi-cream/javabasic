package oop2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 이름을 입력해 주세요 : ");
		try {
			String username = sc.nextLine().intern();
//			System.out.println(username.equals(null) + "test");
			if(username.equals("") || username.equals(null)) {
				System.out.println("미입력");
			} else {
				System.out.println("입력완료");
				System.out.println("연락처를 입력하세요 단 '-' 없이 사용 : ");
				Integer tel = sc.nextInt();
				System.out.println(tel);
			}
		} catch(Exception e) {
			System.out.println(e);
		} finally {	// 무조건 실행 되는 코드 개발자 선택사항 (유/무)
			System.out.println("실행!!");
			sc.close();
		}
		
	}

}
