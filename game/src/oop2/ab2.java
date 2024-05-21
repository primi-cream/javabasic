package oop2;
// 응용편 - oop_class4.java 연계

import java.util.*;

public abstract class ab2 {
	Scanner sc = new Scanner(System.in);
	List<Integer> li = null;
	Integer total = 0; 
	
	public abstract ArrayList<String> data();
	public abstract void userinfo(String id, String pass); // 사용자 정보 필수사항 메서드
	
	
	public List<Integer> start(){	
		return li;
	}
	
	public int sum(List<Integer> numbers) {
		return this.total;
	}
}
