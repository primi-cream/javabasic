package oop;

import java.util.Arrays;
import java.util.LinkedList;

// LinkedList Class 배열
public class web5 {

	public static void main(String[] args) {
		Integer a[] = {1,3,5,7,9}; // 원시배열
		
		// Class 배열 선언
		LinkedList<Integer> ls = new LinkedList<Integer>(Arrays.asList(a));
		System.out.println(ls);
		LinkedList<Integer> ls2 = new LinkedList<Integer>();
		
		ls2.add(10);
		ls2.add(20);
		ls2.add(30);
		ls2.add(2,50); // ArrayList 동일
		ls2.remove(0); // clear
		ls2.set(1, 500); // 해당 배열 번호에 데이터를 수정, 변경시 사용
		ls2.push(100);
		Integer aa = ls2.pop(); // 배열값을 첫번째 값 출력 시 배열에 삭제
		Integer bb = ls2.peek(); // 배열값을 첫번째 값 출력 시 배열에 값 그대로 보관
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(ls2);
		
		
	}

}
