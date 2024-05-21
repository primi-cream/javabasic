package oop2;

import java.util.LinkedList;

// 예외처리, 배열, DTO(getter,setter) (반복문 안에 try~catch)
public class ex11 {
	public static void main(String[] args) {
		ex11_box ex = new ex11_box();
//		Object data[] = {"2000",500,"1500","1.5",15.25,"6000"};	// 커스텀 안함
		Object data[] = {"2000","500","1500","1","15","6000"};	// 커스텀 상태
		try {
			ex.setter(data);
			LinkedList<Integer> result = ex.getter();
			System.out.println(result);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}

// setter, getter를 이용한 DTO
class ex11_box{
	LinkedList<Integer> redata = new LinkedList<Integer>();
	
	public void setter(Object[] call) throws Exception{	// 데이터 입력
		int ea = call.length;
		int w = 0;
		
		while(w < ea) {			
			try {
				Integer no = Integer.parseInt((String)(call[w])); // parseInt -> String => int
//				Integer no = Integer.valueOf((int)(call[w])); // valueOf 한번더 확인
//				parseInt, valueOf차이 Object 사용 시 자료형 출력해보면 알수있음.
				System.out.println(no);
				this.redata.add(no);	// 원시배열 값을 클래스 배열로 데이터 삽입
				
			} catch(Exception e) {	// 예외처리 오류발생시 throw가 발생되면 반복문 정지
				Exception ex = new Exception("배열에 올바른 값이 아닙니다.");
				throw ex;
			}
			w++;
		}
	}
	
	public LinkedList<Integer> getter(){	// 데이터 출력
		return this.redata;
	}
	
}
