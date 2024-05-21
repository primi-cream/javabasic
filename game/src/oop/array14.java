package oop;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.AbstractWriter;

// 2차 원시 배열 => class 배열로 변경
public class array14 {

	public static void main(String[] args) {
		ay14_box ay = new ay14_box();
		ay.abc();
	}
}


class ay14_box{
	public void abc() {
		int a[][] = {
				{10,20,30},
				{100,200,300}
		};
		
		// 1차 배열
//		ArrayList<Integer> al = new ArrayList<Integer>();

		// 2차 배열
//		ArrayList<ArrayList<Integer>> al2 = new ArrayList<ArrayList<Integer>>(Arrays.asList(al));
		
//		System.out.println(Arrays.deepToString(al));

		// 2차 빈배열
		ArrayList<ArrayList<Integer>> aw2 = new ArrayList<ArrayList<Integer>>();

		int w = 0;
		while(w < a.length) { //2
			// 1차 빈배열(반복문이 한번 실행할 때 마다 새롭게 1차 빈배열이 생성됨)
			ArrayList<Integer> aw = new ArrayList<Integer>();
			int ww = 0;
			while(ww < a[0].length) { //3
				aw.add(a[w][ww]); // 1차 배열에 값을 반복문으로 삽입
				ww++;
			}
			aw2.add(aw); // 1차 클래스 배열에 전체값을 2차 빈배열에 삽입
			w++;
		}
		
		System.out.println(aw2);
		
		System.out.println(aw2.get(1).get(2)); // get을 이용하여 그룹,데이터 배열번호로 출력
	}
	
	
}