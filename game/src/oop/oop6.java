package oop;
// 외부 클래스를 이용한 조건문 (if문)
public class oop6 {
	
	public static void main(String[] args) {
//		사용자 정보
		String user = "hong";
		String pass = "a1234";
		oop6_cal op6 = new oop6_cal(); // 외부클래스 호출
		op6.abc(user, pass); // 아이디, 패스워드를 전달
		
//		char auto_login = 'Y';
		String auto_login = "Y";
		oop6_ck op6_ck = new oop6_ck();
		op6_ck.login_ck(auto_login);
	}
	
}
// 외부 클래스2
class oop6_ck{
//	public void login_ck(char check) {
	public void login_ck(String check) {
		if(check.equals(check)) {  //char
			System.out.println("자동로그인 활성화");
		} else if(!check.equals("Y")) {
			System.out.println("자동로그인 비활성화");
		}
	}
}



// 외부 클래스
class oop6_cal{
	
	public void abc(String id, String pw) { // 인자값으로 값 받음
		if(id == null || id == "") { // 아이디가 빈값 및 null 처리 되었을 경우
			System.out.println("아이디가 확인 되지 않음");
		} else if(id != null || id != ""){
			if(id == "hong") {
				if(pw == "a1234") {
					System.out.println("로그인 되셨습니다.");
				} else {
					System.out.println("패스워드가 틀립니다.");
				}
			} else {
				System.out.println("등록된 회원이 아닙니다.");
			}
		}
		
	}
}