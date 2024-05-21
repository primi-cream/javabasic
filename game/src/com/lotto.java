package com;

import java.util.ArrayList;

public class lotto {
	public static void main(String[] args) {
		// 1~46 랜덤 생성 -> PC // Class Array에 해당 번호 6개 저장 (단, 중복 X)
		// 외부 클래스 이용
		new lotto_box().start();
	}
}

class lotto_box {
	ArrayList<Integer> numbers = null;

	public void start() {
		numbers = new ArrayList<Integer>();
		while (numbers.size() < 6) {
			int no = (int) (Math.random() * 46) + 1;
			if (!numbers.contains(no)) {
				numbers.add(no);
			}
		}
		printing();
	}

	public void printing() {
		numbers.sort(null);
		System.out.println(numbers);
	}
}
