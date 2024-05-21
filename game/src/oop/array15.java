package oop;

import java.util.ArrayList;
import java.util.Arrays;

// Method를 활용한 2차 클래스 배열 데이터 만들기
public class array15 {
	public static void main(String[] args) {
		// 1. 원시배열은 자료형 클래스를 이용해야함
		// 2. 외부 클래스에서 메소드를 1차 클래스 배열을 생성
		// 3. 반복문을 이용해서 return 결과를 2차 클래스에 데이터 삽입
		// 4. 출력
		Integer a[][]= {
				{5,10,15,20},
				{6,12,18,24},
				{7,14,21,28}
		};
		ay15 ay = new ay15();
		
		//2차원 빈배열
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		
		int w = 0;
		
		while(w<a.length){ //3  (그룹)
			al.add(ay.abc(a[w])); // return 된 1차 배열값을 2차 배열로 이관
			w++;
		}
		
		System.out.println(al); // 2차 배열 출력
	}
}

class ay15{
	// 1차원 빈배열 Method
	public ArrayList<Integer> abc(Integer data[]){
		// 1차 배열을 생성하여 원시배열값을 클래스 배열로 변환
		ArrayList<Integer> all = new ArrayList<Integer>(Arrays.asList(data));
		return all;
	}
	
}
