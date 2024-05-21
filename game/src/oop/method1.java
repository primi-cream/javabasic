package oop;

import java.util.Scanner;

// 상수와 변수 (전역변수, 지역변수, 메모리지정 변수)
public class method1 {

	public static void main(String[] args) {
		// thread
		method1_box a = new method1_box();
		a.abc();
		method1_box a2 = new method1_box();
		a2.abc();
		method1_box a3 = new method1_box();
		a3.abc();
	}

}

class method1_box{
//	field scope - libary,array, variable(constant, memory) define
	String user; // 전역변수
	int a = 10;
	final int b = 100; // constant
	static int c = 1;
	int d = 1;
	Scanner sc = null; // 라이브러리를 필드에 사용하여 해당 클래스 안에 사용하여 해당 라이브러리를 즉각 사용가능
	public void abc() {
//		this.b = 500;
		this.user = "홍길동";
//		String user2 = "이순신";
		int a=30;
		this.method2();
		this.c++;
		this.d++;
		System.out.println(this.c);
		System.out.println(this.d);
	}
	
	public void method2() {
		String user="2";
		System.out.println(this.user);
		System.out.println(user);
		System.out.println(this.a);
		this.sc = new Scanner(System.in);
		System.out.println("아이디 입력");
		String mid = this.sc.next();
		System.out.println(mid);
	}
}