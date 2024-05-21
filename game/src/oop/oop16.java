package oop;

import java.util.Scanner;
// Scanner 라이브러리를 활용하여 문제풀이
// 사용자 입력 
// 첫번째 숫자 값 입력
// 두번째 숫자 값 입력
// [결과]
// 두 합의 결과값 출력
public class oop16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 값 : ");
		int num2 = sc.nextInt();

		System.out.println("두 값의 합계 : " + (num1+num2));
		
		sc.close();
	}

}
