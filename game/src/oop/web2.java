package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 2차 class 배열을 이용한 정렬방식
public class web2 {

	public static void main(String[] args) {
		String a[][] = {
				{"김남주","윤보미","정은지"},
				{"21","19","24"}
		};
		// 나이를 오름차순 사용하기 위함
		ArrayList<String> all = new ArrayList<String>(Arrays.asList(a[1]));
		Collections.sort(all);
		System.out.println(all);
		// 최종 결과 데이터 배열
		ArrayList<ArrayList<String>> all2 = new ArrayList<ArrayList<String>>();
		int ww = 0;
		while(ww<a.length) {
			ArrayList<String> mb = new ArrayList<String>();
			int z = 0;
				while(z<a[0].length) {
					String node = all.get(z);
					int ck = Arrays.asList(a[1]).indexOf(node); // 원시배열을 가상 클래스화하여 indexOf로 위치를 파악(배열번호)
					mb.add(a[ww][ck]);
					
					
//					System.out.println(node);
//					System.out.println(ck);
					z++;
				}
				all2.add(mb); // 최종 결과 데이터를 그룹 순서에 맞게 적용
			ww++;
		}
		
		System.out.println(all2);
	}

}
