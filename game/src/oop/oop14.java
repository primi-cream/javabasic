package oop;

import java.util.Scanner;

public class oop14 {

	public static void main(String[] args) {
//		oop14_box oop14 = new oop14_box();
//		oop14.abc();

		oop14_test oop14t = new oop14_test();
		oop14t.abc();
	}

}

// 사용자 아이디 및 패스워드를 입력하는 코드를 작성하시오.
// 단 Sample Data로 hong/a1234 일 경우
// 로그인 하셨습니다 출력
// 패스워드 틀릴 경우 "아이디 및 패스워드를확인하세요" 출력
// 그 외 다른 아이디를 입력할 경우 
// 가입되지 않은 사용자 입니다. 출력


class oop14_test{
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 :");
		String pw = sc.nextLine();;
		
		
		if(id.equals("hong") && pw.equals("a1234")) {
			System.out.println("로그인 하셨습니다.");
		} else if(id.equals("hong") ) {
			System.out.println("아이디 및 패스워드를 확인하세요");
		} else {
			System.out.println("가입되지 않은 사용자입니다.");
		}
		
		sc.close();
	}
}


class oop14_box{
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("로그인 아이디 입력 : ");
		String id = sc.nextLine().intern(); // intern Method 조건문에 연산기호 사용 시
//		숫자는 연산기호로 사용		
//		if(id.equals("hong")) {
		if(id == "hong") {
			System.out.println("가입된 사용자입니다.");
		} else {
			System.out.println("미가입자 회원입니다.");
		}
		
		sc.close();
	}
}

