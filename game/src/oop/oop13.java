package oop;
// import : 외부 클래스 또는 라이브러리를 가져올 때 출력되는 코드 
import java.util.Scanner;

// java에서 기본적으로 제공되는 Scanner를 이용합니다. (Libary) 
public class oop13 {

	public static void main(String[] args) {
		//사용자가 입력하는 가상의 입력창
		Scanner sc = new Scanner(System.in); // System.in 값을 입력
		System.out.print("아이디를 입력하세요 : ");
		String mid = sc.nextLine(); 
		// 사용자가 입력한 값을 mid라는 변수에 적용 next()는 스페이스 입력 시 단어 전체 데이터를 받지 못함
		// nextLine()은 모두 받음
		System.out.println(mid); // 입력한 값을 출력하는 코드
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt(); // 숫자 받음
		System.out.println(age);
		System.out.print("email을 입력하세요 : ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.println(email);
		sc.close(); // Libary 종료 (닫지 않을 경우 정크메모리가 쌓여 서버에 무리가 감)
	}

}
