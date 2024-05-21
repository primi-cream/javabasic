package oop;

import java.util.Scanner;

// 이중 루프를 이용한 코드 테스트
// 다음 결과값을 체크하여 동일한 결과가 출력되는 코드를 작성하시오.
// 단, 사용자가 입력하는 값은 다음과 같습니다.
// 첫번째 값 : 1
//
//[결과]
//1*1 = 1
//2*1 = 2
//2*2 = 4
//3*1 = 3
//...
//6*6 = 36
public class oop21 {
	public static void main(String[] args) {
		oop21_cal cal = new oop21_cal();
		cal.abc();
	}
}

class oop21_cal{
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째값 입력 : ");
		int no = sc.nextInt();
		System.out.print("두번째값 입력 : ");
		int no2 = sc.nextInt();
		
		for(int i=no; i<=no2; i++) {
			for(int j=i; j<=no2; j++)
			System.out.println(i + " * " + j + " = " + i*j);
		}
		
		sc.close();
	}
}
