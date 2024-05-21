package oop;
// 이중반복문
public class oop12 {

	public static void main(String[] args) {
//		for(int i=2; i<10; i++) { // 2~9
//			for(int j=1; j<10; j++) { // 1~9
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//		}
		
//		int num = 5;
//		
//		while(num<8) {
//			int ww = 1;	// while문은 초기화값이 큰 반복문 안에 적용되어 있어야함
//			while(ww < 10) {
//				System.out.println(num + " * " + ww + " = " + num*ww);
//				ww++;
//			}
//			num++;
//			
//		}
		
		// 9단부터 5단
//		int num = 9;
//		do {
//			int w = 1;
//			do {
//				System.out.println(num + " * " + w + " = " + num*w);
//				w++;
//			}while(w<10);
//			num--;
//		}while(num>4);
		
		// 구구단 6단~9단 중 홀수 결과 값에 대한 총 합계를 출력.
		// for문 do-while
		
//		int sum = 0;
//		for(int i=6; i<10; i++) {
//			int j = 1;
//			do {
//				if((i*j)%2!=0)
//					sum+=i*j;
//				
//				j++;
//			}while(j<10);
//		}
//		
//	System.out.println(sum);
		
		// 구구단 2~9단 중 홀수 단만 출력
		// do while, while
		
		int num = 2;
		do {
			int j = 1;
			if(num%2!=0) {				
				while(j<10) {
					System.out.println(num + " * " + j + " = " + num * j);
					j++;
				}
			}
			num++;
		}while(num<10);
		
		

	}

}
