package oop;
/*
 * 1
 * 외부 class를 이용하여 해당 조건에 맞는 결과를 출력하는 코드를 작성하시오.
 * 
 * 숫자 33, 42, 82 를 모두 곱하여 해당 결과값이 짝수 인지 홀수 인지를 출력하시오.
 * 
 * 
 */
public class oop7 {

	public static void main(String[] args) {
		oop7_result re = new oop7_result();
		System.out.println(re.n(33, 42, 82));
	}
}


class oop7_result {
	public String n(int a, int b, int c) {
		
		int result = a*b*c;
		String msg = "";
		
		if(result%2 == 0) {
			msg = "짝수입니다.";
		} else {
			msg = "홀수입니다.";
		}
		return msg;
		 
	}
}