package oop2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
// 
public abstract class ab3 {
	int number = 0;
	public ab3(int a) {	// 즉시실행
		this.number = a;
	}
	public abstract String product();	// 문자열 메소드
	public abstract Integer basket();	// 숫자열 메소드
	public void pay() {	// void 메소드
		
	};
	
	
	
	
	//현재 시간출력
	public String today() {
		Date day = new Date();
		// yyyy: 년 MM: 월 dd: 일
		// HH(hh) : 시 mm : 분 ss : 초
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");	
		//a:AM,PM을 표시하는 인자값
		
//		SimpleDateFormat sim = new SimpleDateFormat("EEEEE",Locale.ENGLISH); // 요일
		// Locale : 언어셋을 변경할 때 사용하는 라이브러리
//		System.out.println(sim.format(day));
		return sim.format(day);
	}
}
