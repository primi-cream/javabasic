package oop2;
/*
 * 응용문제
 *  45 * 3 + 16 + 5 + 22 * 8 해당 계산된 최종값을 외부 클래스에
 * 	전송합니다.
 * 
 * 	해당 외부 클래스에서 짝수일 경우 예외 오류를 발생시킵니다.
 * 	단, 홀수일 경우 "홀수값입니다." 라는 결과값을 return으로 보냅니다.
 * 	최종 메인 메소드에서 결과값을 출력시키는 코드를 작성하시오.
 * 
 */
public class ex9 {
	public static void main(String[] args) {
		ex9_box ex = new ex9_box();
		
		try {
			System.out.println(ex.abc2(45 * 3 + 16 + 5 + 22 * 8));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}



class ex9_box{
	
	public String abc2(int total) throws Exception {
		String msg = "";
		
		try {
			if(total%2 == 0) {
				throw new Exception("올바르지 않은 값입니다.");
			} else {
				msg = "홀수값입니다.";
			}
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		return msg;
	}
	
	
	
	
	
	
	
	
	public String abc(int a) throws Exception{
		String msg = "";
		
		try {
			if(a%2 != 0) {
				msg = "홀수입니다.";
			} else {
//				Exception ex = new Exception("예외처리 발생함 해당 결과 짝수값 입니다.");
//				throw ex; // 강제 catch 실행
				throw new Exception("예외처리 발생함 해당 결과 짝수값 입니다.");
			}
		} catch (Exception e) {
			throw e;
		}
		return msg;
	}
}