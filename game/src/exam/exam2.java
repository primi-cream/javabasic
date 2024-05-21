package exam;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		menu me = new menu();
		System.out.println(me.printMenu());
	}

}


class menu {
	Scanner sc = null;
	
	public String printMenu(){
		this.sc = new Scanner(System.in);
		System.out.println("메뉴선택 : 1.커피 2.햄버거 3.콜라 4.피자");
		int menuCh = sc.nextInt();
		String msg = "";
		
		switch(menuCh) {
			case 1 :
				msg = "커피를 신청하였습니다.";
				break;
			case 2 :
				msg = "햄버거를 신청하였습니다.";
				break;
			case 3 :
				msg = "콜라를 신청하였습니다.";
				break;
			case 4 :
				msg = "피자를 신청하였습니다.";
				break;
			default : 
				msg = "해당 메뉴는 SOLD OUT입니다.";
				break;
		}
		
		this.sc.close();
		return msg;
	}
	
}