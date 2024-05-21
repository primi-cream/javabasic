package oop2;

import java.util.ArrayList;
import java.util.List;

// ab2.java 연계 - 추상클래스 응용편
public class oop_class4 {

	public static void main(String[] args) {
		op4_box op4 = new op4_box();	
		System.out.println("총 합계 : " + op4.sum(op4.start()));
	}

}


class op4_box extends ab2{
	
	@Override
	public ArrayList<String> data() {
		return null;
	}
	
	@Override	// abstract 강제 메소드 호출
	public void userinfo(String id, String pass) {
		
		
	}
	
	@Override
	public List<Integer> start() {
		li = new ArrayList<Integer>();
		int count = 0;
		do {
			System.out.print((count+1) + "번째 숫자 입력 : ");
			li.add(sc.nextInt());
			count++;				
		}while(count < 10);
		this.sc.close();
		return super.start();
	}
	
	@Override
	public int sum(List<Integer> numbers) {
		for(Integer num : numbers) {
			total+=num;
		}
		return super.sum(numbers);
	}
}