package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// setter, getter를 이용한 데이터 주고 받기
/*
 * DAO : Data Access Object - 데이터에 접근하기 위한 객체 (삽입, 삭제, 조회)
 * DTO : Data Transfer Object - Getter, Setter를 이루는 Method의 집합
 * VO : Value Object - Getter 상수 데이터 이용하여 값을 가져오는 메소드
 */
public class web1 {
	public static void main(String[] args) {
		// sort 사용 시 주의사항
		// 반복문 사용시 new object 할당량을 확인해야함
		Integer a[] = {5,10,8,4,2};
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		System.out.println(arr1);
		System.out.println(arr2);
			
		int w = 0;
		while(w < a.length) {
			arr1.add(a[w]);
			arr2.add(a[w]);
			w++;
		}
		
		
		System.out.println(arr1);
		Collections.sort(arr1);
		System.out.println(arr1);
		System.out.println(arr2);
		
		
		// 1차 => 2차 배열(반복문 사용시 1차 배열 생성이 중요합니다. 또한 2차 배열도 반복문 안과 밖에 따라 다른 결과가 출력 될 수 있습니다.)
		// 2차 및 다차원 배열시 sort를 1차 배열 형태에 적용하면,
		// 추가 2차 배열 및 다차원 배열 모두 동일하게 적용됨
		
		String user[][] = {
				{"hong","kim","park"},
				{"21","16","33"}
		};
		
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> all2 = new ArrayList<ArrayList<String>>();
		ArrayList<String> al = null;
		
		for(int i=0; i<user[0].length; i++) { // 3
			al = new ArrayList<String>();
			al.add(user[0][i]);
			al.add(user[1][i]);
			all.add(al);
			all2.add(al);
		}
//		System.out.println(al);
		System.out.println(all);
		System.out.println(all2);
		Collections.sort(all.get(0));
		System.out.println(all);
		System.out.println(all2);
		dto z = new dto();
		
	}
}
