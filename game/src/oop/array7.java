package oop;

import java.util.Arrays;

// 1차 배열 -> 2차 배열로 적용
public class array7 {

	public static void main(String[] args) {
		String area[] = {"서울" ,"경기도", "인천"}; // 1차 배열
		String peoples[] = {"12000" , "6500", "3300"}; // 1차 배열
		String total[][] = new String[area.length][2];	// 2차 배열 생성
	
		for(int i=0; i<area.length; i++) { //1차 배열 데이터 갯수만큼 반복
				total[i][0] = area[i];  // 그룹0 데이터를 이관
				total[i][1] = peoples[i]; // 그룹1 데이터를 이관
		}
		System.out.println(Arrays.deepToString(total)); //2차 배열 생성완료 출력
		
		//1차 배열 -> 2차 배열로 변환 응용편
		/*
		 * {90,22,16,13,8,42,49,36,1,9}
		 * 해당 1차 배열에 짝수 5 홀수 5개 존재
		 * 2차 배열로 각각 짝수 그룹, 홀수 그룹으로 나누어서 출력되도록 코드를 제작.
		 */
		
		
		int numbers[] = {90,22,16,13,8,42,49,37,1,9};
		int group[][] = new int[2][numbers.length/2];
		
		int j=0;
		int k=0;
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]%2 != 0) {
				group[0][j] = numbers[i];
				j++;
			} else {
				group[1][k] = numbers[i];
				k++;
			}
		}
		System.out.println(Arrays.deepToString(group));
		
	}

}
