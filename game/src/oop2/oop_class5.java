package oop2;
// class + class
public class oop_class5 {

	public static void main(String[] args) {
		b_class bc= new b_class();
		bc.aaa("홍길동",01032234567);
	}

}


class a_class{	// 실제문법이 작성
	String user = "";
	Integer tel = 0;
	
	public void aaa(String nm, Integer no){
		this.user = nm;
		this.tel = no;
		System.out.println();
	}
}


class b_class extends a_class{ // 상속을 받는 class
	@Override
	public void aaa(String nm, Integer no) {
		super.aaa(nm, no);
	}
}