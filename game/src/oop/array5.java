package oop;

public class array5 {

	public static void main(String[] args) {
		ay5_box ab =new ay5_box();
		ab.abc();

	}

}

class ay5_box{
	final String data[][] = {
			{"hong" ,"kim" ,"park" ,"jang"},
			{"a1234", "b1234", "c1234" ,"abc1234"},
			{"1000", "1500", "2000" ,"4500"},
	};
	public void abc() {
		String id = "jang"; // 아이디
		String pw = "abc1234"; // 패스워드
		int gp = this.data.length; // 그룹 갯수
		int ea = this.data[0].length; // 첫번째 그룹 데이터 갯수
		int count = 0; // 카운팅
		
		for(int i=0; i<ea; i++) {
			if(id == this.data[0][i]) { // 0그룹에 데이터(아이디)
				for(int j=0; j<gp; j++) {
//					System.out.println(this.data[j][i]);
					if(pw == this.data[j][i]) { // 패스워드 검토
						System.out.println("로그인 하셨습니다.");	// 로그인 성공 출력
						System.out.println(this.data[2][i]);	// 포인트를 출력
						count++;
						break;
					}
				}				
			}
		}
		// 반복문 작동시 해당 조건이 없을 경우 기본 변수 값으로 조건을 걸어 메세지 출력
		if(count == 0) {
			System.out.println("아이디 및 패스워드를 확인하세요");
		}
	}
}