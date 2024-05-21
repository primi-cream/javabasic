package oop;

import java.util.Scanner;

// Scanner + 반복문
public class oop17 {
	public static void main(String[] args) {
//		oop17_box op17 = new oop17_box();
//		op17.abc();
		
		oop17_product pro = new oop17_product();
		pro.product_cal();
		/*
		 * 외부클래스(Product) 이며 Method(product_cal) 코드를 추가
		 * 결과
		 * "사용할 포인트 금액을 입력 : " 
		 * 포인트 입력 후 상품금액에서 사용한 포인트를 뺀 최종 결제 금액을 출력
		 * 상품 금액 : 50000
		 * 50000 - 5000(포인트) = 45000
		 */
	}
}

class oop17_product{
	public void product_cal() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용할 포인트 금액을 입력 : ");
		int use_point = sc.nextInt();
		int product_price = 50000;
		
		System.out.printf("상품 금액은 %d이며 사용포인트는 %d로 결제금액은 %d 입니다.", product_price, use_point, product_price - use_point);
		sc.close();
	}
}


class oop17_box{
	public void abc() { // 가상 입력 라이브러리 
		Scanner sc = new Scanner(System.in);
		// 입력사항에 대한 도움말
		System.out.println("출력할 구구단 숫자 하나를 입력하세요 : ");
		int no = sc.nextInt();
		
		for(int i=1; i<10; i++) { // 반복문
			System.out.printf("%d * %d = %d%n",no ,i ,no*i);
		}
		sc.close(); //라이브러리 종료
	}
}
