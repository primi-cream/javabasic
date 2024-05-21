package oop;

import java.util.ArrayList;

//DTO를 이용한 배열 생성하기
/*
 * DTO에 있는 모든 변수를 활용할 필요는 없음 단, 필요한 변수가 있을 경우 DTO에 생성 후 Getter,Setter Method 생성
 * 
 */
public class web3 {
	public static void main(String[] args) {
		dto dt = new dto();
		String user[][] = {
				{"홍길동","이순신"},
				{"25","33"},
				{"hong@nate.com","lee@naver.com"},
				{"hong","lee"}
		}; // 고객명, 이메일, 나이
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		
		
		for(int i=0; i<user[0].length; i++) {
			dt.setName(user[0][i]);
			dt.setId(user[3][i]);
			dt.setEmail(user[2][i]);
			dt.setAge(user[1][i]);
			all.add(dt.make());
		}
			System.out.println(all);
		
//			ArrayList<String> userdata = dt.make();
//		ArrayList<String> userdata = new ArrayList<String>();
//		userdata = dt.make();

	}
}
