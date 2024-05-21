package oop2;
// 배열 : 데이터배열, key가 존재하는 배열
import java.util.*;

// ArrayList, LinkedList : class , Map : Interface
// Map Class 배열 => (key:value)
// Map (HashMap, Hashtable, TreeMap = 모두 Class)
// HashMap -> ArrayList -> LinkedList
public class map1 {
	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("product", "모니터");
		map1.put("product", "키보드");	// 중복된 키를 사용시 해당 값이 변경됨
		map1.put("product2", "마우스");
		System.out.println(map1);
		System.out.println(map1.get("product")); // 등록된 키를 이용하여 데이터를 출력
		System.out.println(map1.keySet()); // 등록된 키 현황
		
		
	}
}
