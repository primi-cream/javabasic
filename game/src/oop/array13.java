package oop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

// 응용편
/*
 * 다음 배열 데이터를 이용하여 결과와 동일하게 출력 되도록
 * 코드를 작성하시오.
 * 
 * 1번 데이터 : 100, 55, 67, 90, 13, 7
 * 2번 데이터 : 9, 16, 22, 31
 * 
 * 결과
 * [100,90,67, .... ,9,7]
 * 
 */
public class array13 {

	public static void main(String[] args) {
		Integer a[] = {100, 55, 67, 90, 13, 7};
		Integer b[] = {9, 16, 22, 31};

		// or ArrayList에 직접 넣기
		Integer c[] = Stream.concat(Arrays.stream(a),Arrays.stream(b)).toArray(Integer[]::new);

		ArrayList<Integer> d = new ArrayList<Integer>();

		for(int i=0; i<a.length; i++) {
			d.add(a[i]);
		}
		for(int i=0; i<b.length; i++) {
			d.add(b[i]);
		}
		
		System.out.println(Arrays.asList(d));
		
		Arrays.sort(c);
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println(Arrays.toString(c));
		
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(a));
		ArrayList<Integer> al3 = new ArrayList<Integer>(Arrays.asList(b));
		
		al2.addAll(al3); // 중복제거가 되지않음.
		Collections.sort(al2,Collections.reverseOrder());
		System.out.println(al2);
		
		/*
		 * 응용문제
		 * 다음 배열 데이터를 확인 후 홀수 데이터만 출력을 해야합니다.
		 * 단, 홀수 데이터는 올림차순 정렬로 결과가 출력 되도록 코드를 작성
		 * 
		 * 10,16,9,7,31,45,27,94,86,87,112,100,3
		 * 
		 * 결과
		 * 3,7,9,27,31,45,87
		 *
		 * 
		 */
		
		
	}

}
