package oop;
// 사용자가 3개의 값을 물어봅니다.
// 첫번째 숫자 : 2
// 두번재 숫자 : 4
// 짝수 or 홀수 입력
// 결과
// 3 * 1 = 3
// 3 * 3 = 9
// 3 * 5 = 15
// 3 * 7 = 21
// 3 * 9 = 27

import java.util.Scanner;

// 추가예시 동일한 숫자에서 짝수 입력시
// 2 * 1 = 2
// ...
// 2 * 9 = 18
// 3 * 2 = 6
// 3 * 4 = 12
// ...
// 3 * 8 = 24
// 4 * 1 = 4
// ... 
// 4 * 9 = 36

public class oop22 {
	public static void main(String[] args) {
		oop22_gu gu = new oop22_gu();
		gu.gugu();
	}
}

class oop22_gu{
	public void gugu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		System.out.print("짝수 or 홀수 : ");
		String s = sc.nextLine();
		
		
		if(s.equals("짝수")) {			
			for(int i=num1;i<=num2;i++) {
				if(i%2 == 0) {
					int count = 1;
					while(count <= 9) {
						System.out.println(i + " * " + count);
						count++;
					}
				}
			}
		} else if(s.equals("홀수")) {
				
		} else {
			System.out.println("홀수 또는 짝수를 입력하셔야합니다.");
		}
			
		
		
		
		sc.close();
	}
}
