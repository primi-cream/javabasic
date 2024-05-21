package oop2;

public class oop_class6 {
	public static void main(String[] args) {
		new oc6_box(50).abc();
	}
}

// extends 하나의 추상클래스 또는 실제 클래스를 로드 할 수 있음
class oc6_box extends ab3{	
	
	public oc6_box(int a) { // class에 즉시실행
		// abstract 내용 : this.number = a;
		super(a);	// super : 외부 클래스에서 로드하는 내용을 그대로 반영   
	}
	
	@Override
	public String product() {
		return null;
	}

	@Override
	public Integer basket() {
		return null;
	}

	public void abc() {
		System.out.println(this.number);
		String to = this.today();	// abstract에 있는 return 메소드를 호출
		System.out.println(to);		// return 값 출력
	}
}
