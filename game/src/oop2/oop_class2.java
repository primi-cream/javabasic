package oop2;

public class oop_class2 {

	public static void main(String[] args) {
		oc1_box ob = new oc1_box();
		ob.age = 65; // protected 선언 변수형
		ob.abc();
		
		oc2_box ob2 = new oc2_box();	//추상 클래스 포함
		ob2.aaa();
		String result = ob2.bbb();
		System.out.println(result);
		ob2.ccc();
	}

}

// 추상 클래스 생성
// 주의사항 : 코드를 이미 진행 시 해당 추상 메소드 이름 변경 시 상속받은 모든 클래스 문제 발생
abstract class ab_box1{
	public void aaa() {//추상
		
	}
	
	public String bbb() { //추상
		return null; //추상
	}
	
	public void ccc1() {
		
	} // 해당 추상 메소드를 사용하지 않음
}

// 일반 class
class oc2_box extends ab_box1{	//extends 상속 클래스
	@Override // 상속된 메소드를 호출
	public void aaa() {
		System.out.println("aaa");
		super.aaa();
	}
	@Override
	public String bbb() {
		String user = "강감찬";
		return super.bbb();
	}	
	//Overloading 상속받는 메소드 외에 추가로 메소드를 생성
	//추상 클래스에 선언하지 않은 메소드 이름
	public void ccc() {
		System.out.println("ccc 오버로딩 호출");
	}
}