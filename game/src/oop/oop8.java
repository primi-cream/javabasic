package oop;
// 반복문 for
public class oop8 {

	public static void main(String[] args) {
		oop8_for oop8 = new oop8_for();
		oop8.abc();

	}

}



class oop8_for{
	public void abc() {
		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			break; // 반복문 강제종료
		}
		
		for(int i=5; i>0; i--) {
//			System.out.println(i);
		}
		
		for(int i=1; i<10; i++) {
//			System.out.println("8 * " + i + " = " + 8*i);
//			System.out.printf("8 * %d = %d%n",i ,8*i);
		}
		
		// 응용문제 반복문 + if
		// 1~20까지 숫자 중 5의 배수만 출력
		for(int i=1; i<=20; i++) {
//			if(i%5 == 0) {
//				if(i>=10)
//					break;
//				System.out.println(i);
//			}
		}
		for(int i=1;;i++) {
			if(i>50) {
				break;
			}
//			System.out.println(i);
		}

		for(int i=1; i<=20; i++) {
			if(i == 10 || i == 13 || i == 17) {
//				continue; 
			}
			System.out.println(i);
			
		}
			
		
	}
}