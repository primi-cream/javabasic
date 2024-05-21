package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class array12 {

	public static void main(String[] args) {
		// Collections.sort : 정렬 (오름차순, 내림차순)
		// Collections.reverseOrder():내림차순일 경우 사용
		
		Integer data[] = {3,6,1,9,8,7,10,2};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(data));
		System.out.println(al); // 정렬이 안된 배열값
		
		Collections.sort(al); // 오름차순 정렬방식
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al); // 내림차순
		
		String user[] = {"최하영","이윤석","김단희","하현수","김지현"};
		
		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(user));
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println(al2);
		Collections.sort(al2, Collections.reverseOrder());
		System.out.println(al2);

		// 원시배열 데이터 정렬 (Arrays.sort)
		Integer adata[] = {5,10,3,1,7,6,2};
		
		Arrays.sort(adata);
		System.out.println(Arrays.toString(adata));
		Arrays.sort(adata, Collections.reverseOrder()); // 내림차순
		System.out.println(Arrays.toString(adata));
		Collections.sort(Arrays.asList(adata));
		Collections.sort(Arrays.asList(adata), Collections.reverseOrder());
		System.out.println(Arrays.asList(adata) + "test");
		
		// 메모리 할당 클래스 배열(5518개 배열값) default
		// 메모리 핸들링 가능
//		ArrayList<Integer> al2 = new ArrayList<Integer>();
//		int w = 0;
//		
//		while(w <= 5518) { // 5518 - 메모리 할당 오버
//			al2.add(w);
//			w++;
//		}
//		System.out.println(al2);
		
		
		
	}

}
