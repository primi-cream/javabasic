package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam9 {

	public static void main(String[] args) {
		new exam9_box();
	}

}


class exam9_box{
	String[] info = {"아이디", "패스워드", "고객명", "이메일"};
	Scanner sc = null;
	ArrayList<ArrayList<String>> users = new ArrayList<ArrayList<String>>();
	ArrayList<String> signInfo = null;
	
	public exam9_box() {
		 
		sc = new Scanner(System.in);
		
		int w = 0;
		do{
			System.out.println("[간편회원가입 실행]");
			signInfo = new ArrayList<String>();
			for(String question : info) {
				System.out.printf("%s 입력하세요 : ", question);
				String txt = sc.nextLine();  
				signInfo.add(txt);
			}
			w++;
			users.add(signInfo);
			System.out.println(users);
		}while(true);
//		sc.close();
	}
}