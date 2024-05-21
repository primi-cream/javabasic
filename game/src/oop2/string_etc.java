package oop2;
// String, StringBuilder, StringBuffer
public class string_etc {
	public static void main(String[] args) {
		// 같은 자료형 또는 자료형 클래스라고 할지라도 new가 붙은 상황이면
		// 인스턴스 영역(메모리)으로 변경되므로 비교하는 상황이 달라질 수 있음
		
		String a = "a1234";
		String b = "a1234";
		String c = new String("a1234");
		String d = new String("a1234");
				
		/*
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a == c);
		System.out.println(a.equals(c));
		System.out.println(c == d);
		*/
		// StringBuffer, StringBuilder : Multi-Thread이용
		
		// Multi Thread가 빠름 Single Thread에서는 느리지만 안정성은 좋음
		StringBuffer sb = new StringBuffer();
		sb.append("홍길동");
		sb.append("님 환영합니다.");
		System.out.println(sb);
		
		//  Single Thread가 빠름	안정성이 떨어짐(Loss 발생위험 10000건 기준 0.1%가량)
		StringBuilder sb2 = new StringBuilder();
		sb2.append("이순신");
		sb2.append("포인트는 5000");		
		System.out.println(sb2);
		
	}
}
