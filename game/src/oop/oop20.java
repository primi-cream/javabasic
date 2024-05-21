package oop;

import java.util.Scanner;

// 이중 루프 - Scanner 응용편
public class oop20 {

	public static void main(String[] args) {
//		oop20_box box = new oop20_box();
//		box.abc();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요 : ");
		int no1 = sc2.nextInt();
		System.out.println("두번째 숫자값을 입력하세요 : ");
		int no2 = sc2.nextInt();
		sc2.close();
		oop20_box2 box2 = new oop20_box2();
		box2.abc(no1, no2);
		
		
	}

}

class oop20_box2{
	public void abc(int a,int b) {
		int w = a; // while문 기초값 사용자가 입력한 첫번째
		while(w <= b) {
			for(int i=1; i<=9; i++) {
				System.out.println(w + " * " + i + " = " + w*i);
			}
			w++;
		}
	}
}

class oop20_box{
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 구구단 숫자를 입력하세요 : ");
		int gugu = sc.nextInt(); //첫번째 숫자 입력값을 변수 대입
		System.out.println("두번째 구구단 범위 숫자를 입력하세요 : ");
		int gugu2 = sc.nextInt(); //두번째 숫자 입력값을 변수 대입
		
		for(int i=gugu; i<=gugu2; i++) { // 큰 반복문
			for(int j=1; j<=9; j++) { // 작은 반복문
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		sc.close();
	}
}