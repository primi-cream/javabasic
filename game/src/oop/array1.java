package oop;

import java.util.Arrays;

//배열 생성 및 출력방법 (1차 배열) - 원시배열, 클래스 배열
public class array1 {

	public static void main(String[] args) {
		// 원시배열
		int a[] = {1,2,3,4,5};
		int[] b = {10,20,30,40,50};
		
		System.out.println(a.length); // 원시배열 갯수
		System.out.println(b[3]); // 배열 출력 방법 배열번호 0 부터 시작
	 	System.out.println(a[4]); 
	 	String c[] = {"홍길동", "이순신", "강감찬"}; // 문자 배열
	 	System.out.println(c[1]);
	 	// Arrays 배열 클래스를 이용하여 문자화하여 배열로 출력
	 	System.out.println(Arrays.toString(b)); // 파싱
	 	
	 	// 배열에 값을 삽입
	 	int data[] = new int[4]; // 빈배열이며, 4개의 데이터를 입력받음
	 	data[0] = 100;
	 	data[1] = 200;
	 	// data[2] = 300; => 해당 배열에 값을 미입력 숫자 0으로 처리
	 	data[3] = 400;
	 	// data[4] = 500; => 배열크기를 넘겨 error 처리
	 	System.out.println(Arrays.toString(data));
	 	
	 	String userlist[] = new String[2]; // 2개의 데이터
	 	userlist[1] = "이순신";	// 해당 배열에만 데이터를 삽입
	 	System.out.println(Arrays.toString(userlist));
	 	// 문자 빈 배열값은 null로 처리
	 	
	 	// 복합배열 Object(숫자, 실수, 문자)
	 	Object list[] = {"홍길동", 25, "이순신", 30};
	 	System.out.println(Arrays.toString(list));
	}

}
