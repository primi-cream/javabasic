package oop;
//while문
public class oop9 {

	public static void main(String[] args) {
		int w = 1; // 시작값
		
//		while(w<10){ // 범위값
//			System.out.println(w);
//		 	w++; // 증가 or 감소
//		}
		
		//if + while문
		/*
		 * while문과 if문을 이용
		 * 구구단 6단을 출력합니다. 단, 결과가 40이상이 되었을 경우
		 * 강제로 반복문이 종료됩니다.
		 */
		
		
		while(w<10) {
			if((w*6)>=40) {
				break;
			}
//			System.out.println("6 * " + w + " = " + 6*w);
			w++;
		}
		
		int aa = 1;
		while(true) {
			System.out.println(aa);
			aa++;
		}
	}

}
