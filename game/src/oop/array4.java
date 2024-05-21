package oop;

import java.util.Arrays;

// 2차 원시배열
public class array4 {

	public static void main(String[] args) {
//		String user[][] = {
//				{"홍길동" ,"이순신" ,"유관순"},
//				{"100" ,"88" ,"75"}, 
//		};
		
		String user[][] = {
				{"홍길동" ,"100"},
				{"이순신" ,"200"},
		};

//		System.out.println(user[1][1]);
		// 그룹
		int gp = user.length; // 그룹 갯수
		int ea = user[0].length; // 해당 그룹에 데이터 갯수
		
		for(int i=0; i<ea; i++) { // 데이터 갯수
			for(int j=0; j<gp; j++) { // 그룹 개수
				System.out.println(user[j][i]);
			}
		}
		// 2차 배열에 데이터 삽입
		int adata[][] = new int[2][2];
		adata[0][0] = 50;
		adata[0][1] = 100;
		adata[1][0] = 200;
		adata[1][1] = 500;
		
		System.out.println(adata); // 특수문자(안호화가 종용)
		System.out.println(Arrays.deepToString(adata));
//		Deeptostaming susout
	}

}
