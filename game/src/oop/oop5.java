package oop;
// 외부 클래스를 이용하여 데이터 값을 메소드로 전달
public class oop5 {
	
	public static void main(String[] args) {
		oop5_box oop5 = new oop5_box();
		String mId = "hong";
		String mPass = "a1234";
		oop5.abc(mId, mPass);
//		public class에서 추가 Method를 호출 및 값 전달
//		oop5 mains = new oop5();
//		mains.zzz();
		new oop5().zzz();
	}
	
	public void zzz() {		// 메인 클래스에 추가 메소드
		System.out.println("메인 클래스 추가 메소드!!");
		kkk();
//		this.kkk();
	} 
	
	public void kkk() {
		System.out.println("kkk 메소드 실행");
	}
}

class oop5_box{

	// 메인에서 보내온 데이터를 받는 메소드
	public void abc(String id, String pw) {	//받는 메소드의 인자값 갯수 및 자료형 일치
		System.out.println(id);
		System.out.println(pw);
//		login(id,pw);
//		oop5_box oop5 = new oop5_box();
//		oop5.login(id, pw);
		this.login(id, pw);		//this를 이용하여 login 메소드로 값 전달
	}
	
	public void login(String id, String pw) {
		System.out.println(id);
		System.out.println(pw);
	}
}