package oop2;

import java.util.Scanner;

// try, catch, final, throws, throw
public class ex8 {	// 값을 보내고, 결과값을 받는 코드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1번 throws
		try {
			System.out.println("첫번째 숫자를 입력하세요 : ");			
			String a = sc.nextLine();
			System.out.println("두번째 숫자를 입력하세요 : ");
			String b = sc.nextLine();
			Integer result = new bx8_box().files(a,b); //2번	//사용자 입력값 전송 및 결과 받음
			System.out.println("결과 : " + result);
		} catch(NumberFormatException nfc) {
			System.out.println("데이터 전송 오류!!");
		} catch(Exception e) { // 7번 오류 사항 확인
			e.getMessage();
			System.out.println(e);
		} finally { // 8번 Library 종료
			sc.close();
		}
	}
}

class bx8_box{	// 값을 받고, 산술연산 후 결과값을 보내는 코드
	public Integer files(String aa, String bb) throws Exception {
		int sum = 0;
		try { // 3번
			sum = Integer.parseInt(aa) + Integer.parseInt(bb);	// 문자 -> 숫자 변환
		} catch(Exception e) { // 오류 시 4번
			System.out.println("인자값 숫자 변환 오류!!"); // 5번
			throw e; // 6번 상대방에게 문제가 되는 오류를 전송(상대방 catch 작동)
		}
		
		return sum;
	}	
}
