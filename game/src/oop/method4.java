package oop;

import java.util.Scanner;

// 
public class method4 {

	public static void main(String[] args) {
		mth4_box mth4 = new mth4_box();
		int call = mth4.gugu(5, 10);
		System.out.println(call); //최종 출력값
		
		/*
		 * 사용자명에 따라 회원등급을 반환하는 return 코드를 작성하시오.
		 * 홍길동 => 일반회원
		 * 이순신 => 실버회원
		 * 유관순 => VIP회원
		 * 강감찬 => 비회원
		 */
		mth4_a a = new mth4_a();
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자명 입력 : ");
		String b = sc.nextLine(); 
		System.out.println(a.b(b));
		sc.close();
	}

}

class mth4_a{
	public String b(String w) {
		String rank = null;
		switch(w) {
			case "홍길동" :
				rank = "일반회원";
				break;
			case "이순신" :
				rank = "실버회원";
				break;
			case "유관순" :
				rank = "VIP회원";
				break;
			default :
				rank = "비회원";
				break;	
		}	
		return rank;
	}
}



class mth4_box{
// return 자료형 메소드에서 인자값은 문자,숫자,실수 모두 사용가능
// 단, 결과값을 반환할 경우 자료형을 맞춰서 적용하여 보냄
	public int gugu(int a, int b) { // 인자값 두개를 활용한 최종 합계
		int sum = 0; // 총 합계 return에 사용하기 위해 반복문 밖에 적용
		while(a <= b) {
			sum += a; // 인자값 범위에 맞게 지속적으로 누적
			a++;
		}
		return sum; // 최종 값을 반환 (return은 하나의 변수만 사용)
	}
}