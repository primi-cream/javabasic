package oop2;
// 외부 클래스 throws 메소드 응용편
public class ex6 {

	public static void main(String[] args) {
		ex6_box ex = new ex6_box();
		try {		//throws method 이용
			ex.abc("123");
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}


class ex6_box{
	public void abc(String a) throws Exception,NumberFormatException {
		//코드 에러 발생
		int k = Integer.valueOf(a) + Integer.valueOf("200a");
		
		//throw는 예외처리가 발생되면, 상대방에게 에러 코드를 전송하며 재전송을 요청
		Exception ep  = new Exception();	// Exception Library
		throw ep;	// 코드의 가장 아래에 적용하게 되며, throw = return과 비슷한 성격을 가짐
		// 예외처리 결과에 대한 값을 호출한 메소드로 다시 return 시킴
	}
}