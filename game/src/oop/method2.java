package oop;
// 외부 클래스 변수값 가져오기 및 변경
public class method2 {
	static String user = null; // 로그인 사용자명 (메모리에 장소설정)
	
	// main method는 기본적으로 메모리 영역을 사용
	public static void main(String[] args) {
//		method2 md = new method2();
//		md.user = "홍길동";
		
		user = "홍길동"; // 메모리에 등록된 전역변수 값을 입력시킴
		method2_box mb2 = new method2_box();
		mb2.aaa = 500; // 외부클래스 필드에 있는 전역변수 값을 변경
//		mb2.bbb = 25000; private
		mb2.abc();
//		mb2.zzz(); private 으로 생성된 메소드는 외부에서 호출 못함
	}
}


class method2_box {
	
	public int aaa = 100; // 일반 전역 변수
	private int bbb = 1000; // private은 해당 class에서만 사용 및 변경가능
	
	private void zzz() {
		System.out.println("내부 보안 메소드...");
	}
	
	public void abc() {
		// public class에 있는 메모리 영역의 변수값을 일반 변수에 등록
		String aaa = new method2().user;
		System.out.println(aaa); // 출력
		System.out.println(this.aaa);
		this.bbb = 50000;
		System.out.println(this.bbb); // 내부에서는 값변경 가능(private)
	}
}
