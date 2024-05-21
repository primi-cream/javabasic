package oop;

import java.util.ArrayList;

// 2차 배열 -> 2차 배열 등록 가능함
public class arraylist1 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("홍길동");
		a.add("이순신");
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		
		all.add(a);
		System.out.println(all);
		
		ArrayList<ArrayList<String>> all2 = all;
		System.out.println(all2);
	}

}
