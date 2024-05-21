package oop;

import java.util.ArrayList;
import java.util.LinkedList;

//ArrayList 와 LinkedList의 데이터 속도 처리 차이
public class web6 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();	// 시작시간
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		LinkedList<Integer> data2 = new LinkedList<Integer>();
		/*
		 * ArrayList : 순차적으로 데이터를 읽기 또는 쓰기할 경우 빠름
		 * LinkedList : 이미 데이터가 있는 상황에서 추가로 데이터를 중간에 삽입할 경우 빠름
		 * 
		 */
		
		
		
//		int w = 0;
//		do {
//			data1.add(w);
//			data2.add(w);
//			w++;
//		}while(w <= 1000000);
//		
		
		int ww = 0;
		int no = 0;
		do {
//			data1.add(no,ww);
			data2.add(no,ww);
			ww++;
			no++;
		}while(ww<=1000);
		
		long end = System.currentTimeMillis(); // 종료시간
		long result = end - start; // 최종결과시간
		System.out.println(result);
		
	}

}
