package oop2;
//inter1, inter2 연계
public class oop_class7 {

	public static void main(String[] args) {
		op7_box op = new op7_box();
		op.point();
	}
}

// interface를 직접 class 파일에 사용하지 못함
// implements : interface 로드 할 때 사용함
// interface는 한개 이상 .java 파일을 로드 할 수 있습니다.
class op7_box implements inter1,inter2_2{	//interface에 extends를 적용해서 가져옴

	// inter2 메소드
	@Override
	public void money() {
		
	}
	
		
	@Override
	public void point() {
		System.out.println(this.p);
	}
	
	
	//default 메소드는 사용 유/무로 나누어집니다.


	@Override	//@Override 추상 클래스와 동일하게 사용합니다.
	public String names() {
		return null;
	}

	@Override	//super도 동일하게 사용됩니다.
	public void setbox(String id) {
		// TODO Auto-generated method stub
		inter1.super.setbox(id);
	}

	@Override
	public Integer age() {
		return null;
	}
	
}

