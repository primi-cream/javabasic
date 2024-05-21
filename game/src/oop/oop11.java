package oop;
// 반복문을 이용한 응용편
public class oop11 {

	public static void main(String[] args) {
		/*
		 * 무한루프를 이용하여 50이하까지만 반복문이 작동되면 1~50까지 모든 합계 출력
		 * while문 이용
		 * 
		 */

		
//		int sum = 0;
//		int i = 1;
//		
//		while(true) {	
//			sum+=i;
//			i++;
//			if(i>50)
//				break;			
//		}
//		
//		System.out.println(sum);
		
		
		/*
		 * 1부터시작 무한루프 발생 
		 * 그 중 70~79 합계 출력
		 * 
		 */
		
		int sum = 0;
		
		for(int i=1;;i++) {
			
			if(i>=70 && i <80)
				sum+=i;
			
			if(i>79)
				break;
		}
		
		System.out.println(sum);
		
		
		
	}

}
