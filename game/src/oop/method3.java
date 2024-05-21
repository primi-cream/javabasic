package oop;
// method 정의 (void, 자료형, return)
public class method3 {

	public static void main(String[] args) {
		mth3_box mth3 = new mth3_box();
		mth3.abc();
		// 자료형 메소드에 인자값을 보낸 후 결과값을 변수로 받음
		String result = mth3.bbb("hong");
		System.out.println(result); // return으로 온 결과값을 출력
		
		int sum = mth3.ccc(10,5); // 2개의 인자값 전달 및 호출
		System.out.println(sum); // return된 결과값 출력
	}

}


class mth3_box{
	public void abc() { // method 호출 시 연산, 결과, 실행 담당
		System.out.println("abc void 메소드");
		return;
	}
	
	public String bbb(String id) { //자료형 메소드
		String email = "hong@nate.com"; // 신규 변수 생성 및 데이터 값
		return email; // return을 이용하여 다시 값을 반환
	}
	
	public int ccc(int a,int b) {
		int c = a * b; // 수식구
		return c; // 호출한 class method로 다시 결과값 반환
	}
	
	public static void ddd() { // 메모리 영역에 등록되는 메소드
		
	}
	
	public static String eee() { // 메모리 영역에 등록된 return 자료형 메소드
		return null;
	}
}