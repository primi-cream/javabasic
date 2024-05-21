package oop2;

import java.util.Hashtable;

// HashTable 사용법
public class map3 {

	public static void main(String[] args) {
		// Hashtable : 데이터 병렬처리 및 Thread
		// Hashmap : 단일처리 및 Single Thread
		Hashtable<Integer, String> all = new Hashtable<Integer, String>();
		all.put(0, "HTML");
		all.put(1, "CSS");
		all.put(2, "JS");
		all.put(3, "JS");
//		all.put(4, null);	// HashMap은 가능하지만 HashTable은 runtime 에러
		System.out.println(all);
		System.out.println(all.get(0));
		
		int w = 0;
		
		while(w < all.keySet().size()) {	// 키 갯수만큼 반복문을 이용하여 데이터 출력
			System.out.println(all.get(w));
			w++;
		}
		
//		while(all.hashCode()) {
//			
//		}
	}

}
