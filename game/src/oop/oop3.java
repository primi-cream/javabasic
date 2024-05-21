package oop;

// 클래스와 메소드의 형태
public class oop3 { // public class 한개의 파일당 한번만 사용가능
//public class 이름과 파일명이 동일 즉, public class abc => abc.java
	public static void main(String[] args) { 
		// public class에서만 사용하는 main(실행 Method)
		box b = new box();	// 클래스, 객체, 인스턴스
		b.abc();	//해당 클래스에 abc Method 호출
		b.bbb();

		box2 b2 = new box2();
		b2.kkk();
	}

}
class box2{
	public void kkk() {
		System.out.println("kkk 메소드 호출");
	}
}

// 외부 클래스 선언
class box{
	public void abc() {
		System.out.println("외부 클래스 및 메소드 데이터 호출!!");
	}
	
	public void bbb() {
		System.out.println("bbb 메소드 호출");
	}
}