package oop;

import java.util.Arrays;

// 다차원 배열
/*
 * 응용편
 * 실버회원 정보 리시트만 데이터를 추출하여 출력 되도록 합니다.
 * 출력방식은 다음과 같음
 * 
 * 
 * [결과]
 * 강감찬
 * 실버
 * 2500
 * 이순신
 * 실버
 * 2200
 * 
 * 
 */
public class array8 {

	public static void main(String[] args) {
		// 해당배열을 기준으로 다음 결과처럼 출력 되도록 코드를 작성하시오.
				// 결과
				/*
				 * 고객명
				 * 회원등급
				 * 포인트
				 * 
				 * 홍길동
				 * 일반
				 * 1500
				 * 강감찬
				 * 실버
				 * 2500
				 */

		
		String data[][][] = {
				{
					{"홍길동" ,"강감찬" ,"유관순" ,"이순신" ,"이산"},
					{"일반" ,"실버" ,"골드" ,"실버" ,"일반"},
				},
				{
					{"1500" ,"2500" ,"1000" ,"2200" ,"3000"}
				}
		};
		

//		System.out.println(data[0].length);
		
		
		for(int i=0; i<data[0][0].length;i++) {
			for(int j=0; j<data[0].length; j++) {
				for(int k=j; k<data.length; k++) {
					if(j!=1) {						
						System.out.println(data[j][k][i]);	
					} else {
						System.out.println(data[j][0][i]);
					}
				}
				
			}
		}
		

		
		
	}

}
