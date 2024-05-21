package oop2;
// Exception : 예외처리 사용법 (오동작 발생)
/*
 * 1. 사용자가 입력실수로 인한 정보전달 안될 경우
 * 2. 개발자가 프로그래 오류시 정확한 오류 파악을 하기 위한 수단
 * 3. 강제 프로세서에 대한 정보 수정 및 종료 
 */
public class ex1 {

	public static void main(String[] args) {
		String a = "2000";
		int b = 200;
		try {	//try : 프로세서를 진행
			b = Integer.parseInt(a);			
		} catch(NumberFormatException e) {
			System.out.println("문자를 숫자로 변경되는 사항 오류발생!");
		}	catch(Exception e)  { // catch는 try에서 문제 발생시 해당 문법이 발동
			System.out.println(e);
		}
	}

}

