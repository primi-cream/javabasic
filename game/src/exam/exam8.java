package exam;

import java.util.*;

public class exam8 {

	public static void main(String[] args) {
		new exam8_menu();
	}

}

class exam8_menu{
	Scanner sc = null;
	
	public exam8_menu() {
		sc = new Scanner(System.in);
		String[] menuName = {"콜라","커피","아이스크림"};
		int[] price = {3000,1500,500};

		System.out.println("[메뉴선택]");
		
		for(int i=0; i < menuName.length; i++) {
			System.out.print( (i+1) + "." + menuName[i] + " ");			
		}
		System.out.print(": ");
		int chMenu = sc.nextInt();
		System.out.print("해당 메뉴의 갯수를 입력 : ");
		int no = sc.nextInt();
//		System.out.println("총 결제 금액 : " + (price[Arrays.asList(menuName).indexOf(menuName[chMenu-1])]*no));
		System.out.println("총 결제 금액 : " + (price[chMenu-1]*no));
		sc.close();
	}
	
	
}