package exam;

import java.util.Scanner;

// menu_interface.java 연계
/*
 * 응용문제 3
 * 메뉴를 주문하는 프로세서를 interface로 작성을 합니다.
 * 다음과 같이 진행됩니다.
 * 
 * "메뉴를 선택해 주세요 [1.돈까스, 2.함박스테이크, 3.냉면, 4.콩국수]:"
 * 해당 메뉴 외에 숫자를 입력시 "메뉴에 없는 코드 입니다." 출력 후
 * 프로세서는 종료(System.exit(0))
 * 
 * 메뉴설명
 * 돈까스 : 9000, 약간 매운맛, 우동
 * 함박스테이크 : 14500, 담백한 맛, 야채튀김
 * 냉면 : 10000, 새콤달콤한 맛 
 * 콩국수 : 4800, 달콤한 맛, 서리태콩국수
 */
public class ex24 {
	public static void main(String[] args) {
		System.out.print("메뉴를 선택해 주세요 [1.돈까스, 2.함박스테이크, 3.냉면, 4.콩국수]:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		sel(num);
		
		sc.close();
	}
	
	private static void sel(int no) {
		String[][] description = {
				{"돈까스","9000","약간 매운맛", "우동"},
				{"함박스테이크","14500","담백한 맛", "야채튀김"},
				{"냉면","10000","새콤달콤한 맛"},
				{"콩국수","4800","달콤한 맛","서리태콩국수"}
		};
		
		switch(no) {
			case 1 : 
				menu_interface don = new ex24_don(description[no-1][no-1],Integer.parseInt(description[no-1][no]),description[no-1]);
				System.out.println(don.menuName());
				break;
			case 2 : 
				menu_interface stake = new ex24_stake("함박스테이크",14500,description[no-1]);
				System.out.println(stake.menuName());
				break;
			case 3 : 
				menu_interface cold_nudle = new ex24_cold_nudle("냉면",10000,description[no-1]);
				System.out.println(cold_nudle.menuName());
				break;
			case 4 : 
				menu_interface bean = new ex24_bean("콩국수",4800,description[no-1]);
				System.out.println(bean.menuName());
				break;
			case 0 : 
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			default : 
				System.out.println("메뉴에 없는 코드입니다.");
				break;
		}
	}
}

class ex24_don implements menu_interface{
	
	private String menu;
	private int price;
	private String[] description;
	
	ex24_don(String name, int price, String[] description){
		this.menu = name;
		this.price = price;
		this.description = description;
	}
	
	
	@Override
	public String menuName() {
		return this.menu;
	}
	@Override
	public int price() {
		return this.price;
	}
	@Override
	public String[] propertys() {
		return this.description;
	}
}

class ex24_stake implements menu_interface{
	private String menu;
	private int price;
	private String[] description;
	
	ex24_stake(String name, int price, String[] description){
		this.menu = name;
		this.price = price;
		this.description = description;
	}
	
	@Override
	public String menuName() {
		return this.menu;
	}
	@Override
	public int price() {
		return this.price;
	}
	@Override
	public String[] propertys() {
		return this.description;
	}
}

class ex24_cold_nudle implements menu_interface{
	private String menu;
	private int price;
	private String[] description;
	
	ex24_cold_nudle(String name, int price, String[] description){
		this.menu = name;
		this.price = price;
		this.description = description;
	}
	
	@Override
	public String menuName() {
		return this.menu;
	}
	@Override
	public int price() {
		return this.price;
	}
	@Override
	public String[] propertys() {
		return this.description;
	}
}

class ex24_bean implements menu_interface{
	private String menu;
	private int price;
	private String[] description;
	
	ex24_bean(String name, int price, String[] description){
		this.menu = name;
		this.price = price;
		this.description = description;
	}
	
	@Override
	public String menuName() {
		return this.menu;
	}
	@Override
	public int price() {
		return this.price;
	}
	@Override
	public String[] propertys() {
		return this.description;
	}
}