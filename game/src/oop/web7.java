package oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

// LinkedList로 원시배열을 가공하기
public class web7 {

	public static void main(String[] args) {
		
		wb7_box wb = new wb7_box();
		
	}

}


class wb7_box{
	
	String product[][] = null;
	String money[] = null;
	Scanner sc = new Scanner(System.in);
	
	public wb7_box() {
		this.product = new String[][] { 
				{ "쿠첸 브레인 IH 전기압력밥솥", "누벨르 디지털 미니 전기밥솥", "제니퍼룸 마카롱 전기밥솥 화이트", "쿠쿠 트윈프레셔밥솥" },
				{ "4인용", "3~4인용", "3인용", "1~2인용" }, 
				{ "199500", "31650", "357910", "283000" } 
		};
//		this.abc(); // Method abc call (1차배열 연습용)
		this.bbb();
	}
	
	public void abc() {
		// 사용자가 금액을 입력합니다.
		// 단, 문자로 0을 입력시 반복문은 종료됩니다.
		// 그 외에 입력되는 사항은 LinkedList 배열에 모두 기록되어야 합니다.
		// [결과]
		// "금액을 입력하세요 : 5000"
		// "금액을 입력하세요 : 6000"
		// "금액을 입력하세요 : 12000"
		// "금액을 입력하세요 : 0"
		// "입력된 금액의 총 리스트 출력 : [5000,6000,15000]" => [15000,6000,5000]"
		
		LinkedList<String> ls = new LinkedList<String>();
				
		
		do {
			System.out.print("금액을 입력하세요 : ");
			String number = sc.nextLine();
			
			if(number.equals("0"))
				break;
			
//			ls.add(number);
//			ls.add(0,number);
			ls.addFirst(number); // addFirst : node번호 첫번째 삽입
//			ls.addLast(number); // addLast : node번호 마지막 삽입
			
		}while(true);
	
		sc.close();
		System.out.println("입력된 금액의 총 리스트 : " + ls);
		System.exit(0);
//		for(String b : ls) {
//			System.out.println("입력된 금액의 총 리스트 : " + b);
//		}
	}
	
	public void bbb() {
		// [쿠첸,4인용,199500] ....
		LinkedList<ArrayList<String>> ls = new LinkedList<ArrayList<String>>();
		
		for(int i=0; i<product[0].length; i++) {
			ArrayList<String> pd1 = new ArrayList<String>();	
			for(int j=0; j<product.length; j++) {
				pd1.add(this.product[j][i]);
			}
			ls.add(pd1);
		}
//		System.out.println(ls);
		System.out.print("상품명을 검색 하세요 : ");
		String search = this.sc.nextLine();
		int w = 0;
		while(w < ls.size()) {
			
			int ck = ls.get(w).get(0).indexOf(search);
			if(ck >= 0) {
				System.out.printf("%s 가격 : %s%n",ls.get(w).get(0),ls.get(w).get(2));
			} else {
				System.out.println("검색하신 상품은 찾을 수 없습니다.");
				break;
			}
			w++;
		}
		this.sc.close();
		
	}
	
	
}


