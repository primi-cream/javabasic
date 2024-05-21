package oop;

import java.util.ArrayList;
import java.util.List;

// 배열에 자료형에 해당 클래스를 로드하여 적용하는 방법 (DTO)


// 실행 부분
public class list_dto {

	public static void main(String[] args) {
		new list_data();
	}

}


//module(반복문, 원시배열...)
class list_data{
	String user[][] = {
			{"hong","kim"},
			{"홍길동","강감찬"}
	};
	// 클래스 배열에 getter, setter 클래스를 로드하여 1차 배열을 생성 및 출력
	List<dto_info> di = null;	// 개발자 ArrayList, LinkedList, Hashmap 자유롭게 변경가능
	public list_data() { // 즉시 실행
		this.list_useradd();
	}
	
	public void list_useradd() { // 사용자를 추가하는 메소드
		dto_info sg = new dto_info();
		int w = 0;
		
		do {
			this.di = new ArrayList<dto_info>();	// 원시배열 -> 클래스 배열 이관
			//setter에 값을 이관
			sg.setMid(user[0][w]);
			sg.setMname(user[1][w]);
			this.di.add(sg); // 클래스 배열에 추가
			this.user_print(); // 출력 파트 실행 (view 실행)
			w++;
		}while(w < this.user.length);
	}
	
	public void user_print() {
		for(dto_info z : this.di) {  // foreach로 해당 데이터를 출력
			System.out.println(z.getMid());
			System.out.println(z.getMname());
		}
	}
}


//getter,setter (module)
class dto_info{
	String mid, mname;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
}
