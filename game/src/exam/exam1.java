package exam;

import java.util.Scanner;

/*
 * 응용문제 1.
 * Scanner libary를 이용하여 다음과 같이 결과가 나오도록 작성
 * 단, 최대 및 최소 값은 다음과 같습니다. 0 ~ 100
 * [결과]
 * 점수를 입력해 주세요 : x
 * 100 ~ 80 : A 등급
 * 79 ~ 60 : B 등급
 * 59 ~ 40 : C 등급
 * 39 ~ : D 등급
 * 
 * 
 */

public class exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요 : ");
		int point = sc.nextInt();
		
		if(point < 0 || point > 100) {
			System.out.println("잘못입력하셨습니다.");
		} else if(point < 40) {
			System.out.println("D 등급");
		} else if (point < 60){
			System.out.println("C 등급");
		} else if (point < 80){
			System.out.println("B 등급");
		} else if (point <= 100){
			System.out.println("A 등급");
		}
		
		sc.close(); // close
	}
	
}


