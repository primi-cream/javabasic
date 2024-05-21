package oop;

import java.util.Scanner;

// 응용문제
// 외부 클래스를 이용하여 사용자가 하나의 숫자값을 입력
// 입력된 값이 짝수인지 홀수인지 확인하는 return 메소드 코드
public class method6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력 : ");
		int num = sc.nextInt();
		ch c = new ch();
		System.out.println(c.check(num));
		sc.close();
	}

}


class ch{
	public String check(int no) {
		String result = "";
		if(no%2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		return result;
	}
}
