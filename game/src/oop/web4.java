package oop;

import java.util.ArrayList;

//web3.java에서 사용한 데이터 응용편
public class web4 {

	public static void main(String[] args) {
		dto dt = new dto();
		String user[][] = {
				{"홍길동","25","hong@nate.com","hong"},
				{"이순신","33","lee@naver.com","lee"}
		};
		
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		
		int w=0;
		/*
		while(w<user.length) { //2
			dt.setId(user[w][3]);
			dt.setName(user[w][0]);
			dt.setEmail(user[w][2]);
			dt.setAge(user[w][1]);
			data.add(dt.make());
			w++;
		}
		*/
		
		while(w<user[0].length) { //4
			
			int ww=0;
			ArrayList<String> test = new ArrayList<String>();
			while(ww<user.length) { //2
				// 해당 메소드 무조건 사용자명만 입력하는 사항은 없습니다.
				// 단, 자료형이 틀릴 경우 if, switch로 구분하여 메소드에 인자값을 보냄
				dt.setName(user[ww][w]); 
				test = dt.make2(); // 1차 배열 => 1차배열로 이관하므로 = 로 사용
//				System.out.println(test);
				ww++;
			}
			
			data.add(test);
			dt.all_arr = new ArrayList<String>(); // 해당 class에 전역 클래스배열 초기화
			w++;
//			dt.make2().clear(); 데이터 초기화
		}
		
		System.out.println(data);
		
	}

}
