package oop; // package 단위명 = project directory 구분

// class 생성 후 method를 생성할 수 있음

// 단위크기 : bit, byte, KB, MB, GB, TB

// 변수 종류 및 출력
public class oop1 { // class 명

	public static void main(String[] args) { // method
		// System.out : 결과를 출력하는 클래스
		// println : 출력형태 메소드 (라인 변경이 이루어짐)
		// print : 모든 내용을 한줄에 출력
		// printf : (지시자 %s-문자열, %d-숫자, %n-줄바꿈... )
		/*
		System.out.println("홍길동");
		System.out.println("강감찬");
		System.out.print("유관순");
		System.out.print("이순신");
		System.out.printf("%s님 %s 입니다.","에이핑크","화이팅");
		 */
		String user = "홍길동"; // 문자열 변수 (class)
		Integer age = 25; // 숫자열 변수 (class)
		int point = 5000; // 숫자 정수형
		float money = 25.25f; // 소수(실수)
		double sales = 0.13; // 소수
		char agree = 'Y'; // 2byte(한글자)
		
		System.out.println(user + "님 환영합니다.");
		System.out.printf("%s님 환영합니다. 포인트: %d %n", user, point);
		
		int sum = age + point;
		System.out.println(sum);
		
		// float < double 자료형이 더 큽니다.
		// float + float 일 경우 double 또는 float으로 계산 결과 가능
		// double + double 무조건 double
		double total = money + sales;
		System.out.println(total);
		
		int a = 90;
		float b = 11.3f;
		
		float c = a + b;
		System.out.println(c);
		
	}

}
