package oop2;

import java.util.ArrayList;

//import java.util.Scanner;

public class oop_class3 {

	public static void main(String[] args) {
		new oc3_box().ab_methd1("유관순");
		new oc3_box().ab_methd1();
	}

}


class oc3_box extends ab1{
	
	@Override
	public void ab_methd1() {
		System.out.println(this.level);
	}
	
	@Override
	public void ab_methd1(String uid) {
		this.userid = uid;
		System.out.println(this.userid);
		System.out.println("사용자 이름을 입력하세요 : ");
		String username = this.sc.nextLine();
		System.out.println(username);
		this.sc.close();
		this.all = new ArrayList<String>();
		this.all.add("HTML");
		System.out.println(this.all);
	}
}