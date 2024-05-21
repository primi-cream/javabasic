package oop2;

import java.util.*;

// 추상 클래스 선언 및 생성
public abstract class ab1 {
	String userid = null;	// 추상 클래스 전역변수
	Scanner sc = new Scanner(System.in);	// 추상 클래스에 Libary 호출
	List<String> all = null;
	final int level = 1; // 전역변수 값을 고정으로 필요할 경우 선언
	
	public void ab_methd1() {};
	public void ab_methd1(String uid) {};
	public void ab_methd1(int level) {};
	
}
