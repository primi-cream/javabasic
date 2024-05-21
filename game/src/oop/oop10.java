package oop;
// do while
public class oop10 {

	public static void main(String[] args) {
		//15~10 역순출력
		
		int num = 15;
		
		do {
//			System.out.println(num);
			num--;
		}while(num>=10);

		
		/*
		 * do while 1~10 모두 더한 값 출력
		 * 
		 * 
		 */
		
		int n = 1;
		int sum = 0;
		
		do {
			sum+=n;
			n++;
		}while(n<11);

//		System.out.println(sum);
		
		
		
		/*
		 * 구구단 3단 중 결과값이 짝수 모든 값과 홀수 모든 합계를 각각 출력
		 * 
		 */
		
		int i = 1;
		int evenSum = 0;
		int iSum = 0;
		
		do {
			if((i*3)%2 == 0) {
				evenSum += (i*3);
			} else {
				iSum += (i*3);
			}
			i++;
		}while(i<10);
		
//		System.out.println("짝수 합계 : " + evenSum + " 홀수 합계 : " + iSum);
		
		int aa = 1;
		do {
			System.out.println(aa);
			aa++;
		}while(true);
	}

}
